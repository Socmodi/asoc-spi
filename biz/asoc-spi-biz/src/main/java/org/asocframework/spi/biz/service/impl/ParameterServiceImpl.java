package org.asocframework.spi.biz.service.impl;

import org.asocframework.spi.model.dal.base.ParameterDefine;
import org.asocframework.spi.model.dal.base.ParameterValidator;
import org.asocframework.spi.biz.service.ParameterService;
import org.springframework.stereotype.Service;

/**
 * @author jiqing
 * @version $Id: ParameterServiceImpl，v 1.0 2017/11/9 19:45 jiqing Exp $
 * @desc
 */
@Service
public class ParameterServiceImpl implements ParameterService{

    public boolean registerParameter(ParameterDefine parameterDefine, ParameterValidator parameterValidator) {
        return false;
    }

    public boolean deleteParameter(String parameterId) {
        return false;
    }

    public boolean deleteParameterValidator(String parameterId) {
        return false;
    }

    public boolean updateParameter(ParameterDefine parameterDefine) {
        return false;
    }

    public boolean updateParameterValidator(ParameterValidator parameterValidator) {
        return false;
    }

}
