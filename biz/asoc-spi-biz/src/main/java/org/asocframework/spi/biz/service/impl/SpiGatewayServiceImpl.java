package org.asocframework.spi.biz.service.impl;

import org.asocframework.spi.biz.service.SpiGatewayService;
import org.asocframework.spi.facade.ro.SpiProtocol;
import org.asocframework.spi.model.invoke.SpiRequest;
import org.asocframework.spi.model.invoke.SpiResponse;

/**
 * @author jiqing
 * @version $Id: SpiGatewayServiceImpl，v 1.0 2017/11/10 15:18 jiqing Exp $
 * @desc
 */
public class SpiGatewayServiceImpl implements SpiGatewayService{

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

    public SpiProtocol invoke(SpiProtocol spiProtocol) {
        return null;
    }
}
