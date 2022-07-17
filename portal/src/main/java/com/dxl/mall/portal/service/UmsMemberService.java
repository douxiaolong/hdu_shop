package com.dxl.mall.portal.service;



import com.dxl.mall.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * 会员管理Service
 */
public interface UmsMemberService {
    /**
     * 根据用户名获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 根据手机号获取会员
     */
    UmsMember getByTelephone(String telephone);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Long id);

    /**
     * 用户注册
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone) throws Exception;

    /**
     * 修改密码
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id,Integer integration);


    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByTelephone(String telephone);

    /**
     * 登录后获取token
     */
    String login(String username, String password);

    /**
     * 登录后获取token
     */
    String loginByTelephone(String telephone, String password);

    /**
     * 刷新token
     */
    String refreshToken(String token);
}
