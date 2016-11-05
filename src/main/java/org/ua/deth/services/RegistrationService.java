package org.ua.deth.services;


import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.ChatUser;


public interface RegistrationService {

    ModelAndView getRegistration();

    boolean create(ChatUser user);
}
