package org.asocframework.spi.biz.service;

import org.asocframework.spi.facade.ro.SpiProtocol;
import org.asocframework.spi.model.dal.invoke.SpiRequest;
import org.asocframework.spi.model.dal.invoke.SpiResponse;

/**
 * @author jiqing
 * @version $Id: SpiGatewayService，v 1.0 2017/11/10 15:17 jiqing Exp $
 * @desc
 */
public interface SpiGatewayService {

    /**
     * 执行spi 接口服务
     * @param spiRequest
     * @return
     */
    SpiResponse invoke(SpiRequest spiRequest);

    /**
     *
     * @param spiProtocol
     * @return
     */
    SpiProtocol invoke(SpiProtocol spiProtocol);

}
