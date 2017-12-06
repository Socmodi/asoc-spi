package org.asocframework.spi.controller;

import org.asocframework.spi.biz.service.SpiGatewayService;
import org.asocframework.spi.model.invoke.SpiRequest;
import org.asocframework.spi.model.invoke.SpiResponse;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jiqing
 * @version $Id: SpiController，v 1.0 2017/11/9 17:27 jiqing Exp $
 * @desc
 */
@Controller
public class SpiGatewayController {

    @Resource
    private SpiGatewayService spiGatewayService;

    public void invoke(HttpServletRequest request, HttpServletResponse response){

        String method = request.getParameter("method");
        String appId = request.getParameter("appId");
        String bizContent = request.getParameter("bizContent");
        String version = request.getParameter("version");
        String token = request.getParameter("token");
        String callbackUrl = request.getParameter("callbackUrl");
        String timeStamp = request.getParameter("timeStamp");

        SpiRequest spiRequest = new SpiRequest();
        spiRequest.setBizContent(bizContent);
        spiRequest.setMethod(method);
        spiRequest.setVersion(version);
        spiRequest.setToken(token);
        spiRequest.setCallbackUrl(callbackUrl);
        spiRequest.setTimeStamp(timeStamp);
        spiRequest.setAppId(appId);
        SpiResponse spiResponse = spiGatewayService.invoke(spiRequest);
        writeResponse(spiResponse,response);
    }

    private void writeResponse(SpiResponse spiResponse,HttpServletResponse servletResponse){
    }

}
