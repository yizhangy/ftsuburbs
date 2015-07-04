package co.nz.forwardthinking.suburb.util;

import java.text.NumberFormat;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class StringValueUtil {
	
	private final static String CONFIDENTIAL_DATA = "..C";
	
	public static String parseEmptyValue(final String value) {
		
		if (StringUtils.isBlank(value)) {
			return "";
		}
		
		if (CONFIDENTIAL_DATA.equals(value)) {
			return "";
		}
		
		return value;
	}
	
	public static String formatMoney(String value) {
		Locale nzLocale = new Locale("en", "NZ");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(nzLocale);
		return currencyFormat.format(Double.valueOf(value));
	}
}
