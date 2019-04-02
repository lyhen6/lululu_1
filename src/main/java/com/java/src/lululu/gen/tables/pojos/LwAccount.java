/*
 * This file is generated by jOOQ.
 */
package com.java.src.lululu.gen.tables.pojos;


import com.java.src.lululu.gen.enums.LwAccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LwAccount implements Serializable {

    private static final long serialVersionUID = -1314661178;

    private Long          id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String        remarks;
    private UInteger      delFlag;
    private String        name;
    private String        mobile;
    private String        password;
    private String        photo;
    private String        loginName;
    private Integer       sex;
    private String        address;
    private String        token;
    private String        wxOpenid;
    private LocalDate     birthday;
    private Long          shopId;
    private LwAccountType type;
    private String        salt;

    public LwAccount() {}

    public LwAccount(LwAccount value) {
        this.id = value.id;
        this.createDate = value.createDate;
        this.updateDate = value.updateDate;
        this.remarks = value.remarks;
        this.delFlag = value.delFlag;
        this.name = value.name;
        this.mobile = value.mobile;
        this.password = value.password;
        this.photo = value.photo;
        this.loginName = value.loginName;
        this.sex = value.sex;
        this.address = value.address;
        this.token = value.token;
        this.wxOpenid = value.wxOpenid;
        this.birthday = value.birthday;
        this.shopId = value.shopId;
        this.type = value.type;
        this.salt = value.salt;
    }

    public LwAccount(
        Long          id,
        LocalDateTime createDate,
        LocalDateTime updateDate,
        String        remarks,
        UInteger      delFlag,
        String        name,
        String        mobile,
        String        password,
        String        photo,
        String        loginName,
        Integer       sex,
        String        address,
        String        token,
        String        wxOpenid,
        LocalDate     birthday,
        Long          shopId,
        LwAccountType type,
        String        salt
    ) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.remarks = remarks;
        this.delFlag = delFlag;
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.photo = photo;
        this.loginName = loginName;
        this.sex = sex;
        this.address = address;
        this.token = token;
        this.wxOpenid = wxOpenid;
        this.birthday = birthday;
        this.shopId = shopId;
        this.type = type;
        this.salt = salt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public UInteger getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(UInteger delFlag) {
        this.delFlag = delFlag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWxOpenid() {
        return this.wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public LwAccountType getType() {
        return this.type;
    }

    public void setType(LwAccountType type) {
        this.type = type;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LwAccount (");

        sb.append(id);
        sb.append(", ").append(createDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(remarks);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(name);
        sb.append(", ").append(mobile);
        sb.append(", ").append(password);
        sb.append(", ").append(photo);
        sb.append(", ").append(loginName);
        sb.append(", ").append(sex);
        sb.append(", ").append(address);
        sb.append(", ").append(token);
        sb.append(", ").append(wxOpenid);
        sb.append(", ").append(birthday);
        sb.append(", ").append(shopId);
        sb.append(", ").append(type);
        sb.append(", ").append(salt);

        sb.append(")");
        return sb.toString();
    }
}