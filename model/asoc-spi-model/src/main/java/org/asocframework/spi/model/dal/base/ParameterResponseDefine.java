package org.asocframework.spi.model.dal.base;

/**
 * @author jiqing
 * @version $Id: ParameterOutDefine，v 1.0 2017/10/27 10:12 jiqing Exp $
 * @desc
 */
public class ParameterResponseDefine extends ParameterDefine<ParameterResponseDefine>{


    private String spiId;

    private String responseName;

    private Integer systemParamType;

    /**
     * 是否返回（0：否，1是）默认：1
     */
    private Integer isReturn = 1;

    public String getSpiId() {
        return spiId;
    }

    public void setSpiId(String spiId) {
        this.spiId = spiId;
    }

    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

    public Integer getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
    }

    public Integer getSystemParamType() {
        return systemParamType;
    }

    public void setSystemParamType(Integer systemParamType) {
        this.systemParamType = systemParamType;
    }
}
