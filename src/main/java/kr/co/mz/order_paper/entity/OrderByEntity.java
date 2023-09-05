package kr.co.mz.order_paper.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_by")
public class OrderByEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "position")
    private String position;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "orderByEntity")
    private List<OrderPaperEntity> orderPaperEntityList;

    public OrderByEntity addOrderPaper(OrderPaperEntity orderPaper){
        orderPaperEntityList.add(orderPaper);
        orderPaper.setOrderByEntity(this);
        return this;
    }
}
