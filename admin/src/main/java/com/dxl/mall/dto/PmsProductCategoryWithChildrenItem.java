package com.dxl.mall.dto;

import com.dxl.mall.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含子级分类的商品分类
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;

    public PmsProductCategoryWithChildrenItem(List<PmsProductCategory> children) {
        this.children = children;
    }

    public PmsProductCategoryWithChildrenItem() {
    }

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
