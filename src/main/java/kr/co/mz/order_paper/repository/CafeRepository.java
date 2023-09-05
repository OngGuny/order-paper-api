package kr.co.mz.order_paper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CafeRepository extends JpaRepository<CafeEntity, Integer> {
    boolean existsByName(String name);

    Optional<CafeEntity> findByName(String name);

}
