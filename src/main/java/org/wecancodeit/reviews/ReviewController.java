package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage(){
        return "home.html";
    }
    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("modelReviews", reviewRepo.findAll());
        return "reviews";
    }

    @RequestMapping("/review/{id}")
    public String findOneReview(@RequestParam("id") long id, Model model){
        model.addAttribute("modelReview", reviewRepo.findOne(id));
        return "review";
    }
}
