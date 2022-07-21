package com.frank.core.entity;

import java.util.Date;

public class MemberUserInfo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户个人资料填写的省份
     */
    private String province;

    /**
     * 普通用户个人资料填写的城市
     */
    private String city;

    /**
     * 国家，如中国为CN
     */
    private String country;

    /**
     * 1[男] 2[女] 0[未知]
     */
    private Integer sex;

    /**
     * 状态 1正常 2禁用
     */
    private Boolean status;

    /**
     * 用户头像
     */
    private String headImgUrl;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否删除 0未删除 1已删除
     */
    private Boolean delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建人名称
     */
    private String creator;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改人名称
     */
    private String updater;

    /**
     * 
     */
    private String userChannel;

    /**
     * 
     */
    private Long relateId;

    /**
     * 
     */
    private String designerName;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 昵称
     * @return nickname 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 用户个人资料填写的省份
     * @return province 用户个人资料填写的省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 用户个人资料填写的省份
     * @param province 用户个人资料填写的省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 普通用户个人资料填写的城市
     * @return city 普通用户个人资料填写的城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 普通用户个人资料填写的城市
     * @param city 普通用户个人资料填写的城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 国家，如中国为CN
     * @return country 国家，如中国为CN
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家，如中国为CN
     * @param country 国家，如中国为CN
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 1[男] 2[女] 0[未知]
     * @return sex 1[男] 2[女] 0[未知]
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 1[男] 2[女] 0[未知]
     * @param sex 1[男] 2[女] 0[未知]
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 状态 1正常 2禁用
     * @return status 状态 1正常 2禁用
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 状态 1正常 2禁用
     * @param status 状态 1正常 2禁用
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 用户头像
     * @return head_img_url 用户头像
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * 用户头像
     * @param headImgUrl 用户头像
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除 0未删除 1已删除
     * @return del_flag 是否删除 0未删除 1已删除
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 是否删除 0未删除 1已删除
     * @param delFlag 是否删除 0未删除 1已删除
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建人名称
     * @return creator 创建人名称
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人名称
     * @param creator 创建人名称
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 修改人
     * @return update_by 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 修改人名称
     * @return updater 修改人名称
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 修改人名称
     * @param updater 修改人名称
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * 
     * @return user_channel 
     */
    public String getUserChannel() {
        return userChannel;
    }

    /**
     * 
     * @param userChannel 
     */
    public void setUserChannel(String userChannel) {
        this.userChannel = userChannel == null ? null : userChannel.trim();
    }

    /**
     * 
     * @return relate_id 
     */
    public Long getRelateId() {
        return relateId;
    }

    /**
     * 
     * @param relateId 
     */
    public void setRelateId(Long relateId) {
        this.relateId = relateId;
    }

    /**
     * 
     * @return designer_name 
     */
    public String getDesignerName() {
        return designerName;
    }

    /**
     * 
     * @param designerName 
     */
    public void setDesignerName(String designerName) {
        this.designerName = designerName == null ? null : designerName.trim();
    }
}