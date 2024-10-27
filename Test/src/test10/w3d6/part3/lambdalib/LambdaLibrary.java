package test10.w3d6.part3.lambdalib;

import java.util.List;
import java.util.stream.Collectors;

import test10.w3d6.part1.quizclasses.Employee;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());
}
