package pe.upc.mathplayopen.review.domain.services;

import pe.upc.mathplayopen.review.domain.model.aggregates.Review;
import pe.upc.mathplayopen.review.domain.model.queries.GetAllReviewsQuery;

import java.util.List;

public interface ReviewQueryService {
    List<Review> handle(GetAllReviewsQuery query);
}
