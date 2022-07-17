package com.dxl.mall.service;

import com.dxl.mall.model.CmsSubject;

import java.util.List;


public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}