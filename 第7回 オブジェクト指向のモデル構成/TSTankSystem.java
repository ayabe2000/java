public class TSTankSystem{
    public static void main(String args[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        TSWaterSupply tsWaterSupply = new TSWaterSupply();
        TSTank1 tsTank1 = new TSTank1(tsClock);
        TSTank2 tsTank2 = new TSTank2(tsClock);
        TSTank3 tsTank3 = new TSTank3(tsClock);
        System.out.println("time,tank level 1, tank level 2 tank level 3");
        for (int i =0; i<300; i++){
            tsTank1.setInFlow(tsWaterSupply.getFlowRate());
            tsTank2.setInFlow(tsTank1.getDrainageRate());
            tsTank3.setInFlow(tsTank2.getDrainageRate());
            System.out.println(tsClock.getTime() + "," + tsTank1.getTankLevel()
             + "," + tsTank2.getTankLevel() + "," + tsTank3.getTankLevel());
            tsClock.update();
            tsTank1.update();
            tsTank2.update();
            tsTank3.update();


        }
    }
}