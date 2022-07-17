package com.dxl.mall.service.impl;

import com.dxl.mall.mapper.OmsCompanyAddressMapper;
import com.dxl.mall.model.OmsCompanyAddress;
import com.dxl.mall.model.OmsCompanyAddressExample;
import com.dxl.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}

