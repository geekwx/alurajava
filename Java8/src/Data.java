import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copa = LocalDate.of(2022, Month.NOVEMBER, 21);
		
		int anos = copa.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, copa);
		System.out.println(periodo.getMonths());
		
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		  LocalDate proximaCopa = copa.plusYears(4);
		  String valorFormatador = proximaCopa.format(formatador);
		System.out.println(valorFormatador);
		
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		
		//YearMonth mes = YearMonth.of(anos, anos)
		LocalTime intervalo = LocalTime.of(15, 30);
		
		System.out.println(intervalo);
				
	}
}
