package cn.xiaonixn00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.controller
 * @className ErrorPage
 * @date 2019/3/28 18:44
 */
@Controller
@RequestMapping("/error")
public class ErrorPage {

    @RequestMapping(value = "404",method = RequestMethod.GET)
    public String noFound(){
        return "404";
    }
}
