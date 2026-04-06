public class Workout {
    int id;
    int calories;
    int durationMinutes;
    String type;
    String date;

    public Workout(int id, int calories, int durationMinutes, String type, String date){
        this.id = id;
        this.calories = calories;
        this.durationMinutes = durationMinutes;
        this.type = type;
        this.date = date;
    }

    public int getCalories(){
        return this.calories;
    }
}
