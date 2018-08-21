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
@RequestMapping("/product")
public class IndexController {

    @Autowired
    private AdvertisementServiceImpl advi;
    @Autowired
    private GoodsinfoServiceImpl gsi;
    private List<Goodsinfo> goodsinfoList = new ArrayList<Goodsinfo>();
    private Page<Advertisement> pagesAdv;
    private Page<Goodsinfo> pagesGoods;

    //加载首页轮换图片和商品图片
    @RequestMapping("index")
    public String getIndex(Map map){
        Map map1 = new HashMap();
        map1.put("advId","16");
        List<Advertisement> listAdv = advi.searchAdvertisementByParams(map1);
        map1.put("advId","17");
        listAdv.addAll(advi.searchAdvertisementByParams(map1));
        pagesAdv = new PageImpl<Advertisement>(listAdv);
        map.put("list",pagesAdv);

        goodsinfoList = gsi.searchGoodsinfoByParams(null);
        pagesGoods = new PageImpl<Goodsinfo>(goodsinfoList);
        System.out.println(goodsinfoList.size() + "---------");
        map.put("goodsInfo",pagesGoods);
        return "index";
    }


    //商品详情页
    @RequestMapping("product_list")
    public String getProduct_list(){
        System.out.println("2==========");
        return "product_list";
    }
}
