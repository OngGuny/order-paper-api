package kr.co.mz.order_paper.repository;

import kr.co.mz.order_paper.entity.OrderPaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPaperRepository extends JpaRepository<OrderPaperEntity, Integer> {

}
