package talks.mjc.Module3.finalTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahrenheit = (float) ((temperatureCelsius * 1.8) + 32);
        System.out.println(fahrenheit);
        //(°C * 1.8) + 32 = °F
    }
}
