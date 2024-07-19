package kr.co.mz.order_paper.dto;

import kr.co.mz.order_paper.enums.Category;
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
