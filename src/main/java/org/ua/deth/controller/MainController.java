package org.ua.deth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("title", "Java Rest Web Chat");
        return modelAndView;
    }
}
