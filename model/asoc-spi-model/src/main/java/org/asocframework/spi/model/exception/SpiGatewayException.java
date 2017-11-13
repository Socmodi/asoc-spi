package org.asocframework.spi.model.exception;

import org.asocframework.support.result.StateCode;

/**
 * @author jiqing
 * @version $Id: SpiGatewayException，v 1.0 2017/11/10 16:42 jiqing Exp $
 * @desc
 */
public class SpiGatewayException extends RuntimeException{

    private StateCode stateCode;

    public SpiGatewayException(StateCode stateCode, String msg,
                            Exception e) {
        super(msg, e);
        this.stateCode = stateCode;
    }

    public SpiGatewayException(StateCode stateCode, String msg) {
        this(stateCode, msg, null);
    }

    public StateCode getStateCode() {
        return this.stateCode;
    }

}
