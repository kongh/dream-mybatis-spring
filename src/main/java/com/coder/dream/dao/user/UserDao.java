package com.coder.dream.dao.user;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.dao.user.mapper.UserMapper;
import com.coder.dream.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User,UserMapper> {

}
