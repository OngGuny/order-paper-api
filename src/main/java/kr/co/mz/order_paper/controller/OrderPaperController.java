package kr.co.mz.order_paper.controller;

import kr.co.mz.order_paper.dto.Cafe;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Restaurant;
import kr.co.mz.order_paper.service.OrderPaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order-paper")
public class OrderPaperController {

    private final OrderPaperService orderPaperService;
    @GetMapping("/order-from")
    public List<OrderBy> get_OrderBy_List(){//팀원 목록 가져오기
        return orderPaperService.getOrderByList();
    }

    @GetMapping("/restaurant")
    public List<Restaurant> get_Restaurant_List(){// 레스토랑 목록 가져오기.
       return orderPaperService.getRestaurantList();
    }

    @GetMapping("/cafe")
    public List<Cafe> get_Cafe_List(){
        return orderPaperService.getCafeList();
    }

    @PostMapping("/save-restaurant-order")
    public OrderPaper save_Restaurant_Order(@RequestBody OrderPaper orderPaper){
        return orderPaperService.saveRestaurant(orderPaper);
    }

    @PostMapping("/save-cafe-order")
    public OrderPaper save_Cafe_Order(@RequestBody OrderPaper orderPaper){
        return orderPaperService.saveCafe(orderPaper);
    }



    // recommend menu Service


}
