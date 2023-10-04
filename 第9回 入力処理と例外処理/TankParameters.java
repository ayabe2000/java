public class TankParameters {
    private double tankArea = 0;
    private double initialLevel = 0;
    private double drainageCoefficient = 0;
    private boolean tankAreaDefined = false;
    private boolean initialLevelDefined = false;
    private boolean drainageCoefficientDefined = false;
    private String message;

    public boolean isParametersValid() {
        message = "";
        if (!tankAreaDefined) {
            message += "Tank Area is not set;";
            return false;
        }
        if (!initialLevelDefined) {
            message += "Initial Level is not set;";
            return false;
        }
        if (!drainageCoefficientDefined) {
            message += "Drainage Coefficient is not set;";
            return false;
        }
        if (tankArea <= 0) {
            message += "TankArea is non positive; ";
            return false;
        }
        if (initialLevel < 0) {
            message += "InitialLevel is negative; ";
            return false;
        }
        if (drainageCoefficient < 0) {
            message += "Drainage Coefficient is negative; ";
            return false;
        }
        return true;
    }

    public void setTankArea(double tankArea) {
        tankAreaDefined = true;
        this.tankArea = tankArea;
    }

    public void setInitialLevel(double initialLevel) {
        initialLevelDefined = true;
        this.initialLevel = initialLevel;
    }

    public void setDrainageCoefficient(double drainageCoefficient) {
        drainageCoefficientDefined = true;
        this.drainageCoefficient = drainageCoefficient;
    }

    public String getMessage() {
        return message;
    }
    
    @Override
    public String toString() {
        return "Tank Area = " + tankArea + ", Init Level = " +
                initialLevel + ", Drainage Coef. = " + drainageCoefficient;
    }
}
