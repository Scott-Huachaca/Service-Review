package pe.upc.mathplayopen.review.interfaces.transform;

import pe.upc.mathplayopen.review.domain.model.aggregates.Review;
import pe.upc.mathplayopen.review.interfaces.resources.ReviewResource;

public class ReviewResourceFromEntityAssembler {
    public static ReviewResource toResourceFromEntity(Review entity) {
        return new ReviewResource(entity.getId(), entity.getDescription(), entity.getScore());
    }
}

