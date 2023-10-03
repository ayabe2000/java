public class TSWaterSupply {
    private final double flowRate = 1.0;

    public double getFlowRate(){
        return flowRate;
    }

    public static void main(String args[]){
        TSWaterSupply tsWaterSupply = new TSWaterSupply();
        System.out.println("Flow Rate of Water Supply = " + tsWaterSupply.getFlowRate());
    }
}
