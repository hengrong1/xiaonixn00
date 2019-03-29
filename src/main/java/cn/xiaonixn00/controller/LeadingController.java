package cn.xiaonixn00.controller;

import cn.xiaonixn00.service.LeadingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.controller
 * @className LeadingController
 * @date 2019/3/6 15:05
 */
@RestController
@RequestMapping("leading")
public class LeadingController {

    @Autowired
    private LeadingService leadingService;


    /**
     * 获取前台文章列表
     * @return
     */
    @ApiOperation(value = "获取前台文章列表",notes = "查询前台文章列表")
    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    public Object getList() {
        Map Map = new HashMap();
        Map.put("total:",leadingService.getListCount());
        Map.put("data",leadingService.getList());
        return Map;
    }

    /**
     * 获取每月的文章数量
     * @return
     */
    @ApiOperation(value = "获取每月发布文章的数量",notes = "获取每月发布文章的数量")
    @RequestMapping(value = "/getMonthSum",method = RequestMethod.POST)
    public Object getMonthSum(){
        List<Map> monthSum = leadingService.getMonthSum();
        return monthSum;
    }

    /**
     * 获取所有文章的关键字
     * @return
     */
    @ApiOperation(value = "获取所有文章的关键字",notes = "获取所有文章的关键字")
    @RequestMapping(value = "getKeyWord",method = RequestMethod.POST)
    public Object getKeyWord(){

        List<Map> keyWord = leadingService.getKeyWord();
        return keyWord;
    }
    @RequestMapping(value = "/getList1", method = RequestMethod.GET)
    public Object getList1() {
        Map Map = new HashMap();
        Map.put("total:",leadingService.getListCount());
        Map.put("data",leadingService.getList());
        return Map;
    }

}
