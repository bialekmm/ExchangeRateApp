import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Optional;

public class ExchangeRate{

	@SerializedName("code")
	private String code;

	@SerializedName("rates")
	private List<RatesItem> rates;

	@SerializedName("currency")
	private String currency;

	@SerializedName("table")
	private String table;


	static double getRate() throws Exception {
		ExchangeRate exchangeRate;
		Gson gson = new Gson();
		exchangeRate = gson.fromJson(URLConnectionReader.reader(),ExchangeRate.class);

		return exchangeRate.rates.get(0).mid;
	}
	static String getDate() throws Exception {
		ExchangeRate exchangeRate;
		Gson gson = new Gson();
		exchangeRate = gson.fromJson(URLConnectionReader.reader(),ExchangeRate.class);

		return exchangeRate.rates.get(0).effectiveDate;
	}
}
