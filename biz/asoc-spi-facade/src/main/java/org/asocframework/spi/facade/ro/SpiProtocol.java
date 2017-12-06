package org.asocframework.spi.facade.ro;

import org.asocframework.support.validator.Valid;
import org.asocframework.support.validator.Validator;

import java.io.Serializable;

/**
 * @author jiqing
 * @version $Id: SpiProtocol，v 1.0 2017/11/10 14:14 jiqing Exp $
 * @desc
 */
@Validator
public class SpiProtocol implements Serializable{

    /**
     * 接口名称
     */
    @Valid
    private String method;//serviceName

    /**
     * 版本号
     */
    @Valid(belongs = {"v1.0"})
    private String version;

    /**
     * 回调url
     */
    private String callbackUrl;

    /**
     * 业务参数内容
     */
    @Valid
    private String bizContent;

    /**
     * 授权令牌
     */
    @Valid
    private String token;

    /**
     * 访问时间
     */
    @Valid
    private String timeStamp;

    /**
     * 接口服务提供者id
     */
    @Valid
    private String appId;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getBizContent() {
        return bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
