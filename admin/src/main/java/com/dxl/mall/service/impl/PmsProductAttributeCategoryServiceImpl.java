package com.dxl.mall.service.impl;

import com.dxl.mall.dao.PmsProductAttributeCategoryDao;
import com.dxl.mall.dao.PmsProductAttributeDao;
import com.dxl.mall.dto.PmsProductAttributeCategoryItem;
import com.dxl.mall.dto.PmsProductAttributeParam;
import com.dxl.mall.dto.ProductAttrInfo;
import com.dxl.mall.mapper.PmsProductAttributeCategoryMapper;
import com.dxl.mall.mapper.PmsProductAttributeMapper;
import com.dxl.mall.model.PmsProductAttribute;
import com.dxl.mall.model.PmsProductAttributeCategory;
import com.dxl.mall.model.PmsProductAttributeCategoryExample;
import com.dxl.mall.model.PmsProductAttributeExample;
import com.dxl.mall.service.PmsProductAttributeCategoryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;

    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);
    }

    @Override
    public int delete(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}