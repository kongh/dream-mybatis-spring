package com.coder.dream.controller.user;

import com.coder.dream.base.controller.BaseController;
import com.coder.dream.dao.user.UserDao;
import com.coder.dream.dao.user.mapper.UserMapper;
import com.coder.dream.model.user.User;
import com.coder.dream.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController<User,UserMapper,UserDao,UserService>{
}
