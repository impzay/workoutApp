public class BMI extends UserTraits{

    public BMI(double height, double weight, int age){
        super(height,weight,age);
    }

    public void calculateBMI(){
        height = Math.sqrt(height);
        double bmi = (weight * 703) / (height * height);
        System.out.println("Your body mass index is: " + bmi);
    }

}
