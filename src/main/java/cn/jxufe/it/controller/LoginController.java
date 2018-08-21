package cn.jxufe.it.controller;

import cn.jxufe.it.entity.Memberinfo;
import cn.jxufe.it.services.Impl.MemberinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private MemberinfoServiceImpl msi;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("userLogin")
    public String login(){
        return "login";
    }

    //验证用户名和密码
    @RequestMapping("checkLogin")
    @ResponseBody
    public String CheckLogin(@RequestParam String tel,@RequestParam String pwd){
        Map map = new HashMap();
        System.out.println(tel);
        System.out.println(pwd);
        map.put("memberMobile",tel);
        String json = "{\"msg\":\"false\"}";
        List<Memberinfo> memberinfoList = msi.searchMemberinfoByParams(map);
        for (Memberinfo m: memberinfoList) {
            if(m.getMemberPasswd().equals(pwd)){
                json =  "{\"msg\":\"true\"}";
                request.getSession(true).setAttribute("login","true");
            }
        }
        System.out.println(json);
        return json;
    }
}
