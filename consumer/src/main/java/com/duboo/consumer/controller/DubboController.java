package com.duboo.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.producer.service.DubboService;
import com.example.common.result.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboController {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    @Value("service.port")
    private String port;

    @RequestMapping("/getmessage")
    public ResultVO getMessages(){
        String mess = dubboService.showMessage(port);

        return ResultVO.builder().code(200).message(mess).build();
    }
}
