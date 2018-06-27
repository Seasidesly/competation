package com.kunpeng.competition.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@ApiModel(description = "用户实体类")
public class User implements Serializable{


    @Id
    @GeneratedValue
    @Setter@Getter
    private Long id;

    @Setter@Getter@NonNull
    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    @Setter@Getter@NonNull
    private String pass;

    @ApiModelProperty(value = "性别")
    @Setter@Getter@NonNull
    private String sex;

    @ApiModelProperty(value = "手机号")
    @Setter@Getter@NonNull
    private String phone;

    @ApiModelProperty(value = "个人简介/个性签名")
    @Setter@Getter
    private String introduction;


}
