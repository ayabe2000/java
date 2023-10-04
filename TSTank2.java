public class TSTank2 {
    private final double TANK_AREA = 5;
    private final double INITIAL_TANK_LEVEL =3;
    private final double DRAINAGE_COEFFICIENT = 0.3;
    private double storedVolume;
    private double inFlow;
    private TSClock tsClock;

    public TSTank2(TSClock tsClock){
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
        if (storedVolume <0){
            storedVolume = 0.0;
        }
    }

    public static void main(String args[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        TSTank2 tsTank2 = new TSTank2(tsClock);
        System.out.println("time,tank level");
        for (int i=0; i<100;i++){
            tsTank2.setInFlow(1.0);
            System.out.println(tsClock.getTime() + "," + tsTank2.getTankLevel());
            tsClock.update();
            tsTank2.update();
        }
    }
}