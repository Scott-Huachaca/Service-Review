package pe.upc.mathplayopen.review.interfaces.transform;

import pe.upc.mathplayopen.review.domain.model.commads.CreateReviewCommand;
import pe.upc.mathplayopen.review.interfaces.resources.CreateReviewResource;

public class CreateReviewCommandFromResourceAssembler {
    public static CreateReviewCommand toCommandFromResource(CreateReviewResource resource) {
        return new CreateReviewCommand(resource.description(), resource.score());
    }
}
