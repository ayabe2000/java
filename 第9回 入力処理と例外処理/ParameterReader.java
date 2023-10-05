import java.io.*;
import java.util.*;

public class ParameterReader{
    InputStreamReader isr;
    BufferedReader br;

    public ParameterReader(){
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }
    public void putMessage(String message){
        System.out.println(message);
    }
    public TankParameters readTankParameters(String tankName){
        TankParameters tankParameters = new TankParameters();
        while(true){
            putMessage("Input params for "+tankName+": tank area, init. level, drainage coef.>");
            String line="";
            try{
                line = br.readLine();
            }catch (IOException e){
                System.out.println("IOException: " +e);
                System.exit(0);
            }
            if(line == null){
                putMessage("No input");
                System.exit(0);
            }
            StringTokenizer st = new StringTokenizer(line,",");
            if(st.hasMoreTokens()){
                String token = st.nextToken();
                try{
                    double tankArea = Double.parseDouble(token);
                    tankParameters.setTankArea(tankArea);
                }catch(NumberFormatException e){
                    System.out.println("Unble to parse " + token + " as double");
                }
            }
            if(st.hasMoreTokens()){
                String token = st.nextToken();
                try{
                    double initialLevel = Double.parseDouble(token);
                    tankParameters.setInitialLevel(initialLevel);
                }catch(NumberFormatException e){
                    System.out.println("Unble to parse "+ token + " as double");
                }
            }
            if(st.hasMoreTokens()){
                String token = st.nextToken();
                try{
                    double drainageCoefficient = Double.parseDouble(token);
                    tankParameters.setDrainageCoefficient(drainageCoefficient);
                }catch(NumberFormatException e){
                    System.out.println("Unable to parse "+ token + "as double");
                }
            }
            if (tankParameters.isParametersValid()) {
                return tankParameters;
            }else{
                putMessage(tankParameters.getMessage());
            }
        }
    }
    public double readFlowRate(){
        while(true){
            putMessage("Input flow rate>");
            String line="";
            try{
                line = br.readLine();
            }catch (IOException e){
                System.out.println("IOException: " +e);
                System.exit(0);
            }
            if(line == null){
                putMessage("No input");
                System.exit(0);
            }
            StringTokenizer st = new StringTokenizer(line,",");
            if (st.hasMoreTokens()){
                String token = st.nextToken();
                try{
                    double flowRate = Double.parseDouble(token);
                    if(flowRate>0){
                        return flowRate;
                    }else{
                        putMessage("Flow Rate " + token + "should be positive number");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Unable to parse " + token + "as double");
                }
            }
        }
    }
    public static void main(String args[]){
        final int NUMBER_OF_TANKS = 3;
        ParameterReader ParameterReader = new ParameterReader();
        double flowRate = ParameterReader.readFlowRate();
        System.out.println("Flow Rate = " + flowRate);
        for(int i=0;i<NUMBER_OF_TANKS; i++){
            String tankName = "Tank"+i;
            TankParameters tankParameters = ParameterReader.readTankParameters(tankName);
            System.out.println(" Paramr of" + tankName + "=" +tankParameters);
        }
    }
}