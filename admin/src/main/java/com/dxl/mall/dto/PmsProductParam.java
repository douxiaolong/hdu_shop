package com.dxl.mall.dto;

import com.dxl.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Objects;


public class PmsProductParam extends PmsProduct{
    @ApiModelProperty("商品阶梯价格设置")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品会员价格设置")
    private List<PmsMemberPrice> memberPriceList;
    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品参数及自定义规格属性")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("专题和商品关系")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("优选专区和商品的关系")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;

    public PmsProductParam(List<PmsProductLadder> productLadderList, List<PmsProductFullReduction> productFullReductionList, List<PmsMemberPrice> memberPriceList, List<PmsSkuStock> skuStockList, List<PmsProductAttributeValue> productAttributeValueList, List<CmsSubjectProductRelation> subjectProductRelationList, List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.productLadderList = productLadderList;
        this.productFullReductionList = productFullReductionList;
        this.memberPriceList = memberPriceList;
        this.skuStockList = skuStockList;
        this.productAttributeValueList = productAttributeValueList;
        this.subjectProductRelationList = subjectProductRelationList;
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }

    public PmsProductParam() {
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<CmsSubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

    public List<CmsPrefrenceAreaProductRelation> getPrefrenceAreaProductRelationList() {
        return prefrenceAreaProductRelationList;
    }

    public void setPrefrenceAreaProductRelationList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PmsProductParam)) return false;
        PmsProductParam that = (PmsProductParam) o;
        return Objects.equals(productLadderList, that.productLadderList) && Objects.equals(productFullReductionList, that.productFullReductionList) && Objects.equals(memberPriceList, that.memberPriceList) && Objects.equals(skuStockList, that.skuStockList) && Objects.equals(productAttributeValueList, that.productAttributeValueList) && Objects.equals(subjectProductRelationList, that.subjectProductRelationList) && Objects.equals(prefrenceAreaProductRelationList, that.prefrenceAreaProductRelationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productLadderList, productFullReductionList, memberPriceList, skuStockList, productAttributeValueList, subjectProductRelationList, prefrenceAreaProductRelationList);
    }
}
