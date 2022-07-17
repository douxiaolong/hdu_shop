package com.dxl.mall.service;

import com.dxl.mall.dto.OssCallbackResult;
import com.dxl.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;


public interface OssService {
    /**
     * Oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * Oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
