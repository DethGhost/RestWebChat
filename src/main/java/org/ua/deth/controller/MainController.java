package org.ua.deth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        session.setAttribute("title", "Java Rest Web Chat");
        return modelAndView;
    }
}
