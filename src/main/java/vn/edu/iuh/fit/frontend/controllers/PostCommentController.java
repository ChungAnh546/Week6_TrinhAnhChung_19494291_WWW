package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class PostCommentController {
    @GetMapping("/")
    public String index()
    {
        return "";
    }
}
