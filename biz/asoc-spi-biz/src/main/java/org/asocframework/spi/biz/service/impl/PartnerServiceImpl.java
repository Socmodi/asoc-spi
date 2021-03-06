package org.asocframework.spi.biz.service.impl;

import org.asocframework.spi.model.dal.define.SpiProviderDefine;
import org.asocframework.spi.model.dal.partner.Partner;
import org.asocframework.spi.biz.service.PartnerService;
import org.springframework.stereotype.Service;

/**
 * @author jiqing
 * @version $Id: PartnerServiceImpl，v 1.0 2017/11/9 19:45 jiqing Exp $
 * @desc
 */
@Service
public class PartnerServiceImpl implements PartnerService{

    public void registerPartner(Partner partner) {

    }

    public boolean supportSpi(SpiProviderDefine spiProviderDefine) {
        return false;
    }

    public boolean cancelSupportSpi(String supportId) {
        return false;
    }

    public boolean getPartnerSupportSpis(String PartnerId) {
        return false;
    }

    public String refreshToken(String partnerId) {
        return null;
    }
}
