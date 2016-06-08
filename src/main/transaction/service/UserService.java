package transaction.service;

import transaction.dao.UserDao;
import transaction.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jd on 2016/06/08.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserbyId(Integer id){
        return userDao.getUserbyId(id);
    }
}
