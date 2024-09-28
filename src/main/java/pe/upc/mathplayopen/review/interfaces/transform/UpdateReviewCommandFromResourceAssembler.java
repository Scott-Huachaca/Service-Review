package pe.upc.mathplayopen.review.interfaces.transform;

import pe.upc.mathplayopen.review.domain.model.commads.UpdateReviewCommand;
import pe.upc.mathplayopen.review.interfaces.resources.UpdateReviewResource;

public class UpdateReviewCommandFromResourceAssembler {
    public static UpdateReviewCommand toCommandFromResource(Long reviewId, UpdateReviewResource reviewResource) {
        return new UpdateReviewCommand(reviewId, reviewResource.description(), reviewResource.score());
    }
}
