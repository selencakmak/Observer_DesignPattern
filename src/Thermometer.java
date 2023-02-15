import java.math.BigDecimal;

public class Thermometer extends Observable{
    private BigDecimal instantTemperature;
    private BigDecimal minTemperature;
    private BigDecimal maxTemperature;

    public Thermometer(BigDecimal minTemperature, BigDecimal maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.instantTemperature= BigDecimal.valueOf(22);
    }

    public BigDecimal getInstantTemperature() {
        return instantTemperature;
    }

    public void setInstantTemperature(BigDecimal instantTemperature) {
        this.instantTemperature = instantTemperature;
        System.out.println(instantTemperature);
        controlTemperature();
    }

    private void controlTemperature(){
        boolean tooHot = instantTemperature.compareTo(maxTemperature)>=0;
        boolean tooCold = instantTemperature.compareTo(minTemperature)<=0;
        if(tooHot || tooCold){

            alert();
        }

    }
}

