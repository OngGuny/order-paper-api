package kr.co.mz.order_paper.mapper;

import kr.co.mz.order_paper.dto.OrderPaper;
import kr.co.mz.order_paper.entity.OrderPaperEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderPaperMapper {
    OrderPaperEntity toEntity(OrderPaper orderPaper);
    OrderPaper toDto(OrderPaperEntity orderPaper);


}
