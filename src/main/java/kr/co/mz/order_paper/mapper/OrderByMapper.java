package kr.co.mz.order_paper.mapper;

import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.entity.OrderByEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderByMapper {

    OrderByEntity toEntity(OrderBy orderBy);
    OrderBy toDto(OrderByEntity orderByEntity);

}
