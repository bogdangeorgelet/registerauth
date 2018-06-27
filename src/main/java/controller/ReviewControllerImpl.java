package controller;

import api.IReviewController;
import dto.ReviewDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
@CrossOrigin
public class ReviewControllerImpl implements IReviewController {

    @Override
    public ResponseEntity<List<ReviewDto>> listReviewsByCompanyId(Long company_id) {
        return null;
    }

    @Override
    public ResponseEntity<List<ReviewDto>> listReviewsByClientId(Long client_id) {
        return null;
    }

    @Override
    public ResponseEntity<List<ReviewDto>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> createClient(ReviewDto reviewDto, Long company_id, Long user_id, UriComponentsBuilder uriComponentsBuilder) {
        return null;
    }
}
