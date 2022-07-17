package com.dxl.mall.portal.service;

import com.dxl.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

/**
 * 会员商品收藏管理Service
 */
public interface MemberCollectionService {
    /**
     * 添加收藏
     */
    int add(MemberProductCollection productCollection);

    /**
     * 删除收藏
     */
    int delete(Long productId);

    /**
     * 分页查询收藏
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    /**
     * 查看收藏详情
     */
    MemberProductCollection detail(Long productId);

    /**
     * 清空收藏
     */
    void clear();
}
