package org.asocframework.spi.common.convert;

import org.asocframework.spi.facade.ro.SpiProtocol;
import org.asocframework.spi.model.dal.invoke.SpiRequest;

/**
 * @author jiqing
 * @version $Id: SpiConverter，v 1.0 2017/11/10 15:31 jiqing Exp $
 * @desc
 */
public class SpiConverter {

    private SpiConverter() {
    }

    /**
     * 把SpiProtocal转化为SpiRequest
     * @param spiProtocol
     * @return
     */
    public static SpiRequest spiProtocalToSpiRequest(SpiProtocol spiProtocol) {
        if (spiProtocol == null) {
            return null;
        }
        SpiRequest spiRequest = new SpiRequest();
        spiRequest.setMethod(spiProtocol.getMethod());
        spiRequest.setVersion(spiProtocol.getVersion());
        spiRequest.setCallbackUrl(spiProtocol.getCallbackUrl());
        spiRequest.setBizContent(spiProtocol.getBizContent());
        spiRequest.setToken(spiProtocol.getToken());
        spiRequest.setTimeStamp(spiProtocol.getTimeStamp());
        spiRequest.setAppId(spiProtocol.getAppId());
        return spiRequest;
    }

}
