package com.coder.dream.controller.user;

import com.coder.dream.base.web.controller.BaseController;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.base.web.vo.OrderMap;
import com.coder.dream.dao.support.user.UserDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import com.coder.dream.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController<User,UserMapper,UserDao,UserService>{

    @Override
    protected void beforeList(Map<String, String> params, FilterMap filterMap, OrderMap orderMap) {
        filterMap.in("name",new String[]{"123"});
    }
}
