package com.founder.leecode.leecode.$202211.$20221101;


import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author: chxu.
 * @date: 2020/10/14.
 * @time: 17:04.
 */
public enum DownloadTypeEnum {

    /**
     * 本站统计
     */
    DEFAULT("本站统计", 0, "downloadCountDataSource","downloads"),
    /**
     * cnki本站统计
     */
    CNKI("cnki", 1, "downloadCountDataSource","downloads");


    public String name;
    public Integer type;
    public String setField;
    public String countField;

    DownloadTypeEnum(String name, Integer type, String setField, String countField) {
        this.name = name;
        this.type = type;
        this.setField = setField;
        this.countField = countField;
    }


    public static List<DownloadTypeEnum> valueList() {
        List<DownloadTypeEnum> result = Lists.newArrayList();
        for (DownloadTypeEnum downloadTypeEnum : DownloadTypeEnum.values()) {
            result.add(downloadTypeEnum);
        }
        return result;
    }


    public static DownloadTypeEnum getByCode(Integer type) {
        for (DownloadTypeEnum moduleCodeEnum : DownloadTypeEnum.values()) {
            if (moduleCodeEnum.type.equals(type)) {
                return moduleCodeEnum;
            }
        }
        return null;
    }

}
