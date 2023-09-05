package kr.co.mz.order_paper.dto;

import kr.co.mz.order_paper.category.Category;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Place {
    private String name;
    private Integer starRank;
    private Category category;
}
