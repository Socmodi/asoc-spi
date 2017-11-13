package org.asocframework.spi.biz.facade;

import org.asocframework.spi.biz.service.SpiGatewayService;
import org.asocframework.spi.facade.ro.SpiProtocol;
import org.asocframework.spi.facade.service.SpiGatewayFacade;
import org.asocframework.support.result.CommonStateCode;
import org.asocframework.support.result.Result;
import org.asocframework.support.result.Results;
import org.asocframework.support.validator.ValidateState;
import org.asocframework.support.validator.ValidateTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiqing
 * @version $Id: SpiGatewayFacadeImpl，v 1.0 2017/11/10 15:14 jiqing Exp $
 * @desc
 */
@Service("spiGatewayFacade")
public class SpiGatewayFacadeImpl extends BaseServiceFacadeImpl implements SpiGatewayFacade{

    @Resource
    private SpiGatewayService spiGatewayService;

    public Result<SpiProtocol>  invoke(SpiProtocol spiProtocol) {
        Result result = null;
        long start = System.currentTimeMillis();
        try{
            SpiProtocol protocol  = spiGatewayService.invoke(spiProtocol);
            ValidateState state = ValidateTools.volidate(spiProtocol);
            if(state.isPass()){
                result = Results.newSuccessResult(protocol);
            }else{
                result = Results.newFailResult(CommonStateCode.PARAM_ERROR, state.getErrorMsg());
            }
        }catch(Exception t){
            result = (Result<SpiProtocol>) processServiceException("SpiGatewayFacadeImpl.invoke(" + spiProtocol+") error", t);
        }finally {
            logDebugMessage("SpiGatewayFacadeImpl.invoke", "cost:"+(System.currentTimeMillis() - start), spiProtocol, result);
        }
        return result;

    }

}
