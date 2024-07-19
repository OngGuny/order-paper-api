package kr.co.mz.order_paper.repository;

import java.util.List;
import java.util.Set;
import kr.co.mz.order_paper.dto.OrderBy;
import kr.co.mz.order_paper.entity.OrderByEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderByRepository extends JpaRepository<OrderByEntity, Long> {

  @Query(value = """
      SELECT new kr.co.mz.order_paper.dto.OrderBy(
       obe.id,
       obe.name,
       obe.position
      )
      FROM OrderByEntity obe
      WHERE obe.id IN :ids
      """)
  List<OrderBy> findAllByIds(Set<Long> ids);
}
