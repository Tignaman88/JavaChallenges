import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ApiObject apiObject = new ApiObject();
        //create the JSon Object that will check if user input is in the JSon Object
        apiObject.getJSonObjectForComparisonWithUserInput();
        Scanner userInput = new Scanner(System.in);
        //set the currency the user want to exchange
        String currencyToExchangeFromUserInput;
        currencyToExchangeFromUserInput = apiObject.getCurrencyToExchange(userInput);
        apiObject.setCurrencyToExchange(currencyToExchangeFromUserInput);
        //set the currency the user would like it to be exchanged to
        String currencyExchangedFromUserInput;
        currencyExchangedFromUserInput = apiObject.getCurrencyExchanged(userInput);
        apiObject.setCurrencyExchanged(currencyExchangedFromUserInput);
        //set the amount to exchange
        double amountToExchangeFromUserInput;
        amountToExchangeFromUserInput = apiObject.getAmountToExchange(userInput);
        apiObject.setAmountToExchange(amountToExchangeFromUserInput);
        HttpURLConnection request = apiObject.getHttpURLConnection();
        StringBuilder stringToParse = apiObject.getStringToParseInJson(request);
        String exctractedJsonObject = apiObject.extractedJsonObject(stringToParse);


        System.out.println(apiObject.amountToExchange + " " + apiObject.currencyToExchange.toUpperCase() + " converts to " +
                exctractedJsonObject + " " + apiObject.currencyExchanged.toUpperCase());


    }



}
