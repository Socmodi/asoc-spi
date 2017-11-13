package org.asocframework.spi.biz.service;

import org.asocframework.spi.model.dal.base.ParameterDefine;
import org.asocframework.spi.model.dal.base.ParameterValidator;

/**
 * @author jiqing
 * @version $Id: ParameterService，v 1.0 2017/11/9 16:19 jiqing Exp $
 * @desc
 */
public interface ParameterService {

    /**
     * 为spi注册参数
     * @param parameterDefine
     * @param parameterValidator
     * @return
     */
    boolean registerParameter(ParameterDefine parameterDefine, ParameterValidator parameterValidator);

    /**
     * 删除参数
     * @param parameterId
     * @return
     */
    boolean deleteParameter(String parameterId);

    /**
     * 删除参数校验
     * @param parameterId
     * @return
     */
    boolean deleteParameterValidator(String parameterId);

    /**
     * 更新参数
     * @param parameterDefine
     * @return
     */
    boolean updateParameter(ParameterDefine parameterDefine);

    /**
     * 更新参数校验
     * @param parameterValidator
     * @return
     */
    boolean updateParameterValidator(ParameterValidator parameterValidator);

}
