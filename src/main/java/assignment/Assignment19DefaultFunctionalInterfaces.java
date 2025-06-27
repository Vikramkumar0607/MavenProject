package assignment;
import java.util.function.Function;
import java.util.function.Supplier;

public class Assignment19DefaultFunctionalInterfaces {

	public static void main(String[] args) {

		// InterfaceFuncations if1 =(a,b) -> a+b;
		// System.out.println(if1.number(3,5));
		InterfaceFuncations if1 = x -> x * x;
		System.out.println(if1.squre(4));

		// Predicate Predicate<T>

		// Consumer Consumer<T>
		
		
		
		// Function Function<T, R>
		Function<String, Integer> stringLength = str -> str.length();
		System.out.println("Length of sentence is : " + stringLength.apply("Java programming is fun and challenging"));
		Function<Integer, String> integertoString = inter -> "Number is :" + inter;
		System.out.println(integertoString.apply(1000));

		// Supplier Supplier<T>
		Supplier<Double> randonNumber = () -> Math.random();
		Supplier<String> defaultMessage = () -> "Sullier Functional";

		System.out.println("Randon Number is a : " + randonNumber.get());
		System.out.println(defaultMessage.get());

	}

}
