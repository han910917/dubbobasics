package com.dubbo.producer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.producer.service.DubboService;

@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {

    @Override
    public String showMessage(String str) {
        return "consumer port is " + str;
    }
}
