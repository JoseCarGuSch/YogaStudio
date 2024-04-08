package com.yogastudio.controller;

import com.yogastudio.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class PostController {

    public List<Post> getPosts(){
        ArrayList<Post> post = new ArrayList<>();
                /*Post 1*/
                post.add(new Post(1, "Adentrate en el yoga y la meditación explora un mayor nivel de relajación y paz interior.",
                        "https://images.unsplash.com/photo-1506126613408-eca07ce68773?q=80&w=1999&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        new Date(), "Descubre tu Paz Interior"));
                /*Post 2*/
                post.add(new Post(1, "Participa en sesiones al aire libre, eventos temáticos, clases de meditación, y charlas sobre bienestar.",
                "https://images.unsplash.com/photo-1593164842264-854604db2260?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                new Date(), "Eventos y Talleres"));
                /*Post 3*/
                post.add(new Post(3, "Programas de yoga personalizados para diferentes niveles, objetivos y preferencias.",
                        "https://images.unsplash.com/photo-1545389336-cf090694435e?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                new Date(), "Práctica Personalizada"));
                return post;
    }

    @GetMapping(path = {"/post", "/"})
    public String home(Model model){
        model.addAttribute("posts", this.getPosts());
        return "index";
    }

}
