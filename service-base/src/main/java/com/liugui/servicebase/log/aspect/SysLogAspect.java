package com.liugui.servicebase.log.aspect;

import com.liugui.servicebase.log.service.impl.SysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * @ClassName: SysLogAspect
 * @Author: liugui
 * @Date: 2019-11-26 15:53
 **/
@Aspect
@Component
//@Profile("dev") 用 @Profile 注解可以指定类或方法在特定的 Profile 环境生效。
public class SysLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Resource
    private SysLogService sysLogService;

    /**
     * 自定义 @SysLog 注解为切点
     */
    @Pointcut("@annotation(com.liugui.servicebase.log.annotation.SysLog)")
    public void log() { }

    /**
     * 后置增强 拦截操作在方法返回后执行
     */
    @Before("log()")
    public void after(JoinPoint joinPoint) throws Throwable {
        sysLogService.handleSysLog(joinPoint);
    }

}
