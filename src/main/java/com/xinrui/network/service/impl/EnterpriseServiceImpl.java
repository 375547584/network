package com.xinrui.network.service.impl;

import com.xinrui.network.entity.Enterprise;
import com.xinrui.network.mapper.ThirdPartyMapper;
import com.xinrui.network.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private ThirdPartyMapper thirdPartyMapper;

    @Override
    public List<Enterprise> get(String name, String licenseNumber) {
        return thirdPartyMapper.get(name, licenseNumber);
    }
}
