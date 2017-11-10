package org.asocframework.spi.service;

import org.asocframework.spi.model.invoke.SpiRequest;
import org.asocframework.spi.model.invoke.SpiResponse;

/**
 * @author jiqing
 * @version $Id: SpiService，v 1.0 2017/11/9 19:07 jiqing Exp $
 * @desc
 */
public interface SpiService {

    /**
     * 执行spi 接口服务
     * @param spiRequest
     * @return
     */
    SpiResponse invoke(SpiRequest spiRequest);

}
