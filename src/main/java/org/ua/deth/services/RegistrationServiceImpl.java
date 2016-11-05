package org.ua.deth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.ua.deth.entitys.ChatUser;
import org.ua.deth.repository.ChatUserRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private ChatUserRepository chatUserRepository;

    @Override
    public ModelAndView getRegistration() {
        ModelAndView modelAndView = new ModelAndView();
        ChatUser user = new ChatUser();
        modelAndView.addObject("user", user);
        modelAndView.addObject("title", "Registration");
        modelAndView.setViewName("registration");

        return modelAndView;
    }

    @Override
    public boolean create(ChatUser user) {
        return chatUserRepository.saveAndFlush(user) != null;
    }
}
