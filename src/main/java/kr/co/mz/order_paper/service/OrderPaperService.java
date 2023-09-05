package kr.co.mz.order_paper.service;

import kr.co.mz.order_paper.dto.Cafe;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Restaurant;

import java.util.List;

public interface OrderPaperService {


    List<OrderBy> getOrderByList();

    List<Restaurant> getRestaurantList();

    List<Cafe> getCafeList();

    OrderPaper saveRestaurant(OrderPaper orderPaper);

    OrderPaper saveCafe(OrderPaper orderPaper);
}
