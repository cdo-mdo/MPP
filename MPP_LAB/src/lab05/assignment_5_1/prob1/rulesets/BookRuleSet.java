package lab05.assignment_5_1.prob1.rulesets;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import lab05.assignment_5_1.prob1.gui.BookWindow;

/**
 * Rules: 1. All fields must be nonempty 2. Isbn must be numeric and consist of
 * either 10 or 13 characters 3. If Isbn has length 10, the first digit must be
 * 0 or 1 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 6. Price
 * must be a number greater than 0.49.
 *
 */
public class BookRuleSet extends Rules implements RuleSet {

	private BookWindow bw;
	
	@Override
	public void applyRules(Component ob) throws RuleException {

		bw = (BookWindow) ob;
		nonEmptyRule();
		isbnRule(bw.getISBN());
		priceRule(bw.getPrice());
	}
	
	private void nonEmptyRule() throws RuleException {
		List<String> strs = new ArrayList<>();
		strs.add(bw.getISBN());
		strs.add(bw.getTitle());
		strs.add(bw.getPrice());
		nonEmptyRule(strs);
	}
	
}
