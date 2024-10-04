package lab05.assignment_5_1.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lab05.assignment_5_1.prob1.gui.BookWindow;
import lab05.assignment_5_1.prob1.gui.CDWindow;

final public class RuleSetFactory {
	private RuleSetFactory() {
	}

	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

}
