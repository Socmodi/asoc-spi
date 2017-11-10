package org.asocframework.spi.model.define;


import org.asocframework.spi.model.base.ParameterRequestDefine;
import org.asocframework.spi.model.base.ParameterResponseDefine;

import java.util.List;

/**
 * @author jiqing
 * @version $Id: SpiDefine，v 1.0 2017/10/27 09:52 jiqing Exp $
 * @desc
 */
public class SpiDefine {

    private String spiId;

    private String spiName;

    private String spiDesc;

    private String spiVersion;

    private Integer status;

    private List<ParameterRequestDefine> parameterRequestDefines;

    private List<ParameterResponseDefine> parameterResponseDefines;

    public String getSpiId() {
        return spiId;
    }

    public void setSpiId(String spiId) {
        this.spiId = spiId;
    }

    public String getSpiName() {
        return spiName;
    }

    public void setSpiName(String spiName) {
        this.spiName = spiName;
    }

    public String getSpiDesc() {
        return spiDesc;
    }

    public void setSpiDesc(String spiDesc) {
        this.spiDesc = spiDesc;
    }

    public String getSpiVersion() {
        return spiVersion;
    }

    public void setSpiVersion(String spiVersion) {
        this.spiVersion = spiVersion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ParameterRequestDefine> getParameterRequestDefines() {
        return parameterRequestDefines;
    }

    public void setParameterRequestDefines(List<ParameterRequestDefine> parameterRequestDefines) {
        this.parameterRequestDefines = parameterRequestDefines;
    }

    public List<ParameterResponseDefine> getParameterResponseDefines() {
        return parameterResponseDefines;
    }

    public void setParameterResponseDefines(List<ParameterResponseDefine> parameterResponseDefines) {
        this.parameterResponseDefines = parameterResponseDefines;
    }
}
