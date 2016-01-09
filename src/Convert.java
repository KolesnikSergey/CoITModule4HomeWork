/**
 * Created by kolesnik_s on 09.01.16.
 */
public abstract class Convert {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public abstract void calculate();
}

class FarhToCel extends Convert {
    public FarhToCel(double fahrenheit) {
        this.setTemperature(fahrenheit);
    }

    @Override
    public void calculate() {
        System.out.println(this.getTemperature()+" Fahrenheit is eqval "+(this.getTemperature()-32)/1.8 +" Celcius");
    }
}

class CelToFarh extends Convert {
    public CelToFarh(double celsius) {
        this.setTemperature(celsius);
    }

    @Override
    public void calculate() {
        System.out.println(this.getTemperature()+" Celcius is eqval "+(this.getTemperature()*1.8)+32 +" Fahrenheit");
    }
}