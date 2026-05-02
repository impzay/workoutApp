public class UserTraits {
    int totalCalories;
    int totalWorkouts;
    double avgDuration;

    public UserTraits(int totalCalories, int totalWorkouts, double avgDuration){
        this.totalCalories = totalCalories;
        this.totalWorkouts = totalWorkouts;
        this.avgDuration = avgDuration;
    }

    public int getTotalCalories(){
        return this.totalCalories;
    }
}
