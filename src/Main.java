import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        BigDecimal minTemperature= BigDecimal.valueOf(20);
        BigDecimal maxTemperature =BigDecimal.valueOf(27);
        Thermometer thermometer= new Thermometer(minTemperature,maxTemperature);
        Parents mom =new Parents("Anna");
        Parents dad = new Parents("John");

        thermometer.add(mom);
        thermometer.add(dad);


        for(int i =thermometer.getInstantTemperature().intValue();i<=30;i++){

            thermometer.setInstantTemperature(BigDecimal.valueOf(i));
        }

        for(int i =thermometer.getInstantTemperature().intValue();i>19;i--){

            thermometer.setInstantTemperature(BigDecimal.valueOf(i-1));
        }

    }
}
