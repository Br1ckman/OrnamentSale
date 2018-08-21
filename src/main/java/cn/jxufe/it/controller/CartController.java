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
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private GoodsinfoServiceImpl gsi;
    private List<Goodsinfo> goodsinfoList = new ArrayList<Goodsinfo>();
    private int[] counts = new int[50];
    private int countAll = 0;
    private double money = 0;
    private Page<Goodsinfo> pages;

    //加载购物车页面
    @RequestMapping("cart")
    public String cartPage(Map map){
        pages = new PageImpl<Goodsinfo>(goodsinfoList);
        map.put("goodsForCart",pages);
        map.put("counts",counts);
        map.put("countAll",countAll);
        double tempMoney = 0;
        for (int i = 0; i < goodsinfoList.size(); i++) {
            tempMoney += goodsinfoList.get(i).getGoodsPrice()*counts[goodsinfoList.get(i).getGoodsId() - 4];
        }
        money = tempMoney;
        map.put("money",money);
        return "cart";
    }

    //加入购物车
    @RequestMapping("addToCart")
    @ResponseBody
    public String addToCart(@RequestParam String value){
        boolean isflag = true;
        String json = "{\"msg\":\"添加失败！\"}";
        Map map1 = new HashMap();
        map1.put("goodsId",value);
        counts[Integer.parseInt(value) - 4] ++;
        for (Goodsinfo g:goodsinfoList) {
            if(Integer.parseInt(value) == g.getGoodsId()){
                isflag = false;
                break;
            }
        }
        System.out.println(isflag);
        if(isflag){
            goodsinfoList.addAll(gsi.searchGoodsinfoByParams(map1));
        }
        int count1 = 0;
        for (int i = 0; i < counts.length; i++) {
            count1 += counts[i];
        }
        countAll = count1;
        json = "{\"msg\":\"添加成功！\"}";
        return json;
    }


    //购物车中删除
    @RequestMapping("changeFromCart")
    @ResponseBody
    public String deleteFromCart(@RequestParam String value,int count,Map map){
        String json = "{\"msg\":\"删除失败！\"}";
        if(count<=0){
            counts[Integer.parseInt(value) - 4] = 0;
            for (Goodsinfo g:goodsinfoList) {
                if(g.getGoodsId() == Integer.parseInt(value)){
                    goodsinfoList.remove(g);
                }
            }
            System.out.println(goodsinfoList.size());
        }else {
            counts[Integer.parseInt(value) - 4] = count;
        }

        json = "{\"msg\":\"删除成功！\"}";
        return json;
    }


    //商品详情
    @RequestMapping("product")
    public String prodcut(@RequestParam String id, Map map){
        Map map1 = new HashMap();
        map1.put("goodsId",id);
        List<Goodsinfo> list = gsi.searchGoodsinfoByParams(map1);
        Page<Goodsinfo> pages1 = new PageImpl<Goodsinfo>(list);
        map.put("product",pages1);
        map.put("count",countAll);
        return "product";
    }

    //下单页面
    @RequestMapping("confirmOrder")
    public String confirmOrderPage(){
        return "confirm_order";
    }

    @RequestMapping("returnState")
    public String returnStatePage(){
        return "return_state";
    }

}
