package com.liugui.servicebase.log.service;

import org.aspectj.lang.JoinPoint;

/**
 * @ClassName: SysLogService
 * @Author: liugui
 * @Date: 2019-12-24 15:28
 **/
public interface ISysLogService {
    /**
     *  todo:暂不使用该方式记录日志
     * 1.根据拦截获取joinPoint
     * 2.根据joinPoint获取传入参数
     * 3.通过参数去请求数据库获取所需日志信息
     * 4.根据参数组成日志实体 保存到数据库
     *
     * @param joinPoint 包含方法请求参数的joinPoint实体
     * @throws Exception 异常
     */
    void handleSysLog(JoinPoint joinPoint) throws Exception;
}
