# Exchange Rate App

This is a simple currency converter application that retrieves exchange rate data from an NBP API and allows users to convert between PLN (Polish Zloty) and GBP (British Pound).

## Getting Started

To run the Exchange Rate App, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile and run the ExchangeRateApp class, which contains the main method.

## Requirements
- Java version 17 or higher
- Dependencies:
  - Google Gson library version 2.10.1 or higher
  - JUnit library version 4.10 or higher (for testing)
  - JSON library version 20230227 or higher (for testing)

Make sure to include these libraries in your classpath or build configuration.

## Classes

### ExchangeRate

This class represents the exchange rate data retrieved from the API. It contains fields for currency code, rates, currency name, and table type. It also provides methods to retrieve the exchange rate and date.

### CurrencyConverter

This class builds the GUI for the currency converter application using javax.swing. It includes text fields for entering the amount in PLN and GBP, labels for displaying the exchange rate and date, and event listeners for handling conversions.

### RatesItem

This class represents the rate data for a specific currency from the API. It contains fields for the rate number, mid (average) rate, and effective date.

### URLConnectionReader

This class provides a utility method for making URL connections and reading data from the API. It uses java.net to establish a connection, read data from the input stream, and return the data as a string.

## Unit Tests

The Exchange Rate App includes unit tests for the CurrencyConverter and ExchangeRate classes. The tests are located in the CurrencyConverterTest and ExchangeRateTest classes, respectively. These tests use the JUnit framework to test the functionality of the currency converter app and the exchange rate utility class.

To run the unit tests, simply run the test classes using a JUnit test runner in your Java development environment.

Note: The app requires an active internet connection to fetch the latest exchange rate data from the NBP API. If there is no internet connection, the app may throw an exception.

## Usage

1. Launch the Exchange Rate App.
2. Enter the amount in PLN or GBP in the respective text fields.
3. Press Enter or click outside the text field to trigger the conversion.
4. The converted amount will be displayed in the other text field.

Note: The exchange rate and date are retrieved from the NBP API and displayed on the GUI.

## License

This project is released under the MIT License.
