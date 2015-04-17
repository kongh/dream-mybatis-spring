package com.coder.dream.controller.user;

import com.coder.dream.base.controller.BaseController;
import com.coder.dream.base.dao.query.support.FilterQuery;
import com.coder.dream.dao.user.UserDao;
import com.coder.dream.dao.user.mapper.UserMapper;
import com.coder.dream.model.user.User;
import com.coder.dream.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController<User,UserMapper,UserDao,UserService>{

    @Override
    public List<User> list(@RequestParam Map<String, String> params) {
        FilterQuery filters = new FilterQuery();
//        filters.notLike("name","123");
//        filters.isNotNull("update_time");
        String[] ins = new String[]{"1","2","3"};
        List<String> inList = Arrays.asList(ins);
//        filters.notIn("id",inList );
        filters.eq("name","konghang");
        FilterQuery orFilter = new FilterQuery();
        orFilter.eq("name","123");
        orFilter.isNotNull("update_time");
        filters.or(orFilter);
        return  service.list(filters);
    }

}
