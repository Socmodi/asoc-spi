package org.asocframework.spi.model.base;

/**
 * @author jiqing
 * @version $Id: ParameterInDefine，v 1.0 2017/10/27 10:12 jiqing Exp $
 * @desc
 */
public class ParameterRequestDefine extends ParameterDefine<ParameterRequestDefine>{

    private String aspiId;

    private Integer systemParamType;

    private String requestName;

    public String getAspiId() {
        return aspiId;
    }

    public void setAspiId(String aspiId) {
        this.aspiId = aspiId;
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
