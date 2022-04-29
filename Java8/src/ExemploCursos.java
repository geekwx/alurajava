import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(System.out::println);
		cursos.forEach(c -> System.out.println(c.getNome()));

		/*
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		*/
		
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.mapToInt(Curso::getAlunos)
		.sum();
		
		
		OptionalDouble media = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.mapToInt(Curso::getAlunos)
				.average();
				
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		System.out.println(nomes);
		System.out.println(sum);
		//.map(c -> c.getAlunos())
			//.forEach(c -> System.out.println(c.getNome()));
		
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny();
		
		//Só exibe se existir e não gera exception
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		 Curso curso = optionalCurso.orElse(null);
		 System.out.println(curso.getNome());
		
		 
		 //Para salvar as lista precisa usar o metodo do collectors 
		  List<Curso> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		  
		  
		    Map<String, Integer> map = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c-> c.getAlunos()));
		    
		    System.out.println(map);
		    cursos.parallelStream()
					.filter(c -> c.getAlunos() >= 100)
					.collect(Collectors.toMap(c -> c.getNome(), c-> c.getAlunos()))
		    		.forEach((nome, alunos) ->  System.out.println(nome + " tem "+ alunos + " alunos"));
						
					}
				    
		  
		  
	}

