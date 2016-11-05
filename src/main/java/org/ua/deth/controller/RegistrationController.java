package org.ua.deth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping(name = "/registration", method = RequestMethod.GET)
    public ModelAndView getRegistration() {
        return service.getRegistration();
    }

    @RequestMapping(name = "/registration-handler", method = RequestMethod.POST)
    public ModelAndView doRegistration(@ModelAttribute("user") @Validated ChatUser user, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (result.hasErrors()) {
            modelAndView.setViewName("registration");
        } else if (service.create(user)) {

            modelAndView.setViewName("index");
        } else {
            modelAndView.addObject("alreadyexist", "This login already exist in base!");
            modelAndView.setViewName("registration");
        }
        return modelAndView;
    }
}
