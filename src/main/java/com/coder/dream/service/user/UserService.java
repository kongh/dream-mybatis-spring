package com.coder.dream.service.user;

import com.coder.dream.base.service.BaseService;
import com.coder.dream.base.web.vo.BaseVo;
import com.coder.dream.dao.support.user.UserDao;
import com.coder.dream.dao.mapper.user.UserMapper;
import com.coder.dream.dao.model.user.User;
import com.coder.dream.web.vo.user.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService extends BaseService<User,UserMapper,UserDao>{

    @Override
    protected void toListVo(User user, BaseVo vo) {
        super.toListVo(user, vo);
        UserVo userVo = (UserVo)vo;
        userVo.setName(user.getName());
    }
}
