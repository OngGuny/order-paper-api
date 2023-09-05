package kr.co.mz.order_paper.dto;

import lombok.*;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderPaper {

    @NonNull
    private Map<String,String> orderMap;
    @NonNull
    private String orderFrom;

    private List<String> absentList;

}
