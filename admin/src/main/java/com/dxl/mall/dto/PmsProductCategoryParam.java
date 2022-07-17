package com.dxl.mall.dto;

import com.dxl.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

/**
 * 添加更新产品分类的参数
 */
public class PmsProductCategoryParam {
    @ApiModelProperty("父分类的编号")
    private Long parentId;
    @NotEmpty
    @ApiModelProperty(value = "商品分类名称",required = true)
    private String name;
    @ApiModelProperty("分类单位")
    private String productUnit;
    @FlagValidator(value = {"0","1"},message = "状态只能为0或1")
    @ApiModelProperty("是否在导航栏显示")
    private Integer navStatus;
    @FlagValidator(value = {"0","1"},message = "状态只能为0或1")
    @ApiModelProperty("是否进行显示")
    private Integer showStatus;
    @Min(value = 0)
    @ApiModelProperty("排序")
    private Integer sort;
    @ApiModelProperty("图标")
    private String icon;
    @ApiModelProperty("关键字")
    private String keywords;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("产品相关筛选属性集合")
    private List<Long> productAttributeIdList;

    public PmsProductCategoryParam(Long parentId, String name, String productUnit, Integer navStatus, Integer showStatus, Integer sort, String icon, String keywords, String description, List<Long> productAttributeIdList) {
        this.parentId = parentId;
        this.name = name;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.sort = sort;
        this.icon = icon;
        this.keywords = keywords;
        this.description = description;
        this.productAttributeIdList = productAttributeIdList;
    }

    public PmsProductCategoryParam() {
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getProductAttributeIdList() {
        return productAttributeIdList;
    }

    public void setProductAttributeIdList(List<Long> productAttributeIdList) {
        this.productAttributeIdList = productAttributeIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductCategoryParam that = (PmsProductCategoryParam) o;
        return Objects.equals(parentId, that.parentId) && Objects.equals(name, that.name) && Objects.equals(productUnit, that.productUnit) && Objects.equals(navStatus, that.navStatus) && Objects.equals(showStatus, that.showStatus) && Objects.equals(sort, that.sort) && Objects.equals(icon, that.icon) && Objects.equals(keywords, that.keywords) && Objects.equals(description, that.description) && Objects.equals(productAttributeIdList, that.productAttributeIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, name, productUnit, navStatus, showStatus, sort, icon, keywords, description, productAttributeIdList);
    }
}
