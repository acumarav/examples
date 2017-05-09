package org.alext.learning.services;

import org.alext.learning.model.User;
import org.alext.learning.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {

        List<User> all = userRepository.findAll();
        log.info("getAllUsers found: {} users", all.size());
        return all;
    }

    public int calcUsernameSum(User us) {
        int sum = 0;
        for (char namecahr : us.getName().toCharArray()) {
            sum += namecahr;
        }
        return sum;
    }

}
