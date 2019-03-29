package cn.xiaonixn00.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.dao
 * @className AdminDao
 * @date 2019/3/12 16:23
 */
@Component
public interface AdminDao {

    /**
     * 新建文章
     * @param map
     * @return
     */
    int newArticle(Map map);

    /**
     *查询文章列表,关键字
     * @return
     */
    List<Map> articleList(Map map);
    /**
     *查询文章列表,带分页
     * @return
     */
    List<Map> articleListWithPage(Map map);

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
