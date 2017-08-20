package com.jpmorgan.report;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jpmorgan.instruction.Instruction;
import com.jpmorgan.test.instructions.dates.TestInstructionsDates;
import com.jpmorgan.workweek.WorkWeek;

@SpringBootApplication
public class ReportApplication {

	public static void main(String[] args) {
		
		WorkWeek ww = new WorkWeek();	
		
		final Set<Instruction> setInstructions = TestInstructionsDates.getDatesForInstruction();
		
		int datasCount;
		
		DayOfWeek dof;
		LocalDate ld;
		
		datasCount = TestInstructionsDates.getDatesForInstruction().size();	
		datasCount = datasCount - 1;
	
		String rowInstruction = null;
	
		dof = DayOfWeek.SUNDAY;
		ld = LocalDate.of(2017, 8, 20);
		System.out.println("Arabic working week, if currencies AED or SAR");
		for (int i = 0; i<=4; i++) {
			System.out.println(ww.getWorkingDaysMap(dof.plus(i), ld.plusDays(i)));
		}
		
		dof = DayOfWeek.MONDAY;
		ld = LocalDate.of(2017, 8, 21);
		System.out.println();
		System.out.println("Normal working week");
		for (int i = 0; i<=4; i++) {
			System.out.println(ww.getWorkingDaysMap(dof.plus(i), ld.plusDays(i)));
		}
	
		System.out.println();
		System.out.println("Report Amount in USD settled incoming everyday");
				
		for (int i = 0; i<=datasCount; i++) {
			rowInstruction=(setInstructions.toArray()[i]).toString();
			if ((rowInstruction.substring(rowInstruction.length()-3).equals("AED")) || (rowInstruction.substring(rowInstruction.length()-3).equals("SAR"))) {
				dof = DayOfWeek.SUNDAY;
				ld = LocalDate.of(2017, 8, 20);	
			} else {
				dof = DayOfWeek.MONDAY;
				ld = LocalDate.of(2017, 8, 21);	
			}
			for (int j = 0; j<=4; j++) {
				if ((rowInstruction.substring(0, 1).equals("S")) && (ld.plusDays(j)).toString().equals(rowInstruction.substring(2, 12))) {
					System.out.println(rowInstruction);
				}
			}
		}
				
	    System.out.println();
		System.out.println("Report Amount in USD settled outgoing everyday");
		for (int i = 0; i<=datasCount; i++) {
			rowInstruction=(setInstructions.toArray()[i]).toString();
			if ((rowInstruction.substring(rowInstruction.length()-3).equals("AED")) || (rowInstruction.substring(rowInstruction.length()-3).equals("SAR"))) {
				dof = DayOfWeek.SUNDAY;
				ld = LocalDate.of(2017, 8, 20);	
			} else {
				dof = DayOfWeek.MONDAY;
				ld = LocalDate.of(2017, 8, 21);	
			}
			for (int j = 0; j<=4; j++) {
				if ((rowInstruction.substring(0, 1).equals("B")) && (ld.plusDays(j)).toString().equals(rowInstruction.substring(2, 12))) {
					System.out.println(rowInstruction);
				}
			}
		}
	}
}
