package org.asocframework.spi.common.utils;

import org.asocframework.support.tools.BizUtils;
import org.slf4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dhj
 * @version $Id: BizUtils ,v 0.1 2016/12/16 11:41 dhj Exp $
 * @name
 */
public class LogUtils {

    public static void info(Logger logger, String message) {

        if (logger.isInfoEnabled()) {
            logger.info("bizId="+ BizUtils.getBizId()+"::"+message);
        }
    }

    public static void info(Logger logger, String message, Object obj) {
        if (logger.isInfoEnabled()) {
            logger.info("bizId="+ BizUtils.getBizId()+"::"+message, obj);
        }
    }

    public static void debug(Logger logger, String message) {
        if (logger.isDebugEnabled()) {
            logger.debug("bizId=" + BizUtils.getBizId() + "::" + message);
        }
    }

    public static void debug(Logger logger, String message, Throwable throwable) {
        if (logger.isDebugEnabled()) {
            logger.debug("bizId=" + BizUtils.getBizId() + "::" + message, throwable);
        }
    }

    public static void warn(Logger logger,String message) {
        if (logger.isWarnEnabled()) {
            logger.warn("bizId=" + BizUtils.getBizId() + "::" + message);
        }
    }

    public static void warn(Logger logger,String message, Throwable throwable) {
        if (logger.isWarnEnabled()) {
            logger.warn("bizId=" + BizUtils.getBizId() + "::" + message, throwable);
        }
    }


    public static void error(Logger logger,String message) {
        if (logger.isErrorEnabled()) {
            logger.error("bizId=" + BizUtils.getBizId() + "::" + message);
        }
    }

    public static void error(Logger logger,String message, Throwable throwable) {
        if (logger.isErrorEnabled()) {
            logger.error("bizId="+ BizUtils.getBizId()+"::"+message,throwable);
        }
    }

    /**
     * 将需要保密的数据遮挡打印
     * @param logger
     * @param message
     */
    public static void infoSecurity(Logger logger, String message) {
        if (logger.isInfoEnabled()) {
            logger.info("bizId=" + BizUtils.getBizId() + "::" + findAndReturnStar(message));
        }
    }

    public static void logDebugMessage(Logger logger, String name, Object ... params) {
        if (logger.isDebugEnabled())
            logger.debug("bizId="+ BizUtils.getBizId()+"::"+toLogMessage(name, params));
    }

    private static String toLogMessage(String name, Object ... params) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append("::");
        for (int i = 0 ; i < params.length; i++) {
            stringBuilder.append(params[i]).append("|");
        }
        String message = findAndReturnStar(stringBuilder.toString());
        return message;
    }

    public static String findAndReturnStar(String message) {
        Pattern pattern = Pattern.compile("[0-9]{16}");
        Matcher matcher = pattern.matcher(message);
        if(matcher.find()){
            String cardNo = matcher.group();
            message = message.replaceAll(cardNo.substring(0,12),"************");
        }
        return message;
    }


}
