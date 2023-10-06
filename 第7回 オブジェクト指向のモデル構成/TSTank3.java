public class TSTank3{
    private final double TANK_AREA =4;
    private final double INITIAL_TANK_LEVEL = 1;
    private final double DRAINAGE_COEFFICIENT = 0.6;
    private double storedVolume;
    private double inFlow;
    private TSClock tsClock;

    public TSTank3(TSClock tsClock){
        this.tsClock = tsClock;
        storedVolume = INITIAL_TANK_LEVEL * TANK_AREA;
    }

    public double getTankLevel(){
        return storedVolume/TANK_AREA;
    }

    public void setInFlow(double inFlow){
        this.inFlow = inFlow;
    }

    public double getInFlow(){
        return inFlow;
    }

    public double getDrainageRate(){
        return DRAINAGE_COEFFICIENT*getTankLevel();
    }

    public void update(){
        storedVolume += tsClock.getTimeStep()*(inFlow - getDrainageRate());
        if (storedVolume < 0){
            storedVolume = 0.0;
        }
    }

    public static void main(String args[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        TSTank3 tsTank3 = new TSTank3(tsClock);
        System.out.println("time,tank level");
        for (int i=0;i<100;i++){
            tsTank3.setInFlow(1.0);
            System.out.println(tsClock.getTime() + "," + tsTank3.getTankLevel());
            tsClock.update();
            tsTank3.update();
        }
    }
}