package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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
		int seconds = d24.getSecond();
		
		System.out.println(hour); 
		System.out.println(minutes);  
		System.out.println(seconds);
		

		
	}

}
