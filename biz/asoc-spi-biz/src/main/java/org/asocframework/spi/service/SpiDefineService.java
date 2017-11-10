package org.asocframework.spi.service;

import org.asocframework.spi.model.define.SpiDefine;

/**
 * @author jiqing
 * @version $Id: SpiDefineService，v 1.0 2017/11/9 16:14 jiqing Exp $
 * @desc
 */
public interface SpiDefineService {

    /**
     * 注册spi
     * @param spiDefine
     */
    void registerSpi(SpiDefine spiDefine);

    /**
     * 删除spi
     * @param spiId
     * @return
     */
    boolean deleteSpi(String spiId);

    /**
     * 更新spi
     * @param spiDefine
     * @return
     */
    boolean updateSpi(SpiDefine spiDefine);

    /**
     * spi上线
     * @param spiId
     * @return
     */
    boolean useSpi(String spiId);

    /**
     * spi下线
     * @param spiId
     * @return
     */
    boolean unUseSpi(String spiId);

}
