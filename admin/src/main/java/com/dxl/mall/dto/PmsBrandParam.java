package com.dxl.mall.dto;

import com.dxl.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class PmsBrandParam {
    @NotEmpty
    @ApiModelProperty(value = "品牌名称",required = true)
    private String name;
    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;
    @Min(value = 0)
    @ApiModelProperty(value = "排序字段")
    private Integer sort;
    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    @ApiModelProperty(value = "是否为厂家制造商")
    private Integer factoryStatus;
    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    @ApiModelProperty(value = "是否进行显示")
    private Integer showStatus;
    @NotEmpty
    @ApiModelProperty(value = "品牌logo",required = true)
    private String logo;
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;

    public PmsBrandParam(String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, String logo, String bigPic, String brandStory) {
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.logo = logo;
        this.bigPic = bigPic;
        this.brandStory = brandStory;
    }

    public PmsBrandParam() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBrandParam that = (PmsBrandParam) o;
        return Objects.equals(name, that.name) && Objects.equals(firstLetter, that.firstLetter) && Objects.equals(sort, that.sort) && Objects.equals(factoryStatus, that.factoryStatus) && Objects.equals(showStatus, that.showStatus) && Objects.equals(logo, that.logo) && Objects.equals(bigPic, that.bigPic) && Objects.equals(brandStory, that.brandStory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstLetter, sort, factoryStatus, showStatus, logo, bigPic, brandStory);
    }
}
