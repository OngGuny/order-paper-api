package kr.co.mz.order_paper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderBy {

  private Long id;
  private String name;
  private String position;

  public OrderBy(Long id, String name, String position) {
    this.id = id;
    this.name = name;
    this.position = position;
  }
}
