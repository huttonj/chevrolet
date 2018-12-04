package com.chevrolet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maihe on 2017/7/6.
 */
@Controller
@RequestMapping("/")
class PageController {
    @RequestMapping("carManage/carList.htm")
    public String carList(){
        return "carManage/carList";
    }

    @RequestMapping("vin/check.htm")
    public String check() {
        return "vinManage/vinCheck";
    }
}
