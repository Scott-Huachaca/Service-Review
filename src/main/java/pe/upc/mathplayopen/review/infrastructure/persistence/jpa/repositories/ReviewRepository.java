package pe.upc.mathplayopen.review.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.mathplayopen.review.domain.model.aggregates.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
}
