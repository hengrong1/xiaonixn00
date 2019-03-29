package cn.xiaonixn00.controller;

import cn.xiaonixn00.service.LeadingService;
import cn.xiaonixn00.util.ReadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.controller
 * @className JumpPage
 * @date 2019/3/6 16:33
 */
@Controller
@RequestMapping("jump")
public class JumpPage {
    @Autowired
    private LeadingService leadingService;

    @RequestMapping("/")
    public String toIndex(){
//        id,title,keywords,description,pic,content,click,time,inindex

        String title = null;
//        String keywords = null;
        String content = null;
        String time = null;

        for(Map map :leadingService.getList()){
            title = String.valueOf(map.get("title"));
//            keywords = String.valueOf(map.get("keywords"));
            content = String.valueOf(map.get("content"));
            time = String.valueOf(map.get("time"));
            ReadModel.JspToHtmlFile(title,content,time,"background-image: url('../img/a1.jpg')","./src/main/resources/static/ml.html","./src/main/resources/static/temp/"+title+".html");

        }
//        System.out.println("111");
//        System.out.println(new File(".").getAbsolutePath());
//        System.out.println("222");

//        File file = new File("http://xiaonixn00.top/ml.html");

//        System.out.println(file);

//        ReadModel.JspToHtmlFile(title,content,time,"background--image: url('img/ss.jpg')","C:\\xiaonixn00\\src\\main\\resources\\static\\ml.html","./temp/"+title+".html");
//        ReadModel.JspToHtmlFile(title,content,time,"background--image: url('img/ss.jpg')","./src/main/resources/static/ml.html","./src/main/resources/static/temp/"+title+".html");

        return "adminIndex.html";
    }

    @RequestMapping("/admin1")
    public String toAdmin(){

        return "adminIndex.html";
    }

    @RequestMapping("/admin2")
    public String toAdmin1(){

        return "adminIndex";
    }

    @RequestMapping("/adminNew")
    public String toAdminNew(){

        return "newArticle1.html";
    }

    @RequestMapping("/adminList")
    public String toAdminList(){

        return "articleList.html";
    }



}
