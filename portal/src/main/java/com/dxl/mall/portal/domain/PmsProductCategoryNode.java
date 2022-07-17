package com.dxl.mall.portal.domain;

import com.dxl.mall.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



public class PmsProductCategoryNode extends PmsProductCategory {
    @ApiModelProperty("子分类集合")
    private List<PmsProductCategoryNode> children;

    public PmsProductCategoryNode() {
    }

    public PmsProductCategoryNode(List<PmsProductCategoryNode> children) {
        this.children = children;
    }

    public List<PmsProductCategoryNode> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategoryNode> children) {
        this.children = children;
    }
}
