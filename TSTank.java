public class TSTank{
    private double tankArea;
    private double initialTankLevel;
    private double drainageCoefficient;
    private double storedVolume;
    private double inFlow;
    private TSClock tsClock;

    public TSTank(TSClock tsClock,double tankArea,double initialTankLevel,
        double drainageCoefficient){
            this.tsClock = tsClock;
            this.tankArea = tankArea;
            this.initialTankLevel = initialTankLevel;
            this.drainageCoefficient = drainageCoefficient;
            storedVolume = initialTankLevel * tankArea;
        }
    
    public double getTankLevel(){
        return storedVolume/tankArea;
    }

    public void setInFlow(double inFlow){
        this.inFlow = inFlow;
    }

    public double getInFlow(){
        return inFlow;
    }

    public double getDrainageRate(){
        return drainageCoefficient*getTankLevel();
    }

    public void update(){
        storedVolume += tsClock.getTimeStep()*(inFlow - getDrainageRate());
        if (storedVolume < 0){
            storedVolume = 0.0;
        }
    }

    public static void main(String aregs[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        TSTank tsTank = new TSTank(tsClock,10,1,0.5);
        for (int i =0;i<100;i++){
            tsTank.setInFlow(1.0);
            System.out.println(tsClock.getTime() + "," + tsTank.getTankLevel());
            tsClock.update();
            tsTank.update();
        }
    }
}