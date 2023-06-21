package user.service.services.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.service.exceptions.ResourceNotFoundException;
import user.service.models.User;
import user.service.repositories.UserRepository;
import user.service.services.UserService;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server !!:"+userId));
    }
}
