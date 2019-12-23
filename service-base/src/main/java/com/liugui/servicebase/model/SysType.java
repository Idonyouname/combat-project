package com.liugui.servicebase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: SysType
 * @Author: liugui
 * @Date: 2019-12-23 10:40
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysType {
    //待用学校id
    private Integer schoolld;
    //类型id
    private Integer typeId;
    //类型分类
    private String typeClass;
    //类型值
    private String typeName;
    //类型路径
    private String typePath;
    //类型状态 （是否启用） 0禁用  1启用
    private boolean state;
    //备注
    private String comment;
}
