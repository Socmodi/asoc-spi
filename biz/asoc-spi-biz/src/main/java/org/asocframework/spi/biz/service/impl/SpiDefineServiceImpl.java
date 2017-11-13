package org.asocframework.spi.biz.service.impl;

import org.asocframework.spi.model.dal.define.SpiDefine;
import org.asocframework.spi.biz.service.SpiDefineService;
import org.springframework.stereotype.Service;

/**
 * @author jiqing
 * @version $Id: SpiDefineServiceImpl，v 1.0 2017/11/9 19:45 jiqing Exp $
 * @desc
 */
@Service
public class SpiDefineServiceImpl implements SpiDefineService{

    public void registerSpi(SpiDefine spiDefine) {

    }

    public boolean deleteSpi(String spiId) {
        return false;
    }

    public boolean updateSpi(SpiDefine spiDefine) {
        return false;
    }

    public boolean useSpi(String spiId) {
        return false;
    }

    public boolean unUseSpi(String spiId) {
        return false;
    }
}
