package org.asocframework.spi.biz.service;

/**
 * @author jiqing
 * @version $Id: MockTestService，v 1.0 2017/11/9 16:36 jiqing Exp $
 * @desc 测试服务
 */
public interface MockTestService {

    /**
     * 暂时mock测试,不实现
     * @param spiId
     * @param supportId
     * @return
     */
    boolean mockSpi(String spiId, String supportId);

    /**
     * 检查服务商spi接口是否有效。
     * @param spiId
     * @param supportId
     * @return
     */
    boolean active(String spiId, String supportId);

}
