package com.coder.dream.service.user;

import com.coder.dream.base.dao.query.support.FilterQuery;
import com.coder.dream.base.service.BaseService;
import com.coder.dream.dao.user.UserDao;
import com.coder.dream.dao.user.mapper.UserMapper;
import com.coder.dream.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService extends BaseService<User,UserMapper,UserDao>{

    @Autowired
    private UserDao userDao;

    public List<User> list(){
        return userDao.list(new FilterQuery("t_user"));
    }
}
