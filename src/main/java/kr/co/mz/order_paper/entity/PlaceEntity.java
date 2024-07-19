package kr.co.mz.order_paper.entity;

import jakarta.persistence.*;
import kr.co.mz.order_paper.enums.Category;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "place")
public class PlaceEntity extends BaseShopEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "placeEntity")
    private List<OrderPaperEntity> orderPaperEntityList = new ArrayList<>();


    @Builder
    public PlaceEntity(String name, Integer visitCount, LocalDateTime lastVisitedDate, Double totalStar) {
        this.name = name;
        super.visitCount = visitCount;
        super.lastVisitedDate = lastVisitedDate;
        super.totalStar = totalStar;
    }

    public PlaceEntity addOrderPaper(OrderPaperEntity orderPaper) {
        orderPaperEntityList.add(orderPaper);
        orderPaper.setPlaceEntity(this);
        return this;
    }

    public PlaceEntity addStar(Double star) {
        this.totalStar += star;
        return this;
    }

    public PlaceEntity visit() {
        this.visitCount++;
        return this;
    }

}
