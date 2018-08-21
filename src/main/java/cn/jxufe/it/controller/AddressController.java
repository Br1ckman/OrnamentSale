package cn.jxufe.it.controller;

import cn.jxufe.it.entity.Areainfo;
import cn.jxufe.it.services.Impl.AreainfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/address")
public class AddressController {


    @Autowired
    private AreainfoServiceImpl asi;
    private List<Areainfo> areainfoList = new ArrayList<Areainfo>();
    private String[][][] area = new String[35][500][500];

    @RequestMapping("address")
    public String addressPage(){
        return "address";
    }

    @RequestMapping("address1")
    @ResponseBody
    public Object address(){
        Map map = new HashMap();

        //查出深度为1的城市
        map.put("areaDeep","1");
        areainfoList = asi.searchAreainfoByParams(map);
        for (int i = 0; i < areainfoList.size(); i++){
            area[i][0][0] = areainfoList.get(i).getAreaName();
            System.out.println(area[i][0][0]);
            System.out.println(areainfoList.size());
            //查出深度为2的城市
            map.put("areaDeep","2");
            map.put("areaParentId",areainfoList.get(i).getAreaId().toString());
            areainfoList = asi.searchAreainfoByParams(map);
            System.out.println(areainfoList.size() + "------2级");
            for (int j = 1; j < areainfoList.size(); j++) {
                area[i][j][0] = areainfoList.get(j).getAreaName();
                System.out.println(area[i][0][0]);
                map.put("areaDeep","3");
                map.put("areaParentId",areainfoList.get(j).getAreaId().toString());
                areainfoList = asi.searchAreainfoByParams(map);
                System.out.println(areainfoList.size() + "------3级");
                if(areainfoList.size() >= 1){
                    for (int k = 1; k < areainfoList.size(); k++) {
                        area[i][j][k] = areainfoList.get(k).getAreaName();
                    }
                }
            }
            map.put("areaDeep","1");
            map.put("areaParentId","0");
            areainfoList = asi.searchAreainfoByParams(map);
        }
        return area;
    }

}
