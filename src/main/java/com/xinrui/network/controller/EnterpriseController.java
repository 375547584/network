package com.xinrui.network.controller;

import com.xinrui.network.entity.Enterprise;
import com.xinrui.network.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @RequestMapping("get")
    public List<Enterprise> get(String name, String licenseNumber) {
        return enterpriseService.get(name, licenseNumber);
    }
}
