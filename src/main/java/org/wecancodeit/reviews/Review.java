package org.wecancodeit.reviews;

public class Review {
    private long id;
    private String itemName;
    private String description;
    private String category;
    private String review;
    private String link;

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getReview() {
        return review;
    }

    public String getLink() {
        return link;
    }

    public Review(long id, String itemName, String description, String category, String review, String link) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.review = review;
        this.link = link;

    }

}
