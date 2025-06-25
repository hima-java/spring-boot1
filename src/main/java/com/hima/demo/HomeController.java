package com.hima.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class HomeController {

   /* @RequestMapping("/")
    public String home(){

        return "index.jsp";
    }*/


    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session){

        return "index.jsp";
    }


@GetMapping
    public String home(){
    System.out.println("updated");
        return "Invoked";
    }
}
