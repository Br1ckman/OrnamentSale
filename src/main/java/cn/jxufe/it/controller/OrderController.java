package cn.jxufe.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orderList")
public class OrderController {

    @RequestMapping("orderList")
    public String orderListPage(){
        return "order_list";
    }
}
