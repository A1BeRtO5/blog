package blog.p1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/file")
    public String file(Model model) {
        model.addAttribute("111111", "ffffff");
        return "file";
    }
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("111111", "ffffff");
        return "greeting";
    }
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("111111", "ffffff");
        return "home";
    }
    @GetMapping("/lesson4")
    public String lesson4(Model model) {
        model.addAttribute("111111", "ffffff");
        return "lesson4";
    }
    @GetMapping("/lesson5")
    public String lesson5(Model model) {
        model.addAttribute("111111", "ffffff");
        return "lesson5";
    }
    @GetMapping("/love")
    public String love(Model model) {
        model.addAttribute("111111", "ffffff");
        return "love";
    }

}