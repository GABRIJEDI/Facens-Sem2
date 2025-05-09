public class Exercicio4F {
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double temperaturaCelsius = 25.0; // Exemplo de temperatura
        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
        
        System.out.println(temperaturaCelsius + "°C é igual a " + temperaturaFahrenheit + "°F");
    }
}
