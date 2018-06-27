package repository;

import entity.ReviewEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<ReviewEntity, Long> {

    List<ReviewEntity> findByReviewsCompanyEntityId(Long id);

    List<ReviewEntity> findAll();

    List<ReviewEntity> findByReviewsClientId(Long id);

}
