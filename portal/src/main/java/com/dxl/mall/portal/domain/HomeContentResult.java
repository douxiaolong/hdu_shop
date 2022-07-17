package com.dxl.mall.portal.domain;

import com.dxl.mall.model.CmsSubject;
import com.dxl.mall.model.PmsBrand;
import com.dxl.mall.model.PmsProduct;
import com.dxl.mall.model.SmsHomeAdvertise;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 首页内容返回信息封装
 */
public class HomeContentResult {
    @ApiModelProperty("轮播广告")
    private List<SmsHomeAdvertise> advertiseList;
    @ApiModelProperty("推荐品牌")
    private List<PmsBrand> brandList;
    @ApiModelProperty("当前秒杀场次")
    private HomeFlashPromotion homeFlashPromotion;
    @ApiModelProperty("新品推荐")
    private List<PmsProduct> newProductList;
    @ApiModelProperty("人气推荐")
    private List<PmsProduct> hotProductList;
    @ApiModelProperty("推荐专题")
    private List<CmsSubject> subjectList;

    public HomeContentResult() {
    }

    public HomeContentResult(List<SmsHomeAdvertise> advertiseList, List<PmsBrand> brandList, HomeFlashPromotion homeFlashPromotion, List<PmsProduct> newProductList, List<PmsProduct> hotProductList, List<CmsSubject> subjectList) {
        this.advertiseList = advertiseList;
        this.brandList = brandList;
        this.homeFlashPromotion = homeFlashPromotion;
        this.newProductList = newProductList;
        this.hotProductList = hotProductList;
        this.subjectList = subjectList;
    }

    public List<SmsHomeAdvertise> getAdvertiseList() {
        return advertiseList;
    }

    public void setAdvertiseList(List<SmsHomeAdvertise> advertiseList) {
        this.advertiseList = advertiseList;
    }

    public List<PmsBrand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<PmsBrand> brandList) {
        this.brandList = brandList;
    }

    public HomeFlashPromotion getHomeFlashPromotion() {
        return homeFlashPromotion;
    }

    public void setHomeFlashPromotion(HomeFlashPromotion homeFlashPromotion) {
        this.homeFlashPromotion = homeFlashPromotion;
    }

    public List<PmsProduct> getNewProductList() {
        return newProductList;
    }

    public void setNewProductList(List<PmsProduct> newProductList) {
        this.newProductList = newProductList;
    }

    public List<PmsProduct> getHotProductList() {
        return hotProductList;
    }

    public void setHotProductList(List<PmsProduct> hotProductList) {
        this.hotProductList = hotProductList;
    }

    public List<CmsSubject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<CmsSubject> subjectList) {
        this.subjectList = subjectList;
    }
}
