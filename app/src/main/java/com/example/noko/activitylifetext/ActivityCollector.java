package com.example.noko.activitylifetext;

import android.app.Activity;
import android.view.View;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noko on 2016/11/28 0028.
 */
//活动管理器
public class ActivityCollector {
//    创建一个新的List来储存活动
    public static List<Activity> activities = new ArrayList<Activity>();
//    写三个方法，分别是添加活动，移除活动，结束所有活动
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeactivity(Activity activity){
        activities.remove(activity);
    }
//    采取for（循环变量类型 循环变量类型 ：要遍历的对象）{循环体}
    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
