package org.ua.deth.services;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.ChatUser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public ModelAndView getRegistration() {
        ModelAndView modelAndView = new ModelAndView();
        ChatUser user = new ChatUser();
        modelAndView.addObject("user", user);
        modelAndView.addObject("title", "Registration");
        modelAndView.setViewName("registration");

        return modelAndView;
    }
}
