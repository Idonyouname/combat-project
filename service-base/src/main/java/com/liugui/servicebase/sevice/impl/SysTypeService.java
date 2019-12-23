package com.liugui.servicebase.sevice.impl;

import com.liugui.servicebase.mapper.SysTypeMapper;
import com.liugui.servicebase.model.SysType;
import com.liugui.servicebase.sevice.ISysTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: SysTypeService
 * @Author: liugui
 * @Date: 2019-12-23 10:44
 **/
@Service
public class SysTypeService implements ISysTypeService {

    @Resource
    private SysTypeMapper sysTypeMapper;

    @Override
    public int save(SysType sysType) throws Exception {
        return sysTypeMapper.insert(sysType);
    }

    @Override
    public int remove(int id) throws Exception {
        return sysTypeMapper.deleteById(id);
    }

    @Override
    public int update(SysType sysType) throws Exception {
        return sysTypeMapper.updateById(sysType);
    }

    @Override
    public List<SysType> selectByMaps(Map<String,Object> map) {
        return sysTypeMapper.selectByMaps( map);
    }
}
