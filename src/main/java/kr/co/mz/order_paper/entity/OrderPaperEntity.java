package kr.co.mz.order_paper.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_paper")
public class OrderPaperEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "menu")
    private String orderMenu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_by")
    private OrderByEntity orderByEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private PlaceEntity placeEntity;

}
