import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> a = new LinkedHashSet<String>();
		a.add("Maria");
		a.add("Alice");
		a.add("Julia");
		
		Set<String> b = new LinkedHashSet<String>();
		b.add("John");
		b.add("Bob");
		b.add("Jose");
		
		//a.addAll(b);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		Set<String> c = new HashSet<String>(a);
		System.out.println(c); // [Julia, Alice, Maria]
		
		c.addAll(b);
		
		System.out.println(c); // [Julia, Bob, Jose, Alice, John, Maria]
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
		Set<String> cores1 = new LinkedHashSet<String>();
		cores1.add("Blue");
		cores1.add("Green");
		cores1.add("Red");
		cores1.add("Orange");
		
		Set<String> cores2 = new LinkedHashSet<String>();
		cores2.add("Black");
		cores2.add("Green");
		cores2.add("Red");
		cores2.add("Yellow");
		
		Set<String> cores3 = new LinkedHashSet<String>(cores1);
		
		System.out.println("cores1 = " +cores1); // [Blue, Green, Red, Orange]
		System.out.println("cores2 = " +cores2); // [Black, Green, Red, Yellow]
		System.out.println("cores3 = " +cores3); // [Black, Green, Red, Yellow]
		
		System.out.println();
		
		cores1.removeAll(cores2);
		
		System.out.println("cores1 = " +cores1); // [Blue, Green, Red, Orange]
		
	}

}
