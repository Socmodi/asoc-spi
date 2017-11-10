package org.asocframework.spi.service;

import org.asocframework.spi.model.define.SpiProviderDefine;
import org.asocframework.spi.model.partner.Partner;

/**
 * @author jiqing
 * @version $Id: PartnerService，v 1.0 2017/11/9 16:17 jiqing Exp $
 * @desc
 */
public interface PartnerService {

    /**
     * 注册合作伙伴
     * @param partner
     */
    void registerPartner(Partner partner);

    /**
     * 支持spi接口
     * @param spiProviderDefine
     * @return
     */
    boolean supportSpi(SpiProviderDefine spiProviderDefine);

    /**
     * 取消支持spi 接口
     * @param supportId
     * @return
     */
    boolean cancelSupportSpi(String supportId);

    /**
     * 获取parter支持所有账户id
     * @param PartnerId
     * @return
     */
    boolean getPartnerSupportSpis(String PartnerId);

    /**
     * 刷新令牌
     * @param partnerId
     * @return
     */
    String refreshToken(String partnerId);

}
