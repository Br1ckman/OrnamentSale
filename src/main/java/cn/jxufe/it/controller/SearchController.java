package cn.jxufe.it.controller;

import cn.jxufe.it.entity.Advertisement;
import cn.jxufe.it.entity.Goodsinfo;
import cn.jxufe.it.services.Impl.AdvertisementServiceImpl;
import cn.jxufe.it.services.Impl.GoodsinfoServiceImpl;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private GoodsinfoServiceImpl gsi;

    @Autowired
    private AdvertisementServiceImpl advi;

    private List<Goodsinfo> goodsinfoList = new ArrayList<Goodsinfo>();
    private Page<Goodsinfo> pagesGoods;
    private Page<Advertisement> pagesAdv;


    @RequestMapping("search")
    public String search(){
        return "search";
    }

    @RequestMapping("searchResult")
    public String searchResult(Map map){
        Map map1 = new HashMap();
        map1.put("advId","16");
        List<Advertisement> listAdv = advi.searchAdvertisementByParams(map1);
        map1.put("advId","17");
        listAdv.addAll(advi.searchAdvertisementByParams(map1));
        pagesAdv = new PageImpl<Advertisement>(listAdv);
        map.put("list",pagesAdv);
        pagesGoods = new PageImpl<Goodsinfo>(goodsinfoList);
        System.out.println(goodsinfoList.size() + "---------");
        map.put("goodsInfo",pagesGoods);
        return "index";
    }

    //查找
    @RequestMapping("searchByName")
    public String searchByName(@RequestParam String name, Map map){
        Map map1 = new HashMap();
        name = "%" + name + "%";
        System.out.println(name);
        map1.put("goodsName",name);
        goodsinfoList = gsi.searchGoodsinfoByParams(map1);
        return "";
    }

}
