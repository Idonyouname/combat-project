package com.liugui.servicebase.mapper;

import com.liugui.servicebase.model.SysType;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysTypeMapper
 * @Author: liugui
 * @Date: 2019-12-23 10:43
 **/
public interface SysTypeMapper  {
    int insert(SysType sysType)throws Exception;
    int deleteById(int id)throws Exception;
    int updateById(SysType sysType)throws Exception;
    List<SysType> selectByMaps(Map<String,Object> map);
}
