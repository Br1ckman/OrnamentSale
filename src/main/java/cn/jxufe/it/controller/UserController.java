package cn.jxufe.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/user")
    public String userPage(){
        return "user";
    }

    @RequestMapping("/userSet")
    public String userSetPage(){
        return "user_set";
    }

    @RequestMapping("/changePwd")
    public String changePwdPage(){
        return "change_pwd";
    }

    @RequestMapping("/changeName")
    public String changeNamePage(){
        return "change_name.jsp";
    }

    @RequestMapping("/changeTel")
    public String changeTelPage(){
        return "change_tel.jsp";
    }
}
