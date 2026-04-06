public class Stats {
    int totalCalories;
    int totalWorkouts;
    double avgDuration;

    public Stats(int totalCalories, int totalWorkouts, double avgDuration){
        this.totalCalories = totalCalories;
        this.totalWorkouts = totalWorkouts;
        this.avgDuration = avgDuration;
    }

    public int getTotalCalories(){
        return this.totalCalories;
    }
}
