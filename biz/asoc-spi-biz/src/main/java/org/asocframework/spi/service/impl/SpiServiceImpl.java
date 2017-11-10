package org.asocframework.spi.service.impl;

import org.asocframework.spi.model.invoke.SpiRequest;
import org.asocframework.spi.model.invoke.SpiResponse;
import org.asocframework.spi.service.SpiService;
import org.springframework.stereotype.Service;

/**
 * @author jiqing
 * @version $Id: SpiServiceImpl，v 1.0 2017/11/9 19:43 jiqing Exp $
 * @desc
 */
@Service
public class SpiServiceImpl implements SpiService{

    public SpiResponse invoke(SpiRequest spiRequest) {
        SpiResponse spiResponse = new SpiResponse();
        /*通过令牌核查partner*/
        /*检查partner 是否支持调用的spi*/
        /*检查spi是否存在,是否上线*/
        /*校验参数*/
        /*填充固定头部参数*/
        /*进行签名*/
        /*发送请求到parter*/
        /*校验返回签名*/
        /*封装返回结果*/
        /*over*/
        return spiResponse;
    }


}
