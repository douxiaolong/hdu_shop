package com.dxl.mall.dto;

import com.dxl.mall.model.UmsMenu;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class UmsMenuNode extends UmsMenu {

    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;

    public UmsMenuNode(List<UmsMenuNode> children) {
        this.children = children;
    }

    public UmsMenuNode() {
    }

    public List<UmsMenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<UmsMenuNode> children) {
        this.children = children;
    }
}
