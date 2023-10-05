public class TankCalculator2{
    public static void main(String args[]){
        final double Tank_AREA = 20.0;
        final double INITIAL_LEVEL = 10.0;
        double flow[]
        = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,0.0};
        double tankLevel[] = new double[flow.length];

        tankLevel[0] = INITIAL_LEVEL;
        for (int i = 0; i<flow.length-1; i++){
            tankLevel[i+1] = tankLevel[i] + flow[i]/Tank_AREA;
        }
        System.out.println("Time(s),Flow(m**3/s),Tank Level(m)");
        for (int i =0; i<flow.length; i++){
            double time = i*1.0;
            System.out.println(time + "," + flow[i] + "," + tankLevel[i]);
        }
    }
}