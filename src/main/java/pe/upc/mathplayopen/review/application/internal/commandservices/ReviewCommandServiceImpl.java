package pe.upc.mathplayopen.review.application.internal.commandservices;

import org.springframework.stereotype.Service;
import pe.upc.mathplayopen.review.domain.model.aggregates.Review;
import pe.upc.mathplayopen.review.domain.model.commads.CreateReviewCommand;
import pe.upc.mathplayopen.review.domain.model.commads.DeleteReviewCommand;
import pe.upc.mathplayopen.review.domain.model.commads.UpdateReviewCommand;
import pe.upc.mathplayopen.review.domain.services.ReviewCommandService;
import pe.upc.mathplayopen.review.infrastructure.persistence.jpa.repositories.ReviewRepository;

import java.util.Optional;

@Service
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final ReviewRepository reviewRepository;

    public ReviewCommandServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Optional<Review> handle(CreateReviewCommand command){
        var review = new Review(command);
        reviewRepository.save(review);
        return Optional.of(review);
    }

    @Override
    public Optional<Review> handle(UpdateReviewCommand command){
        var result = reviewRepository.findById(command.id());
        var reviewToUpdate = result.get();
        var updateReview = reviewRepository.save(reviewToUpdate.UpdateReview(command.description(),command.score()));
        return Optional.of(updateReview);
    }

    @Override
    public void handle(DeleteReviewCommand command){
        reviewRepository.deleteById(command.reviewId());
    }

}
