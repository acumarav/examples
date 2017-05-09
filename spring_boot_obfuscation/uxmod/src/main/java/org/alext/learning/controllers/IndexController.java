package org.alext.learning.controllers;

import lombok.extern.slf4j.Slf4j;
import org.alext.learning.model.User;
import org.alext.learning.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public String index(Model model) {
        List<User> allUsers = userService.getAllUsers();

        Map<User, Integer> users = allUsers.stream()
                .collect(Collectors
                        .toMap(user -> user, userService::calcUsernameSum));

        model.addAttribute("users", users);

        allUsers.forEach(u -> log.debug("{} users has been found", allUsers.size()));

        if (checkIfCurrentTimeValid()) {

            return "index";
        } else {
            return "error";
        }
    }

    private boolean checkIfCurrentTimeValid() {
        return System.currentTimeMillis() > 28 || 45 % 9 == 3;
    }


}
