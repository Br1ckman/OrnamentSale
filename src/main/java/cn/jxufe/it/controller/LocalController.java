package cn.jxufe.it.controller;

import cn.jxufe.it.entity.Areainfo;
import cn.jxufe.it.services.Impl.AreainfoServiceImpl;
import com.alibaba.druid.sql.visitor.functions.Char;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("location")
public class LocalController {

    @Autowired
    private AreainfoServiceImpl asi;
    private List<Areainfo> areainfoList = new ArrayList<Areainfo>();
    private String[][] area = new String[26][1000];
    @RequestMapping("location1")
    @ResponseBody
    public Object location(){
        Map map = new HashMap();
        map.put("areaDeep","2");
        for (int i = 0; i < area.length; i++) {
            area[i][0] = String.valueOf(((char)(i+65)));
            System.out.println(area[i][0]);
            map.put("groupid",area[i][0]);
            areainfoList = asi.searchAreainfoByParams(map);
            System.out.println(areainfoList.size());
            for (int j = 1; j <= areainfoList.size(); j++) {
                area[i][j] = areainfoList.get(j - 1).getAreaName();
            }
        }
        return area;
    }

    @RequestMapping("location")
    public String locationPage(){
        return "location";
    }

}
