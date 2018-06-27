package com.kunpeng.competition.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

@Entity
@ApiModel(value = "发起活动实体类")
public class Activity implements Serializable{

    @Id
    @ApiModelProperty(value = "活动id")
    @Setter@Getter
    private Long id;

    @Id
    @ApiModelProperty(value = "发起人")
    @Getter@Setter
    private User user;

    @ApiModelProperty(value = "所属标签")
    @Getter@Setter
    private String label;

    @ApiModelProperty(value = "活动标题")
    @Getter@Setter
    private String title;

    @ApiModelProperty(value = "活动时间")
    @Getter@Setter
    private String startTime;

    @ApiModelProperty(value = "发布时间")
    @Getter@Setter
    private String publishTime;

    @ApiModelProperty(value = "活动地点")
    @Getter@Setter
    private String destination;

    @ApiModelProperty(value = "发布地点")
    @Getter@Setter
    private String birthLand;

    @ApiModelProperty(value = "活动介绍")
    @Getter@Setter
    private String introduction;

    @ApiModelProperty(value = "距离")
    @Getter@Setter
    private String distance;


    @ApiModelProperty(value = "参与人")
    @Getter@Setter
    private List<User> participants;


    @ApiModelProperty(value = "参与人数")
    @Getter@Setter
    private Integer number;


}
