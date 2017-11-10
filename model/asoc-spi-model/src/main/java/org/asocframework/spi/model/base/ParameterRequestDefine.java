package org.asocframework.spi.model.base;

/**
 * @author jiqing
 * @version $Id: ParameterInDefine，v 1.0 2017/10/27 10:12 jiqing Exp $
 * @desc
 */
public class ParameterRequestDefine extends ParameterDefine<ParameterRequestDefine>{

    private String spiId;

    private Integer systemParamType;

    private String requestName;

    public String getSpiId() {
        return spiId;
    }

    public void setSpiId(String spiId) {
        this.spiId = spiId;
    }
    public Integer getSystemParamType() {
        return systemParamType;
    }

    public void setSystemParamType(Integer systemParamType) {
        this.systemParamType = systemParamType;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
}
