package cn.xiaonixn00.service;

import java.util.List;
import java.util.Map;

public interface AdminService {
    /**
     * 新建文章
     * @param map
     * @return
     */
    int newArticle(Map map);
    /**
     *查询文章列表
     * @return
     */
    List<Map> articleList(Map map);
    /**
     * 统计文章数量
     * @return
     */
    int countArticle(Map map);
    /**
     * 根据关键字查询
     * @return
     */
//    List<Map> selectKeywords(Map map);
    /**
     * 根据关键字查询 统计数量
     * @return
     */
//    int selectKeywordsCount();
}
