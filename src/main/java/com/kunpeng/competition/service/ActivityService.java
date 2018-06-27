package com.kunpeng.competition.service;

import com.kunpeng.competition.domain.Activity;

import java.util.List;

/**
 * 业务接口层
 */

public interface ActivityService {

    /***
     * 根据id查活动
     * @return
     */
    Activity findActivityById(Long id);

    /**
     * 查找所有活动
     * @return
     */
    List<Activity> findAll();


    /***
     * 根据距离查找活动
     * @param distance
     * @return
     */
    List<Activity> findActivityByDistance(String distance);


    /***
     * 新增活动
     * @param activity
     * @return
     */
    Activity insertActivity(Activity activity);


    /***
     * 修改活动
     * @param id
     * @return
     */
    Activity updateActivity(Long id);


    /**
     * 删除活动
     * @param id
     * @return
     */
    Activity deleteActivity(Long id);



}
