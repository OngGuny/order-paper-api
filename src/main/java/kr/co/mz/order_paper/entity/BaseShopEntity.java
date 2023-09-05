package kr.co.mz.order_paper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
@Setter
@Getter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class BaseShopEntity {

    @Column(name = "visit_count")
    protected Integer visitCount;
    @LastModifiedDate
    @Column(name = "last_visited_date")
    protected LocalDateTime lastVisitedDate;

    @Column(name = "total_star")
    protected Double totalStar;

    public Double getStarGrade(){
        return totalStar/visitCount;
    }

}
