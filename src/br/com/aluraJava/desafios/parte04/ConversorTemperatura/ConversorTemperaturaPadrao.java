package br.com.aluraJava.desafios.parte04.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double celsiusParaKelvin(double celsius) {
        return 40 + 273;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }
    public double kelvinParaCelsius(double kelvin) {
        return kelvin - 273;
    }

    public double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }
}
