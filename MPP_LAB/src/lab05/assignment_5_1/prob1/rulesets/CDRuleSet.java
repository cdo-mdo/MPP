package lab05.assignment_5_1.prob1.rulesets;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import lab05.assignment_5_1.prob1.gui.CDWindow;

/**
 * Rules: 1. All fields must be nonempty 2. Price must be a floating point
 * number with two decimal places 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet extends Rules implements RuleSet {

	private CDWindow cw;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cw = (CDWindow) ob;
		nonEmptyRule();
		priceRule(cw.getPrice());
	}
	
	private void nonEmptyRule() throws RuleException {
		List<String> strs = new ArrayList<>();
		strs.add(cw.getArtist());
		strs.add(cw.getTitle());
		strs.add(cw.getPrice());
		nonEmptyRule(strs);
	}

}
