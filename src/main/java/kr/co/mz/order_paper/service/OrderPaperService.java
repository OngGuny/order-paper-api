package kr.co.mz.order_paper.service;

import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Place;

import java.util.List;
import java.util.Optional;

public interface OrderPaperService {


    List<OrderBy> getOrderByList();

    List<Place> getVisitedPlaceList();


    Optional<Place> visitPlace(String restaurant);

    int saveOrderPaper(OrderPaper orderPaper);
}
