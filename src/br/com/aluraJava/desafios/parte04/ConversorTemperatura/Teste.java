package br.com.aluraJava.desafios.parte04.ConversorTemperatura;

public class Teste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        System.out.println(conversor.celsiusParaFahrenheit(25));
        System.out.println(conversor.fahrenheitParaKelvin(72));
        System.out.println(conversor.kelvinParaFahrenheit(357));
        System.out.println(conversor.fahrenheitParaCelsius(90));
        System.out.println(conversor.kelvinParaCelsius(390));
    }
}
