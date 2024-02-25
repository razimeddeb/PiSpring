package tn.esprit.pidev.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entity.Evenement;
import tn.esprit.pidev.entity.Review;
import tn.esprit.pidev.serviceIterface.IEvenementService;
import tn.esprit.pidev.serviceIterface.IReviewService;

import java.util.List;

public class ReviewController {

    IReviewService iReviewService;
    @PostMapping("/addReview")

    public Review addReview(@RequestBody Review review) {
        return iReviewService.addReview(review);
    }
    @GetMapping("/getAllReview")
    public List<Review> retriveReviews() {
        return iReviewService.retriveReviews();
    }
    @PutMapping("/UpdateReview")
    public Review updateReview(@RequestBody Review event) {
        return iReviewService.updateReview(event);
    }
    @GetMapping("/retriveReview/{id_Review}")
    public Review retriveReview(@PathVariable("id_Review") Long idReview) {
        return iReviewService.retriveReview(idReview);
    }
    @DeleteMapping("/removeReview/{id_Review}")
    public void removeReview(@PathVariable("id_Review") Long idReview) {
        iReviewService.removeReview(idReview);
    }
}
