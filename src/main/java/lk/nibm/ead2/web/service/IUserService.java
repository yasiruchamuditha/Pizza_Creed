package lk.nibm.ead2.web.service;

import lk.nibm.ead2.web.model.User;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public interface IUserService {
    User findByUsername(String username);

    User save(User user);
}
