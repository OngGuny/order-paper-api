package kr.co.mz.order_paper.mapper;

import kr.co.mz.order_paper.dto.Place;
import kr.co.mz.order_paper.entity.PlaceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PlaceMapper {
    Place toDto(PlaceEntity placeEntity);

    PlaceEntity toEntity(Place place);
}
