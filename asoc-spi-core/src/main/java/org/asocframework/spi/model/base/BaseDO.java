package org.asocframework.spi.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiqing
 * @version $Id: BaseDO，v 1.0 2017/10/27 10:49 jiqing Exp $
 * @desc
 */
public class BaseDO implements Serializable{

    private String createUser;

    private String updateUser;

    private Date gmtCreated;

    private Date gmtModify;


    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}
