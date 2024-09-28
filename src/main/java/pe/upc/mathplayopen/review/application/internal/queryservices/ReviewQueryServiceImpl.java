package pe.upc.mathplayopen.review.application.internal.queryservices;


import org.springframework.stereotype.Service;
import pe.upc.mathplayopen.review.domain.model.aggregates.Review;
import pe.upc.mathplayopen.review.domain.model.queries.GetAllReviewsQuery;
import pe.upc.mathplayopen.review.domain.services.ReviewQueryService;
import pe.upc.mathplayopen.review.infrastructure.persistence.jpa.repositories.ReviewRepository;

import java.util.List;

@Service
public class ReviewQueryServiceImpl implements ReviewQueryService {

    private final ReviewRepository reviewRepository;

    public ReviewQueryServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> handle(GetAllReviewsQuery query) {
        return reviewRepository.findAll();
    }

}
