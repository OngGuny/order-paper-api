package kr.co.mz.order_paper.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class OrderPaperServiceTest {
    @Autowired
    private OrderPaperService orderPaperService;

    @Test
    void orderByListTest() {
        var result = orderPaperService.getOrderByList();
        System.out.println(
                result
        );
    }
}
