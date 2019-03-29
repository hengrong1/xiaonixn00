package cn.xiaonixn00.service;

import java.util.List;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.service
 * @className LeadingService
 * @date 2019/3/6 16:18
 */

public interface LeadingService {

    /**
     * 获取前台列表
     * @return
     */
    List<Map> getList();
    /**
     * 获取文章数量
     * @return
     */
    int getListCount();
    /**
     * 获取每月发布文章的数量
     * @return
     */
    List<Map> getMonthSum();
    /**
     * 获取所有文章关键字
     * @return
     */
    List<Map> getKeyWord();
}
