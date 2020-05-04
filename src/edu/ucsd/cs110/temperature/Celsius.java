package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    public Temperature toCelsius() {
        return new Celsius( this.getValue() );
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit( this.getValue() );
    }

    public String toString()
    {
        Float t = this.getValue();
        String string = "" + t + " C";
        return string;
    }
}