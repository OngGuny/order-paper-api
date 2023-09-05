package kr.co.mz.order_paper.repository;

import kr.co.mz.order_paper.entity.OrderByEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderByRepository extends JpaRepository<OrderByEntity, Integer> {
}
