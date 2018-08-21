package cn.jxufe.it.controller;

import cn.jxufe.it.entity.Goodsinfo;
import cn.jxufe.it.services.Impl.GoodsinfoServiceImpl;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {

    @Autowired
    private GoodsinfoServiceImpl gsi;
    private List<Goodsinfo> goodsinfoList = new ArrayList<Goodsinfo>();;
    private Page<Goodsinfo> pages;

    @RequestMapping("favorite")
    public String favoritePage(Map map){
        pages = new PageImpl<Goodsinfo>(goodsinfoList);
        map.put("goodsForFav",pages);
        return "favorite";
    }

    @RequestMapping("addToFav")
    @ResponseBody
    public String addToFav(@RequestParam String value){
        boolean isflag = true;
        String json = "{\"msg\":\"添加失败！\"}";
        Map map1 = new HashMap();
        map1.put("goodsId",value);
        if(goodsinfoList!=null){
            for (Goodsinfo g:goodsinfoList) {
                if(Integer.parseInt(value) == g.getGoodsId()){
                    isflag = false;
                    break;
                }
            }
        }
        System.out.println(isflag + "===" + value);
        if(isflag){
            goodsinfoList.addAll(gsi.searchGoodsinfoByParams(map1));
        }
        json = "{\"msg\":\"添加成功！\"}";
        return json;
    }
}
