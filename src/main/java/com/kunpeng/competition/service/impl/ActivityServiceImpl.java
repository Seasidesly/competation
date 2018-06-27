package com.kunpeng.competition.service.impl;

import com.kunpeng.competition.domain.Activity;
import com.kunpeng.competition.domain.ActivityRepository;
import com.kunpeng.competition.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    @Override
    public Activity findActivityById(Long id) {
        return activityRepository.findById(id).get();
    }

    @Override
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public List<Activity> findActivityByDistance(String distance) {
        return null;
    }

    @Override
    public Activity insertActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity updateActivity(Long id) {
        Activity activity = activityRepository.findById(id).get();
        return activityRepository.save(activity);
    }

    @Override
    public Activity deleteActivity(Long id) {
        Activity activity = activityRepository.findById(id).get();
        activityRepository.delete(activity);
        return activity;
    }
}
