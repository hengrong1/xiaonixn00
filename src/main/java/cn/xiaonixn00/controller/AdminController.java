package cn.xiaonixn00.controller;

import cn.xiaonixn00.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.controller
 * @className AdminController
 * @date 2019/3/12 16:48
 */
@Controller
@RequestMapping(value = "adminPage")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping(value = "newArticle",method = RequestMethod.POST)
    @ApiOperation(value = "新建文章",notes = "新建文章")
    public Object newArticle(@RequestBody Map map){
        System.out.println(map);
        int i = adminService.newArticle(map);
        System.out.println(i);
        return adminService.newArticle(map);
    }

    @ResponseBody
    @RequestMapping(value = "articleList",method = RequestMethod.GET)
    @ApiOperation(value = "查询文章文章",notes = "查询文章文章")
    public Object articleList(@RequestBody Map keywords){
//        String k = keywords.get(0)+"";
        Map map = new HashMap();
        map.put("total",adminService.countArticle(keywords));

        map.put("data",adminService.articleList(keywords));

        System.out.println(keywords);
        System.out.println(map);
        return map;
    }


   /* @ResponseBody
    @RequestMapping(value = "selectKeywords",method = RequestMethod.GET)
    @ApiOperation(value = "根据关键字查询文章",notes = "根据关键字查询文章")
    public Object selectKeywords(@RequestBody Map keywords){
        Map map = new HashMap();
        map.put("total",adminService.selectKeywordsCount());
        map.put("data",adminService.selectKeywords(keywords));
        return map;
    }*/



}
