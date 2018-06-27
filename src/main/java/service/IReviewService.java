package service;

import entity.ReviewEntity;

import java.util.List;

public interface IReviewService {

    List<ReviewEntity> findReviewByCompanyEntityId(Long company_id);

    List<ReviewEntity> findReviewsByClientId(Long clientId);

    List<ReviewEntity> getAllReviews();

    void saveReview(ReviewEntity reviewEntity);

}
