package logicaProgramacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/**
		LocalDate = current day date
		LocalDateTime =  Current date and time
		Instant =  global date and time ( 2023-05-13T00:03:59.979829100Z ) z do final da resposta informa que é uma data GMT.
		GMT - Londres time, time standard global  UTC.
		Duration 
		*/
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20"); // Neste modelo podemos colocar uma data desejada. (parse)
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // mesma situação acima, só que adicionando a Hora.
		LocalDate d06 = LocalDate.parse("23/05/2001", fmt1);
		LocalDateTime d07 = LocalDateTime.parse("23/05/2001 12:30", fmt2);
		LocalDate d10 = LocalDate.of(2002, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2001, 5, 23, 12, 50);
		Instant d12 = Instant.now();
		
		System.out.println(d01); // Result in 2023-05-12
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06.format(fmt1));
		System.out.println(d07);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println("D12: " + fmt3.format(d12));
		
		
		
		
		sc.close();
	}

}
