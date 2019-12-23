package com.liugui.servicebase.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liugui.servicebase.model.SysType;
import com.liugui.servicebase.sevice.ISysTypeService;
import com.liugui.servicebase.utils.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: SysTypeController
 * @Author: liugui
 * @Date: 2019-12-23 10:48
 **/
@Controller
@RequestMapping("/base/sysType")
public class SysTypeController {

    @Resource
    private ISysTypeService iSysTypeService;

    /**
     * list
     */
    @ResponseBody
    @RequestMapping(value = "/list/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public Msg list(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize, String type,Boolean state){
        Map<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("typeClass", type);
        PageHelper.startPage(pageNum,pageSize);
        return new Msg<>().dataSuccess(new PageInfo<>(iSysTypeService.selectByMaps(map)).getList());
    }

    /**
     * 添加
     */
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Msg save(SysType sysType){
        try {
            if (iSysTypeService.save(sysType) > 0){
                return new Msg().openSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Msg().openFail();
    }

    /**
     * 删除
     */
    @ResponseBody
    @RequestMapping(value = "/remove/{id}",method = RequestMethod.POST)
    public Msg remove(@PathVariable("id") int id){
        try {
            if (iSysTypeService.remove(id) > 0){
                return new Msg().openSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Msg().openFail();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Msg update(SysType sysType){
        try {
            if (iSysTypeService.update(sysType) > 0){
                return new Msg().openSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Msg().openFail();
    }

}
