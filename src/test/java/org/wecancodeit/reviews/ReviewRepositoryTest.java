package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    ReviewRepository underTest;

    private Review reviewOne = new Review(1L, "review one name", "description", "category ", "review one", "google.com");
    private Review reviewTwo = new Review(2L, "review two name", "description", "category ", "review one", "google.com");

    @Test
    public void shouldFindReviewOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindAllReviews(){
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewTwo, reviewOne);
    }


}
