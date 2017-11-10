package org.asocframework.spi.model.invoke;

/**
 * @author jiqing
 * @version $Id: SpiRequest，v 1.0 2017/11/9 19:12 jiqing Exp $
 * @desc
 */
public class SpiRequest {

    /**
     * spi 接口名称
     */
    private String method;

    /**
     * 服务商地址
     */
    private String requestPath;

    /**
     * 版本号
     */
    private String version;

    /**
     * 签名
     */
    private String sign;

    /**
     * 签名类型
     */
    private String singType;

    /**
     * 回调url
     */
    private String callbackUrl;

    /**
     * 业务参数内容
     */
    private String bizContent;

    /**
     * 授权令牌
     */
    private String token;

    /**
     * 访问时间
     */
    private String timeStamp;

    /**
     *
     */
    private String appId;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSingType() {
        return singType;
    }

    public void setSingType(String singType) {
        this.singType = singType;
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

}
