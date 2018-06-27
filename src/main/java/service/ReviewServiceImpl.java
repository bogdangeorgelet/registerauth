package service;

import entity.ReviewEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ReviewRepository;

import java.util.List;

public class ReviewServiceImpl implements IReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> findReviewByCompanyEntityId(Long company_id) {
        return reviewRepository.findByReviewsCompanyEntityId(company_id);
    }

    @Override
    public List<ReviewEntity> findReviewsByClientId(Long clientId) {
        return reviewRepository.findByReviewsClientId(clientId);
    }


    @Override
    public List<ReviewEntity> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public void saveReview(ReviewEntity reviewEntity) {
        reviewRepository.save(reviewEntity);
    }
}
