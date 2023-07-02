package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.User;
import lk.nibm.ead2.web.repository.UserRepository;
import lk.nibm.ead2.web.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    //method for find user by username
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    //method for save user
    @Override
    public User save(User user) {
      User dao = null;
      if(user.getId() == null){
          dao = new User();
      }
      else {
          Optional<User> optionalUser = userRepository.findById(user.getId());
          if(optionalUser.isPresent()){
              dao = optionalUser.get();
          }
      }
        BeanUtils.copyProperties(user,dao);
        dao = userRepository.save(dao);
        user.setId(dao.getId());
        return user;
    }
}
