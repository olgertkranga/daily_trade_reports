package com.jpmorgan.workweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class WorkWeek {
	
	public Map<DayOfWeek, LocalDate> workingDaysMap = new HashMap<>();

	public String getWorkingDaysMap(DayOfWeek dof, LocalDate ld) {
		
		return dof.toString() + " " + ld.toString();
		
	}
		
}
