package com.xinrui.network.mapper;

import com.xinrui.network.entity.Enterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThirdPartyMapper {

    List<Enterprise> get(@Param("name") String name, @Param("licenseNumber") String licenseNumber);
}
