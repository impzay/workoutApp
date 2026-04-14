public class BMI {

    private double weight;
    private double height;

    public BMI(double w, double h){
        this.weight = w;
        this.height = h;
    }


    public void calculateBMI(){
        height = Math.sqrt(height);
        double bmi = (weight * 703) / height;
        System.out.println("Your body mass index is: " + bmi);
    }

}
