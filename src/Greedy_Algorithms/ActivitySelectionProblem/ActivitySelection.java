package Greedy_Algorithms.ActivitySelectionProblem;

import java.util.*;

public class ActivitySelection {
    static void activitySelection(ArrayList<Activity> activityList){
        Comparator<Activity> finishTimeComparator = new Comparator<Activity>(){
            @Override
            public int compare(Activity o1,Activity o2) {
                return o1.getEndTime()-o2.getEndTime();
            }
        };
        Collections.sort(activityList, finishTimeComparator);
        Activity previousActivity = activityList.get(0);
        System.out.println("\n\nRecommended Schedule:\n"+activityList.get(0));
        for(int i=1;i<activityList.size();i++){
            Activity activity = activityList.get(i);
            if(activity.getStartTime()>=previousActivity.getEndTime()){
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }
}
