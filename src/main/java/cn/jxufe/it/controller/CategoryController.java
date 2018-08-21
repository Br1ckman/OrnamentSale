package cn.jxufe.it.controller;


import cn.jxufe.it.entity.Goodsinfo;
import cn.jxufe.it.services.Impl.GoodsinfoServiceImpl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private GoodsinfoServiceImpl gsi;
    private List<Goodsinfo> goodsinfoList;

    @Autowired
    private HttpServletRequest request;

    //
    @RequestMapping("category0")
    public String categoryPage0(Map map){
        map.put("categorys",goodsinfoList);
        return "category";
    }

    //第一次加载进页面
    @RequestMapping("category")
    public String categoryPage(Map map){
        Map map1 = new HashMap();
        map1.put("gcId","1");
        map1.put("sort","goods_sell_price");
        map1.put("asc","asc");
        goodsinfoList = gsi.searchGoodsCategoryBySort(map1);
        System.out.println(goodsinfoList.size());
        map.put("categorys",goodsinfoList);
        return "category";
    }


    //（按照价格或销量排序）排序函数
    @RequestMapping("orderBy")
    @ResponseBody
    public Object sortByPrice(@RequestParam String gcId,@RequestParam String sort,@RequestParam String orderBy,Map map1){
        String json = "{\"msg\":\"排序失败\"}";
        Map map = new HashMap();
        if(gcId != null){
            map.put("gcId",gcId);
        }
        if(sort != null){
            map.put("sort",sort);
        }
        if(orderBy.equals("desc")){
            map.put("desc",orderBy);
        }else {
            map.put("asc",orderBy);
        }
        goodsinfoList = gsi.searchGoodsCategoryBySort(map);
        return goodsinfoList;
    }
}
