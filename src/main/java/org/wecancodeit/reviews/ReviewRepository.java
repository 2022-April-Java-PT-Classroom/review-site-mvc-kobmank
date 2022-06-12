package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewsList = new HashMap<Long, Review>();

    public ReviewRepository(){
        Review laptop = new Review(1L, "iMac","Fast bootup time, connect seamlessly to iPhones app ", "tech", "3.5*, Depending on the model, it might struggle with dealing with the number of apps that windows has no issue with. ", "/images/laptop.jpg");
        Review androidEarbuds = new Review(2L, "androidEarbuds","buttonless controls that detects touch , up to 2 hours of listening time ", "bluetooth earbuds", "**, I feel like the sound quality erodes exponentially after the first month and becomes defective after 3 months.. ", "/images/samsungbuds.jpg");
        Review appleEarbuds = new Review(3L, "appleEarbuds","noise cancelling, plays audio seamlessly, and up to 5 hours of listening time ", " bluetooth earbuds", "4*, Great for listening to music and doesn't fall out easily.The battery life is not enough for me though. ", "/images/earbuds.jpg");
        Review androidPhone = new Review(4L, "androidPhone","Standard mobile phone with adequate storage size and a large app store ", "phone", "3*, Decent starter phone until you want better features. Luckily, that is what the iPhone is for. There are more apps available on the android store than the apple app store. That is a plus. ", "/images/cellphone.jpg");
        Review applePhone = new Review(5L, "applePhone","Clear resolution, large storage size ", "phone", "4.5*, The best phone on the market. Their os update might make your phone slower if they want to buy a new one!", "/images/iphone.jpg");

        reviewsList.put(laptop.getId(), laptop);
        reviewsList.put(androidEarbuds.getId(), androidEarbuds);
        reviewsList.put(appleEarbuds.getId(), appleEarbuds);
        reviewsList.put(androidPhone.getId(), androidPhone);
        reviewsList.put(applePhone.getId(), applePhone);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
