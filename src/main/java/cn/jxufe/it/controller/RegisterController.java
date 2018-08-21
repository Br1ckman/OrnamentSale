package cn.jxufe.it.controller;


import cn.jxufe.it.entity.Memberinfo;
import cn.jxufe.it.services.Impl.MemberinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private MemberinfoServiceImpl msi;

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    //验证用户名是否存在
    @RequestMapping("checkName")
    @ResponseBody
    public String getName(@RequestParam String memberMobile){
        String json = "{\"msg\":\"\"}";
        List<Memberinfo> memberinfoList = msi.searchMemberinfoByParams(null);
        for (Memberinfo m: memberinfoList) {
            if(m.getMemberMobile().equals(memberMobile)){
                json = "{\"msg\":\"此账号已存在！\"}";
            }
        }
        return json;
    }

    //注册提交
    @RequestMapping("regSubmit")
    public String regSubmit(Memberinfo memberinfo){
        memberinfo.setMemberName("默认用户");
        memberinfo.setMemberLoginNum(1);
        memberinfo.setIsSell(true);
        memberinfo.setMemberState(true);
        msi.insertMemberinfo(memberinfo);
        return "login";
    }
}
