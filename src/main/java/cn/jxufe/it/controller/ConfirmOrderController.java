package cn.jxufe.it.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/confirmOrder")
public class ConfirmOrderController {

    @RequestMapping("/confirmOrder")
    public String confirmOrderPage(){
        return "confirm_order";
    }
}
