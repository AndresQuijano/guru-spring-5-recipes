package guru.spring.guruspring5recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
        System.out.println("Prueb");
        return "index";
    }
}