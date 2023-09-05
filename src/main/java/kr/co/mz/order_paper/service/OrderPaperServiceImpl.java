package kr.co.mz.order_paper.service;

import kr.co.mz.order_paper.dto.Cafe;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPaperServiceImpl implements OrderPaperService{

    @Override
    public List<OrderBy> getOrderByList() {
        return null;
    }

    @Override
    public List<Restaurant> getRestaurantList() {
        return null;
    }

    @Override
    public List<Cafe> getCafeList() {
        return null;
    }

    @Override
    public OrderPaper saveRestaurant(OrderPaper orderPaper) {
        return null;
    }

    @Override
    public OrderPaper saveCafe(OrderPaper orderPaper) {
        return null;
    }
}
