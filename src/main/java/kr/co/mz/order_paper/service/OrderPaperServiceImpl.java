package kr.co.mz.order_paper.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.dto.Place;
import kr.co.mz.order_paper.entity.OrderPaperEntity;
import kr.co.mz.order_paper.entity.PlaceEntity;
import kr.co.mz.order_paper.mapper.OrderByMapper;
import kr.co.mz.order_paper.mapper.OrderPaperMapper;
import kr.co.mz.order_paper.mapper.PlaceMapper;
import kr.co.mz.order_paper.repository.OrderByRepository;
import kr.co.mz.order_paper.repository.OrderPaperRepository;
import kr.co.mz.order_paper.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderPaperServiceImpl implements OrderPaperService {

  private final OrderPaperRepository orderPaperRepository;
  private final OrderByRepository orderByRepository;
  private final PlaceRepository placeRepository;

  private final OrderByMapper orderByMapper;
  private final PlaceMapper placeMapper;
  private final OrderPaperMapper orderPaperMapper;

  @Override
  public List<OrderBy> getOrderByList() {
    return orderByRepository
        .findAll()
        .stream()
        .map(orderByMapper::toDto)
        .toList();
  }

  @Override
  public List<Place> getVisitedPlaceList() {
    return placeRepository.findAll()
        .stream()
        .map(placeMapper::toDto)
        .toList();
  }


  @Override
  public Optional<Place> visitPlace(String restaurant) {
    if (placeRepository.existsByName(restaurant)) {
      var restaurantEntity = PlaceEntity.builder()
          .name(restaurant)
          .visitCount(1)
          .lastVisitedDate(LocalDateTime.now())
          .totalStar(1d)
          .build();
      return Optional.of(
          placeMapper.toDto(
              placeRepository.save(restaurantEntity)
          )
      );
    }
    return placeRepository.findByName(restaurant)
        .map(PlaceEntity::visit)
        .map(placeMapper::toDto);
  }

  @Override
  public int saveOrderPaper(OrderPaper orderPaper) {
    var orderMap = orderPaper.getOrderMap();
    var savedCnt = 0;

    for (var entry : orderMap.entrySet()) {
      orderPaperRepository.save(
          OrderPaperEntity.builder()
              .orderMenu(entry.getValue())
              .placeEntity(placeRepository.getReferenceById(orderPaper.getPlace()))
              .ordered_by(entry.getKey())
              .build()
      );
      savedCnt++;
    }

    return savedCnt;
  }


}
