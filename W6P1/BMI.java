public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;
    private final double POUND = 0.45359237;
    private final double INCH = 0.0254;

    public BMI(String name,int age,double weight,double feet,double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = inches;
    }

    public double ValueBMI() {
        double bmi = (weight * POUND) / ((height * INCH) * (height * INCH));
        return bmi;
    }

    public String Interpretation() {
        double bmi = ValueBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
