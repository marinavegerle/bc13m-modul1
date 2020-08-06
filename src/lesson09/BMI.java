package lesson09;

public class BMI {
    public static void main(String[] args) {
        double height = 175.0;
        double weight = 100.0;
        findBmi(height,weight);
        System.out.println(findBmi(height,weight));
    }
    public static double findBmi(double height, double weight){
        height/=100;
        return weight/(height*height);
    }


}
