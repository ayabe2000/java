public class TSClock{
    private final double INITIAL_TIME = 0.0;
    private double timeStep;
    private double time;
    public TSClock(){
        time = INITIAL_TIME;
    }

    public void setTimeStep(double timeStep){
        this.timeStep = timeStep;
    }

    public double getTimeStep(){
        return timeStep;
    }

    public double getTime(){
        return time;
    }

    public void update(){
        time += timeStep;
    }

    public static void main(String args[]){
        TSClock tsClock = new TSClock();
        tsClock.setTimeStep(0.1);
        for (int i=0; i<10; i++){
            System.out.println("Iteration = " + i + " Time = " + tsClock.getTime());
            tsClock.update();
        }
    }
}