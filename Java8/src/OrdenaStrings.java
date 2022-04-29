import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	
	
	
		public static void main(String[] args) {
			List<String> palavras = new ArrayList<String>();
			palavras.add("alura Online");
			palavras.add("editora casa dos codigo");
			palavras.add("caelum");
			System.out.println(palavras);
			
		//	Comparator<String> comparador = new ComparadorPorTamanho();
			
			//Collection um metodo antigo de comparacao
			//Collections.sort(palavras, comparador);
//			palavras.sort(comparador);
			
			
			palavras.sort((s1, s2) -> {
							if(s1.length() < s2.length())
								return -1;
							if(s1.length() > s2.length())
								return 1;
							return 0;
						});
			
			palavras.sort((s1, s2) ->  Integer.compare(s1.length(), s2.length()));
			palavras.sort(Comparator.comparing(s -> s.length()));
			
			palavras.sort(Comparator.comparing(String::length));
			
			System.out.println(palavras);
			
			
			
			for (String p : palavras) {
				System.out.println(p);
			}
			/*
			 * 
			
			Consumer<String> consumidor = new Consumer<String>() {

				@Override
				public void accept(String s) {
					System.out.println(s);
					
				}		
			};
			*/
			//Forma nova de te interar sobre todfos os elementos de um array
//			palavras.forEach(consumidor);
			
			
			/*
			palavras.forEach(new Consumer<String>() {

				@Override
				public void accept(String s) {
					System.out.println(s);
					
				};
			});
		*/
			
			
			Consumer<String> impressor = System.out::println;
			palavras.forEach( s -> System.out.println(s));
			palavras.forEach(System.out::println);
			
			new Thread(new Runnable() {
				public void run() {
					System.out.println("Executando  um Runnable");
				}
			});
			
			new Thread(() -> System.out.println("Executando um Runnable"));
		}}
/*
class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
*/
		/*
class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}*/
