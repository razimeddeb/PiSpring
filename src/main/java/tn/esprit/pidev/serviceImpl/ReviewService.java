package tn.esprit.pidev.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.Evenement;
import tn.esprit.pidev.entity.Review;
import tn.esprit.pidev.repository.EvenementRepository;
import tn.esprit.pidev.repository.ReviewRepository;
import tn.esprit.pidev.serviceIterface.IEvenementService;
import tn.esprit.pidev.serviceIterface.IReviewService;


import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService implements IReviewService {
    ReviewRepository reviewRepository;
    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> retriveReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review retriveReview(Long idReview) {
        return reviewRepository.findById(idReview).orElse(null);
    }

    @Override
    public void removeReview(Long idReview) {
        reviewRepository.deleteById(idReview);

    }
}
