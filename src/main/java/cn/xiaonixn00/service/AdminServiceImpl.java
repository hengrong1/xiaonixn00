package cn.xiaonixn00.service;

import cn.xiaonixn00.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.service
 * @className AdminServiceImpl
 * @date 2019/3/12 16:45
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public int newArticle(Map map) {
        return adminDao.newArticle(map);
    }

    @Override
    public List<Map> articleList(Map map) {
        return adminDao.articleList(map);
    }

    @Override
    public int countArticle(Map map) {
        System.out.println("------");
        System.out.println(map);
        System.out.println("------");
        return adminDao.countArticle(map);

    }

    /*@Override
    public List<Map> selectKeywords(Map map) {
        return adminDao.selectKeywords(map);
    }

    @Override
    public int selectKeywordsCount() {
        return adminDao.selectKeywordsCount();
    }*/
}
