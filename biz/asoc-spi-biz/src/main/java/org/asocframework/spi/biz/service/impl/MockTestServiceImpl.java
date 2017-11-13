package org.asocframework.spi.biz.service.impl;

import org.asocframework.spi.biz.service.MockTestService;

/**
 * @author jiqing
 * @version $Id: MockTestServiceImpl，v 1.0 2017/11/9 19:44 jiqing Exp $
 * @desc
 */
public class MockTestServiceImpl implements MockTestService{


    public boolean mockSpi(String spiId, String supportId) {
        return false;
    }

    public boolean active(String spiId, String supportId) {
        return false;
    }


}
