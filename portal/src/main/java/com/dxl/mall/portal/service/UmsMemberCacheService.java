package com.dxl.mall.portal.service;

import com.dxl.mall.model.UmsMember;


public interface UmsMemberCacheService {
    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMemberByTelephone(String telephone);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置会员用户缓存
     */
    void setMemberByTelephone(UmsMember member);


    /**
     * 设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);
}