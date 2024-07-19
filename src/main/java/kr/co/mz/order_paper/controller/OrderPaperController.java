package kr.co.mz.order_paper.controller;

import java.net.URI;
import java.util.List;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Place;
import kr.co.mz.order_paper.service.OrderPaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-paper")
public class OrderPaperController {

  private final OrderPaperService orderPaperService;

  @GetMapping("/order-by-list")
  public List<OrderBy> get_OrderBy_List() {//팀원 목록 가져오기
    return orderPaperService.getOrderByList();
  }

  @GetMapping("/visited-place")
  public List<Place> get_Place_List() {// 장소 목록 가져오기.
    return orderPaperService.getVisitedPlaceList();
  }


  @PostMapping("/save-order-paper")
  public ResponseEntity<Integer> save_Order(@RequestBody OrderPaper orderPaper) {
    return ResponseEntity.created(
        URI.create("http://localhost:3000/home")
    ).body(
        orderPaperService.saveOrderPaper(orderPaper)
    );
  }

  // recommend menu Service


}
