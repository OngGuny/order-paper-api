package kr.co.mz.order_paper.dto;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderPaper {

  @NonNull
  private Map<String, String> orderMap; // who, menu
  @NonNull
  private String place;

  private List<Long> absentList;

}
