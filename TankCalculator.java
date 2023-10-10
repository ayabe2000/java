public class TankCalculator{
    public static void main(String args[]){
        final double FLOW_RATE = 1.0;
        final double TANK_AREA = 20.0;
        final double INITIAL_LEVEL = 10.0;
        double time;
        double tankLevel;

        System.out.println("Flow Rate = "+ FLOW_RATE + "m**3/s");
        System.out.println("Tank Area = "+ TANK_AREA + "m**2");
        System.out.println("Inital Level = " + INITIAL_LEVEL + "m");

        time =30;
        tankLevel = INITIAL_LEVEL + FLOW_RATE*time/TANK_AREA;
        System.out.println("Tank Level at time "+ time + "s =" + tankLevel + "m");
        time =60;
        tankLevel = INITIAL_LEVEL + FLOW_RATE*time/TANK_AREA;
        System.out.println("TANK Level at time " + time + "s =" + tankLevel + "m");
    }
}