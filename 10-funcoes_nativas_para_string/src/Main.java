
public class Main {

	public static void main(String[] args) {
		String original =  "abcde FGHIJ ABC abc DEFG  ";
		System.out.println(original+"(ORIGINAL)");
		
		// Formatação
		String s01 = original.toLowerCase();
		System.out.println(s01+"(toLowerCase)");
		String s02 = original.toUpperCase();
		System.out.println(s02+"(toUpperCase)");
		String s03 = original.trim();
		System.out.println(s03+"(trim)");
		
		// Recortar
		String s04 = original.substring(2);
		System.out.println(s04+"( substring(2) )");
		String s05 = original.substring(2, 9);
		System.out.println(s05+"( substring(2, 9) )");
		
		// Substituir
		String s06 = original.replace('a', 'x');
		System.out.println(s06+"( replace('a', 'x') )");
		String s07 = original.replace("abc", "xyz");
		System.out.println(s07+"( replace(abc, xyz) )");
		
		// Buscar
		int s08 = original.indexOf("ABC");
		System.out.println(s08+"( indexOf(ABC))");
		int s09 = original.lastIndexOf("abc");
		System.out.println(s09+"( lastIndexOf(abc))");
		
		//split
		String frutas = "Banana Pera Uva Maça";
		String[] vetorFrutas = frutas.split(" ");
		
		System.out.println(vetorFrutas[0]); // Banana
		System.out.println(vetorFrutas[1]); // Pera
		System.out.println(vetorFrutas[2]); // Uva
		System.out.println(vetorFrutas[3]); // Maça

	}

}
