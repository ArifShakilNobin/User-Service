package user.service.services;

import user.service.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser (String userId);

}
