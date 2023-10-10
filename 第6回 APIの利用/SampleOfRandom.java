import java.util.Random;
public class SampleOfRandom{
    public static void main(String args[]){
        Random series1 = new Random();
        Random series2 = new Random(1);
        System.out.println("Series 1, Series 2");
        for (int i=0; i<10; i++){
            int number1 = series1.nextInt(6);
            int number2 = series2.nextInt(6);
            System.out.println(number1+","+number2);
        }
    }
}