package org.ua.deth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.ChatUser;
import org.ua.deth.services.RegistrationService;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService service;

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public ModelAndView getRegisteration(ModelAndView modelAndView){
        ChatUser user = new ChatUser();

        modelAndView.setViewName("registration");
        modelAndView.addObject("user", user);
        modelAndView.addObject("title", "Registration");
        return modelAndView;

    }
}
