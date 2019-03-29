package cn.xiaonixn00.service;

import cn.xiaonixn00.dao.Leading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 荣恒 xiaonixn00
 * @packageName cn.xiaonixn00.service
 * @className LeadingServiceImpl
 * @date 2019/3/6 16:19
 */
@Service
public class LeadingServiceImpl implements LeadingService {
    @Autowired
    private Leading leading;
    /**
     * 获取前台列表
     * @return
     */
    @Override
    public List<Map> getList() {
        return leading.getList();
    }

    @Override
    public int getListCount() {
        return leading.getListCount();
    }

    @Override
    public List<Map> getMonthSum() {
        return leading.getMonthSum();
    }

    @Override
    public List<Map> getKeyWord() {
        return leading.getKeyWord();
    }
}
