package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class app {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now(); 
		// 2023-12-05
		
		LocalDateTime d02 = LocalDateTime.now();
		// 2023-12-05T10:17:54.369210900
		
		Instant d03 = Instant.now();
		// 2023-12-05T13:21:53.261193300Z
		
		LocalDate d04 = LocalDate.parse("2002-08-13");
		// 2002-08-13
		
		LocalDateTime d05 = LocalDateTime.parse("2002-08-13T13:01");
		// 2002-08-13T13:01
		
		Instant d06 = Instant.parse("2022-08-13T13:00:00Z");
		// 2022-08-13T13:00:00Z
		
		Instant d07 = Instant.parse("2023-12-05t10:40:00-03:00");
		// 2023-12-05T13:40:00Z
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d08 = LocalDate.parse("05/12/2023", formato1);
		// 2023-12-05

		LocalDate d09 = LocalDate.parse("05/12/23", DateTimeFormatter.ofPattern("dd/MM/yy"));
		// 2023-12-05
		
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime d10 = LocalDateTime.parse("05/12/2023 11:45:30", formato2);
		// 2023-12-05T11:45:30
		
		LocalDate d11 = LocalDate.of(2023, 12, 05);
		// 2023-12-05
		
		LocalDateTime d12 = LocalDateTime.of(2023, 12, 05, 11, 57);
		//2023-12-05T11:57
		
		LocalDateTime d13 = LocalDateTime.of(2023, 12, 05, 11, 57, 30);
		//2023-12-05T11:57:30
		
		LocalDateTime d14 = LocalDateTime.of(2023, 12, 05, 11, 57, 30, 58756);
		//2023-12-05T11:57:30.000058756
		
		
		
		// FORMATAÇÃO: Objeto data -> texto ISO\customizado
		
		
		// DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d15 = LocalDate.parse("2023-12-06");
		
		LocalDateTime d16 = LocalDateTime.parse("2023-12-06T12:53:30");
		
		String dataFormatada = d16.format(formato2);
		
		String outraData = formato1.format(d15);
		
		//System.out.println(d15.format(formato1));
		
		
		
		// OBJ INSTANT PARA TEXTO
		
		Instant d17 = Instant.now();
		// 2023-12-06T16:02:25.669186900Z
		
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

		String d17F = formato3.format(d17);
		// 06/12/2023 16:20:45
		
		DateTimeFormatter formato4 = DateTimeFormatter.ISO_LOCAL_DATE;

		/*
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);			
		}*/
		
		Instant d18 = Instant.now();
		// 2023-12-06T23:00:01.407522100Z
		
		LocalDate d19 = LocalDate.ofInstant(d18, ZoneId.systemDefault());
		// 2023-12-06
		
		LocalDateTime d20 = LocalDateTime.ofInstant(d18, ZoneId.systemDefault());
		// 2023-12-06T20:00:01.407522100
		
		LocalDate d21 = LocalDate.ofInstant(d18, ZoneId.of("Portugal"));
		// 2023-12-06
		
		LocalDateTime d22 = LocalDateTime.ofInstant(d18, ZoneId.of("Portugal"));

		LocalDate d23 = LocalDate.parse("2023-04-17");
		
		int dia = d23.getDayOfMonth(); // 17
		int mes = d23.getMonthValue(); // 4
		int ano = d23.getYear(); // 2023
		
		LocalDateTime d24 = LocalDateTime.parse("2023-04-17T20:26:30");
		// 2023-04-17T20:26:30
		
		int hour = d24.getHour(); // 20
		int minutes = d24.getMinute(); // 26
		int seconds = d24.getSecond(); // 30
		
		LocalDate d25 = LocalDate.parse("2023-12-07");
		
		LocalDate d26 = d25.minusWeeks(1); // 2023-11-30
		
		LocalDate d27 = d25.plusDays(5); // 2023-12-12
		
		LocalDateTime d28 = LocalDateTime.parse("2023-12-07T00:33:00");
		
		LocalDateTime d29 = d28.minusHours(10); // 2023-12-06T14:33
		
		LocalDateTime d30 = d28.plusMonths(3); // 2024-03-07T00:33
		
		Instant d31 = Instant.parse("2023-12-07T10:23:30z"); 
		// 2023-12-07T10:23:30Z
		
		Instant d32 = d31.minus(3, ChronoUnit.DAYS);
		Instant d33 = d31.plus(365, ChronoUnit.DAYS);
		
		
		LocalDateTime d34 = LocalDateTime.parse("2023-12-07T11:10");
		LocalDateTime d35 = LocalDateTime.parse("2023-07-14T11:10");
		
		Duration duracao = Duration.between(d35, d34);
		
		int d = (int) duracao.toDays(); // 146
		
		LocalDate d36 = LocalDate.parse("2023-12-08");
		LocalDate d37 = LocalDate.parse("2023-12-04");
		
		Duration duracao2 = Duration.between(d36.atTime(0, 0), d37.atTime(0, 0));
		
		Duration duracao3 = Duration.between(d37.atStartOfDay(), d36.atStartOfDay());
		
		Instant d38 = Instant.parse("2023-12-08T12:36:00Z");
		Instant d39 = Instant.parse("2023-12-06T10:03:00Z");
		
		Duration duracao4 = Duration.between(d39, d38);
		
		System.out.println(duracao4.toMinutes()); // 3.033 minutos
		System.out.println(duracao4.toHours()); // 50 horas
		System.out.println(duracao4.toDays()); // 2 dias

		System.out.println("AULA DE GIT");
		

		
	}

}
