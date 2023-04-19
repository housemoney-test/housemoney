package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostsController {
    
    @Autowired
    private GetAllPostsService getAllPostsService;
    
    //一覧ページ取得
    @GetMapping
    public String index(Model model) {
        List<Post> posts = getAllPostsService.getAllPosts();
        model.addAttribute("posts", posts);
    }
    //投稿
    @PostMapping("/create")
    public String create(Model model) {
        model.addAttribute("form", new CreatePostForm());
        return "/posts/create";
    }
}
