package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
		
		System.out.println(d14);
		
	}

}
