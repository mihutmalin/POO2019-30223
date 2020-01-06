import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public  Optional<Integer> isPalindrome(Integer o) {
		String str=Integer.toString(o);
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
  
            if (str.charAt(i) != str.charAt(j)) 
                return null; 
            i++; 
            j--; 
        } 
        Optional<Integer> z=Optional.of(o);
        return z; 
	}
	
	public static <T> List<T> removeElements(List<T> l, Predicate<T> p) { 
		  
        l = l.stream() .filter(p).collect(Collectors.toList()); 
        return l; 
    } 
	
	
	public static void main(String[] args) {
		Test test=new Test();
		
//1.Create a string that consists of the first letter of each word in a list of Strings provided
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> words=  Arrays.asList("cal","masina","portocala","da","amant");
		StringBuilder str = new StringBuilder(); 
		words.stream().map(s->s.charAt(0)).forEach(str::append);
		System.out.println("1.	"+str);
		
//2.Remove the words that have odd lengths from the list of Strings
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> words1=  Arrays.asList("cal","masina","portocala","da","amanta");
		Predicate<String> condition = i -> (i.length()%2==0); 
	    words1 = removeElements(words1, condition); 
	    System.out.println("2.	"+words1);

		
//3.Replace every word in a list of Strings with its upper case equivalent
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		IntStream.range(0, words.size()).forEach(s -> words.set(s, words.get(s).toUpperCase()));
		System.out.println("3.	"+words);
		
//4.map with pairs of type (String,String) is given. Convert every key-value pair of the map 
//into a string and append them all into a single string, in iteration order.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 150);
		map.put(2, 0);
		map.put(3, 550);
		StringBuilder str1 = new StringBuilder(); 
		map.entrySet().stream().map(s->s.toString()).forEach(str1::append);
		System.out.println("4.	"+str1);
		
		
//5.A list of strings is given. Create a new list with all the strings from original list converted to lower case and print them out.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> wordsLowerCase = words.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println("5.	"+wordsLowerCase);
		
//6.Modify exercise 5 so that the new list only contains strings that have an odd length
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> wordsLowerCaseAndOddLength = words.stream().filter(s -> s.length()%2==0).map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println("6.	"+wordsLowerCaseAndOddLength);
		
//7.Join the second, third and forth strings of the list into a single string, where each word is separated by a hyphen(-). Print the resulting string.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		StringBuilder join = new StringBuilder(); 
		IntStream.range(2, 5).forEach(s -> {
			if(s%4!=0)
				join.append(words.get(s)+"-");
			else
				join.append(words.get(s));
			});
		System.out.println("7.	"+join);
		
//8.Produce an unbounded list of the powers of two. (An infinite stream.)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i*2);
		List<Integer> power=infiniteStream.limit(20).collect(Collectors.toList());
		System.out.println("8.	"+power);
		
//9.A list of integers is provided. Create a method which receives as parameter a number
//(integer), and if the number is palindrome it returns the number, otherwise it returns null.
//The return type of the method must be Optional<Integer>. Use the method to determine how many palindromes are in the list.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Integer> numere= Arrays.asList(11,22,32,56,99);
		int howMany= (int) numere.stream().filter(s ->test.isPalindrome(s)!=null).count();
		System.out.println("9.	"+howMany);
		
		
//10.A list of employees is provided. (An employee has: name (String), age (int) and salary (double)). Compute the average salary of all employees.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Employee> angajati= Arrays.asList(new Employee("Andrei",23,101.5),new Employee("George",29,532.521));
		double suma= (angajati.stream().mapToDouble(s -> s.getSalary()).sum())/angajati.stream().count();
		System.out.println("10.	"+suma);
		
//11.A list of students is provided. ( A student has: name (String), avergae grade (double), list
//of courses taken (List<String>)). Create a map with pairs of type (String, Integer), where
//the key is the name of a student, and the value is the number of courses taken.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Student> students=Arrays.asList(new Student("Mihai",6.7),new Student("Maria",9.1));
		List<String> courses1=Arrays.asList("Mate","Bio");
		List<String> courses2=Arrays.asList("Geografie","Bio","Sport");
		students.get(0).setCourses(courses1);
		students.get(1).setCourses(courses2);
		Map<String,Integer> mapStudents=students.stream().collect(Collectors.toMap(s->s.getName(),s->s.getCourses().size()));
		System.out.println("11.	"+mapStudents);
			
//12. A list of cars is provided. ( A car has: brand (String), year of fabrication(int), colour(String),
//and price(double).) Sort the cars in descending order based on the price
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Car> masini= Arrays.asList(new Car("Andrei",1999,"blue",5000.15),new Car("George",2012,"black",1592.521));
		List<Car> masini1=masini.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("12.	"+masini1.get(0).getPrice()+"	"+masini1.get(1).getPrice());

//	13. Determine the sum of all fibonacci numbers up to a given limit
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		int fibo = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				.limit(10)
				.map(t -> t[0])
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("13.	"+fibo);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}
}
