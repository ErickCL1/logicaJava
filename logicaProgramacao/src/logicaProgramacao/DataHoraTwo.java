package logicaProgramacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraTwo {

	public static void main(String[] args) {
		
		Instant d6 = Instant.now();
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d6, ZoneId.of("Turkey"));
		System.out.println(r1);
		
		
		
		
		
	}

}
