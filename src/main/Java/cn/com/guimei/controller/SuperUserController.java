package cn.com.guimei.controller;

import cn.com.guimei.pojo.SuperUser;
import cn.com.guimei.service.SuperUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/superUser")
public class SuperUserController {
    @Resource
    private SuperUserService superUserService;

    @RequestMapping("/login")
    public String doLogin(SuperUser superUser , HttpServletRequest request){
        SuperUser sU=superUserService.login(superUser);
        if (sU==null){
            request.setAttribute("error","你输入的账号或密码有误！");
            //登录失败
            return "forward:/Login.jsp";
        }
        request.getSession().setAttribute("userName",sU.getUserName());
        return "index";
    }
}
