package com.example.SpringBootWeb;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Spring Boot Web";
    }

    @RequestMapping("/")
    public String home() {
        // Home controller logic here
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
        // About controller logic here
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//   using model to pass data to the view (result.html)
//        int sum = num1 + num2;
//        model.addAttribute("result", sum);

        //using modeland view to pass data to the view (result.html)
        int sum = num1 + num2;
        mv.addObject("result", sum);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien alien) {
        // About controller logic here
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(String.valueOf(aname));
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
           return "result";
    }
}
