package pe.upc.mathplayopen.review.domain.services;

import pe.upc.mathplayopen.review.domain.model.aggregates.Review;
import pe.upc.mathplayopen.review.domain.model.commads.CreateReviewCommand;
import pe.upc.mathplayopen.review.domain.model.commads.DeleteReviewCommand;
import pe.upc.mathplayopen.review.domain.model.commads.UpdateReviewCommand;

import java.util.Optional;


public interface ReviewCommandService {
    Optional<Review> handle(CreateReviewCommand command);
    void handle(DeleteReviewCommand command);
    Optional<Review> handle(UpdateReviewCommand command);
}
