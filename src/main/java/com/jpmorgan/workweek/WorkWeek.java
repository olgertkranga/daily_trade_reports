package com.jpmorgan.workweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class WorkWeek {
	
	public Map<DayOfWeek, LocalDate> workingDaysMap = new HashMap<>();

	//public Map<DayOfWeek, LocalDate> getWorkingDaysMap(Map<DayOfWeek, LocalDate> workingDaysMap) {
	//	return workingDaysMap;
	//}

	public String getWorkingDaysMap(DayOfWeek dof, LocalDate ld) {
		
		return dof.toString() + " " + ld.toString();
		
	}
	
	//public void arabicWorkingDays() {
	//	workingDaysMap.put(DayOfWeek.SUNDAY, LocalDate.of(2017, 8, 20));
	//	workingDaysMap.put(DayOfWeek.MONDAY, LocalDate.of(2017, 8, 21));
	//	workingDaysMap.put(DayOfWeek.TUESDAY, LocalDate.of(2017, 8, 22));
	//	workingDaysMap.put(DayOfWeek.WEDNESDAY, LocalDate.of(2017, 8, 23));
	//	workingDaysMap.put(DayOfWeek.THURSDAY, LocalDate.of(2017, 8, 24));
	//}
	
	//public void standardWorkingDays() {
	//	workingDaysMap.put(DayOfWeek.MONDAY, LocalDate.of(2017, 8, 21));
	//	workingDaysMap.put(DayOfWeek.TUESDAY, LocalDate.of(2017, 8, 22));
	//	workingDaysMap.put(DayOfWeek.WEDNESDAY, LocalDate.of(2017, 8, 23));
	//	workingDaysMap.put(DayOfWeek.THURSDAY, LocalDate.of(2017, 8, 24));
	//	workingDaysMap.put(DayOfWeek.FRIDAY, LocalDate.of(2017, 8, 20));
	//}
		
}
