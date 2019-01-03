import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// (Lambdas)
// * Enable functional programming.
// * Provide readable and concise code.
// * Improve use of APIs and libraries.
// Observe the creation of the lambda expressions below, uncomment the lines under each to see them work.

@FunctionalInterface  //  This annotation is used to ensure that the functional interface can’t have more than one abstract method.
					  //  Compile time errors will be present if more than one method is added to the interface.

interface greetingMessage {
	 void perform(String name);
}

@FunctionalInterface
interface doubleANumber {
	 int perform(int a);
}

@FunctionalInterface
interface addTwoNumbers {
	 int perform(int a, int b);
}

@FunctionalInterface
interface stringLengthCounter {
	 int perform(String a);
}

@FunctionalInterface
interface DateUtility {
	long perform(LocalDate a, LocalDate b);
}

public class Lambdas {
	
	public static void main(String[] args) {
		
		greetingMessage sayHello = name -> System.out.println("hello " + name + "!");
//		sayHello.perform("shaun");

		doubleANumber doubleThis = a -> a * 2;
//		System.out.println(doubleThis.perform(4));
		
		addTwoNumbers addTheseTwo = (a, b) -> a + b;
//		System.out.println(addTheseTwo.perform(4,5));

		stringLengthCounter countThisStringLength = a -> a.length();
//		System.out.println(countThisStringLength.perform("Berlin"));
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        
        LocalDate date1 = LocalDate.parse("01/20/2019", formatter);
        LocalDate date2 = LocalDate.parse("02/02/2018", formatter);
        
        DateUtility DayDifference = (a, b) -> ChronoUnit.DAYS.between(a , b);
        //System.out.println(DayDifference.perform(date1, date2) + " difference in days.");	
        
        
        /* (Sorting Collections of int and String type)
         Collections.sort works with Strings and ints.  However, if we need sort Objects based on their properties, we can use a lambda.*/
        
		List<String> Names = new ArrayList<>();
		Names.add(new String("Shaun"));
		Names.add(new String("Bob"));
		Names.add(new String("Tim"));
		Names.add(new String("Nick"));
		
//		Collections.sort(Names);
//	
//		for (String S : Names) {
//			System.out.println(S);
//		}
		
		
		/* (Sorting Collections with Lambas )
		 We've created a Person class, instantiated an ArrayList of the Person type, and added 4 people to it.
		 When using Collections.sort, we provide the List, just as we did in the previous example, followed by the
		 Lambda.  Comparator is a functional interface which needs the implementation of the compare method.
		 Java will accept the Lambda as if it's an implementation of Comparator. */
		List<Person> People = new ArrayList<>();
		People.add(new Person("Shaun", "Ili", 00, LocalDate.parse("01/20/1989", formatter)));
		People.add(new Person("Dennis", "Ritchie", 01, LocalDate.parse("01/30/1970", formatter)));
		People.add(new Person("Bill", "Gates", 04, LocalDate.parse("04/10/1959", formatter)));
		People.add(new Person("Craig", "Good", 03, LocalDate.parse("01/21/1962", formatter)));
		
		
		/* Sort by First Name with Lambda.*/
//		Collections.sort(People, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		/* Sort by Last Name with Lambda.*/
//		Collections.sort(People, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
		/* Sort by ID with Lambda. (Age must be Integer, not int. Primitive types such as int will not support method like compareTo() ) */
//		Collections.sort(People, (p1, p2) -> p1.getID().compareTo(p2.getID()));
		
		/* Sort by Birth Date. */
//		Collections.sort(People, (p1, p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()));
		
		/* Print all Persons in the People list that start with the letter "S". */
//		for (Person P : People) {
//			if (P.getFirstName().startsWith("S")) {
//				System.out.println(P);
//			}
//		}
		
		/* Print all Persons in the People list that start with the letter "S", with Lambda. */
//		People.forEach(P -> {
//			if (P.getFirstName().startsWith("S")){
//				System.out.println(P);
//			}
//		});
		
		/* Print all Persons in People List */
//		for (Person P : People) {
//			System.out.println(P);
//		}
		
		/* Print all Persons in People List with Lambda */
		People.forEach((P)->System.out.println(P)); 
	}
}
	

		




