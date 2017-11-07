package org.asocframework.spi.model.define;

/**
 * @author jiqing
 * @version $Id: SpiProviderDefine，v 1.0 2017/10/27 09:53 jiqing Exp $
 * @desc spi 服务商
 */
public class SpiProviderDefine {

    private String spiId;

    private String id;

    private String requestPath;

    private String status;

    public String getSpiId() {
        return spiId;
    }

    public void setSpiId(String spiId) {
        this.spiId = spiId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
