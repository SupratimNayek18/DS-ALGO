package Greedy_Algorithms.ActivitySelectionProblem;

public class Activity {
    private String name;
    private int startTime;
    private int endTime;

    Activity(String name,int startTime,int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }

    int getStartTime() {
        return startTime;
    }

    void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    int getEndTime() {
        return endTime;
    }

    void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Activity :"+name+", startTime :"+startTime+", endTime :"+endTime;
    }

    
}
