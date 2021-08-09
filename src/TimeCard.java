import java.time.Duration;
import java.time.LocalTime;

public class TimeCard {
/*
	private Employee employee;
	private LocalTime entry;
	private LocalTime departure;*/
	
	public static void main(String[] args) throws InterruptedException {

		LocalTime entrada = LocalTime.now();

		
		
		System.out.println("Entrada: " + entrada + "\n");
		
		LocalTime saida = LocalTime.of(20, 0);
		
		System.out.println("Saída: " + saida + "\n");
		
		Duration duracao = Duration.between(entrada, saida);
				
		System.out.println("Tempo toHoursPart: " + duracao.toHoursPart() + "\n");
		System.out.println("Tempo toHours: " + duracao.toHours() + "\n");
		
	}
}