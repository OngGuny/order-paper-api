package kr.co.mz.order_paper.repository;

import kr.co.mz.order_paper.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaceRepository extends JpaRepository<PlaceEntity, String> {
    boolean existsByName(String name);

    Optional<PlaceEntity> findByName(String orderFrom);
}
