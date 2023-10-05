public class TSTankSystem2{
    public static void main(String args[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        TSWaterSupply tsWaterSupply = new TSWaterSupply();
        TSTank tsTanks[] = new TSTank[3];
        tsTanks[0] = new TSTank(tsClock,10.0,1.0,0.5);
        tsTanks[1] = new TSTank(tsClock,5.0,3.0,0.3);
        tsTanks[2] = new TSTank(tsClock,4.0,1.0,0.6);
        
        System.out.println("time,tank level 1, tank level 2, tank level 3");
        
        for (int i = 0; i < 100; i++) {
            for (int j=0;j<tsTanks.length;j++){
                if(j==0){
                    tsTanks[j].setInFlow(tsWaterSupply.getFlowRate());
                }else{
                    tsTanks[j].setInFlow(tsTanks[j-1].getDrainageRate());
                }
            }
            
            System.out.println(tsClock.getTime() + "," + tsTanks[0].getTankLevel()
                + "," + tsTanks[1].getTankLevel() + "," + tsTanks[2].getTankLevel());
            
            tsClock.update();
            for (int j=0;j<tsTanks.length;j++){
                tsTanks[j].update();
            }
        }
    }
}
