package cn.com.guimei.service.impl;

import cn.com.guimei.dao.SuperUserMapper;
import cn.com.guimei.pojo.SuperUser;
import cn.com.guimei.service.SuperUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SuperUserServiceImpl implements SuperUserService {
    @Resource
    private SuperUserMapper superUserMapper;
    public SuperUser login(SuperUser user) {
        return superUserMapper.login(user);
    }
}
