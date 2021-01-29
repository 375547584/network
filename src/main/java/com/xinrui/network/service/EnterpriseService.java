package com.xinrui.network.service;

import com.xinrui.network.entity.Enterprise;

import java.util.List;

public interface EnterpriseService {

    List<Enterprise> get(String name, String licenseNumber);
}
