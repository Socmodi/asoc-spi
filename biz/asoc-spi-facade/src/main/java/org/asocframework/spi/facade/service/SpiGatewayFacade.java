package org.asocframework.spi.facade.service;

import org.asocframework.spi.facade.ro.SpiProtocol;
import org.asocframework.support.result.Result;

/**
 * @author jiqing
 * @version $Id: SpiGatewayFacade，v 1.0 2017/11/10 14:14 jiqing Exp $
 * @desc
 */
public interface SpiGatewayFacade {

    Result<SpiProtocol> invoke(SpiProtocol spiProtocol);

}
