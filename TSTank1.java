public class TSTank1 {
    private final double TANK_AREA = 10; 
    private final double INITIAL_TANK_LEVEL =1;
    private final double DRAINAGE_COEFFICIENT =0.5;
    private double storedVolume;
    private double inFlow;
    private TSClock tsClock;

    public TSTank1(TSClock tsClock){
        this.tsClock = tsClock;
        storedVolume = INITIAL_TANK_LEVEL * TANK_AREA;
    }

    public double getTankLevel(){
        return storedVolume/TANK_AREA;
    }

    public void setInFlow(double inFlow){
        this.inFlow = inFlow;
    }

    public double getINFlow(){
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
        TSTank1 tsTank1 = new TSTank1(tsClock);
        System.out.println("time tank level");
        for (int i=0; i<100; i++){
            tsTank1.setInFlow(1.0);
            System.out.println(tsClock.getTime() + "," + tsTank1.getTankLevel());
            tsClock.update();
            tsTank1.update();
        }
    }
}
