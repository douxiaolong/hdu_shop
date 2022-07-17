package com.dxl.mall.service.impl;

import com.dxl.mall.mapper.CmsPrefrenceAreaMapper;
import com.dxl.mall.model.CmsPrefrenceArea;
import com.dxl.mall.model.CmsPrefrenceAreaExample;
import com.dxl.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
