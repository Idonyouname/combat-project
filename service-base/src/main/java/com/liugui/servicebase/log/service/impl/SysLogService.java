package com.liugui.servicebase.log.service.impl;

import com.liugui.servicebase.log.service.ISysLogService;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: SysLogService
 * @Author: liugui
 * @Date: 2019-12-24 15:29
 **/
@Service
public class SysLogService implements ISysLogService {

//    @Resource
//    private UserMapper userMapper;

    @Override
    public void handleSysLog(JoinPoint joinPoint) throws Exception {
        //组装日志实体 保存至数据库中
    }
}
