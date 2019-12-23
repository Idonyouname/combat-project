package com.liugui.servicebase.sevice;

import com.liugui.servicebase.model.SysType;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysTypeService
 * @Author: liugui
 * @Date: 2019-12-23 10:43
 **/
public interface ISysTypeService{
    int save(SysType sysType)throws Exception;
    int remove(int id)throws Exception;
    int update(SysType sysType)throws Exception;
    List<SysType> selectByMaps(Map<String,Object> map);
}
