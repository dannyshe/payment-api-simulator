package com.payment.simulator.server.bo;

import lombok.Data;

/**
 * 
 * @version v1.0
 * @date 2022/4/7
 **/
@Data
public class CacheRuleBO {
    /**
     * id
     */
    private String id;

    /**
     * mock规则表id
     */
    private String mockRuleId;
    /**
     * 缓存操作
     */
    private String cacheOption;

    /**
     * 获取入参中key规则
     */
    private String reqCacheRule;

    /**
     * 缓存数据
     */
    private String cacheBody;

    /**
     * 跟缓存中数据匹配规则
     */
    private String cacheBodyMatchRule;
    /**
     * 缓存时间，单位秒
     */
    private Long cacheTime;
    /**
     * 缓存过期后返回值模版
     */
    private String nullResponseTemplate;
    /**
     * 返回值模版
     */
    private String responseTemplate;

    /**
     * 匹配错误返回的模板
     */
    private String matchErrorResponseTemplate;
    /**
     * 匹配成功返回的code
     */
    private String matchStatusCode;
    /**
     * 匹配错误返回的code
     */
    private String nullMatchStatusCode;
    /**
     * 缓存过期后返回值Code
     */
    private String matchErrorStatusCode;
    /**
     * 备注
     */
    private String remark;
}
