package lab05.assignment_5_1.prob1.rulesets;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rules {

	/*
	 * JSBN number with 10 digits must begin by 0 or 1
	 */
	private Pattern isbnPattern10 = Pattern.compile("[01][0-9]{9}");
	/*
	 * ISBN number with 13 digits must begin with 978 or 979 
	 */
	private Pattern isbnPattern13 = Pattern.compile("97[89][0-9]{10}");
	/*
	 * Price number is a floating number with two decimal places
	 */
	private Pattern pricePattern = Pattern.compile("[0-9]+\\.[0-9]{2}");
	private final double MINIMUM_PRICE_NUMBER = 0.49;
	
	protected void nonEmptyRule(List<String> strs) throws RuleException {
		for (String str: strs) {
			if (str.trim().isEmpty()) {
				throw new RuleException("All fields must be non-empty!");
			}
		}
	}
	
	protected void isbnRule(String isbn) throws RuleException {
		StringBuilder msg = new StringBuilder();
		msg.append("ISBN number must be numeric and consist of either 10 or 13 characters\n");
		msg.append("- For ISBN 10 characters, the first digit must be 0 or 1\n");
		msg.append("- For ISBN 13 characters, the first three digits must be 978 or 979\n");
		
		if (isbn.length() != 10 && isbn.length() != 13) {
			throw new RuleException(msg.toString());
		}
		if (isbn.length() == 10) {
			Matcher matcher = isbnPattern10.matcher(isbn);
			if (!matcher.find()) {
				System.out.println("Throws exception");
				throw new RuleException(msg.toString());
			}
		}
		else {
			Matcher matcher = isbnPattern13.matcher(isbn);
			if (!matcher.find()) {
				throw new RuleException(msg.toString());
			}
		}
	}

	protected void priceRule(String price) throws RuleException {
		StringBuilder msg = new StringBuilder();
		msg.append("Price number must be a floating number with two digit places\n");
		msg.append("And price number must be greater than " + MINIMUM_PRICE_NUMBER);
		
		Matcher matcher = pricePattern.matcher(price);
		if (!matcher.find()) {
			throw new RuleException(msg.toString());
		}
		if (Double.valueOf(price) < MINIMUM_PRICE_NUMBER) {
			throw new RuleException(msg.toString());
		}
	}

}
