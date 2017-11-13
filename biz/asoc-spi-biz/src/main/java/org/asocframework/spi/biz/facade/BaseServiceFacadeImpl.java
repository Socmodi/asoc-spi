package org.asocframework.spi.biz.facade;

import org.apache.commons.lang3.StringUtils;
import org.asocframework.spi.common.utils.LogUtils;
import org.asocframework.spi.model.exception.SpiGatewayException;
import org.asocframework.support.result.CommonStateCode;
import org.asocframework.support.result.Result;
import org.asocframework.support.result.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;

/**
 * @author jiqing
 * @version $Id: BaseFacadeServiceImpl，v 1.0 2017/11/10 15:47 jiqing Exp $
 * @desc
 */
public class BaseServiceFacadeImpl {
    protected Logger logger = LoggerFactory.getLogger(BaseServiceFacadeImpl.class);

    public BaseServiceFacadeImpl() {
        logger = LoggerFactory.getLogger(this.getClass());
    }

    protected Result processServiceException(String msg, Exception t) {
        if (t instanceof SpiGatewayException) {
            logger.warn(msg + ", msg:" + t.getMessage(), t);
            return Results.newFailResult(((SpiGatewayException) t).getStateCode(), t.getMessage());
        } else if (t instanceof ExecutionException) {
            logger.warn(msg + ", msg:" + t.getMessage(), t);
            String tMsg = t.getMessage();
            if(!StringUtils.isEmpty(tMsg) && tMsg.indexOf(":")!= -1) {
                tMsg = tMsg.substring(tMsg.indexOf(":")+1,tMsg.length());
            }
            return Results.newFailResult(CommonStateCode.FAIL, tMsg);
        } else {
            logger.error(msg + ", msg:" + t.getMessage(), t);
            return Results.newFailResult(CommonStateCode.FAIL, "system error, release retry");
        }
    }

    protected void logBizMessage(String name, Object ... params) {
        if (logger.isInfoEnabled())
            logger.info(toLogMessage(name, params));
    }
    protected void logDebugMessage(String name, Object ... params) {
        if (logger.isDebugEnabled())
            LogUtils.debug(logger, toLogMessage(name, params));
    }

    private String toLogMessage(String name, Object ... params) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append("::");
        for (int i = 0 ; i < params.length; i++) {
            stringBuilder.append(params[i]).append("|");
        }
        return stringBuilder.toString();
    }
}
