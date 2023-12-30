import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Simulate fetching real-time exchange rates from an API
        double usdToEuroRate = 0.85;
        double usdToGBP = 0.73;
        // Add more exchange rates as needed

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        // Simulate fetching exchange rates from an API
        double exchangeRate;
        switch (targetCurrency) {
            case "EUR":
                exchangeRate = usdToEuroRate;
                break;
            case "GBP":
                exchangeRate = usdToGBP;
                break;
            // Add more cases for other currencies
            default:
                System.out.println("Unsupported target currency");
                return;
        }

        double convertedAmount = amountToConvert * exchangeRate;

        System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);
    }
}