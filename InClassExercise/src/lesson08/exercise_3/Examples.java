package lesson08.exercise_3;
import java.util.function.Function;
public class Examples {
	
	
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	Function<Employee, String> a1 = (Employee e) -> e.getName();
	Function<Employee, String> a2 = Employeee.getName();
	
	// type Class:: instance
	biFunction<Integer, >
	
	public Compare()
	
	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		
		z
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
