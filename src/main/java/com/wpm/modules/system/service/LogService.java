package com.wpm.modules.system.service;

import com.wpm.modules.system.entity.Log;
import com.wpm.modules.system.query.LogQuery;
import com.wpm.utils.PageResultSet;

public interface LogService {

    /**
     * 创建日志
     * @param log
     * @return
     */
    void create(Log log);

    /**
     * 分页查询日志
     * @param log
     * @return
     */
    PageResultSet<Log> findByPage(LogQuery log);

}
