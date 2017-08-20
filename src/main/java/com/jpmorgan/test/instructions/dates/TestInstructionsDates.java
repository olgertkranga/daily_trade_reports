package com.jpmorgan.test.instructions.dates;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.jpmorgan.instruction.Instruction;

public class TestInstructionsDates {
		
    public static Set<Instruction> getDatesForInstruction() {
        return new HashSet<>(Arrays.asList(
            new Instruction("General Motors","B",0.5,"SGP",LocalDate.of(2017, 8, 10),LocalDate.of(2017, 8, 20),
200, 100.25),
            new Instruction("Dehli oil","B",0.05,"RUP",LocalDate.of(2017, 8, 10),LocalDate.of(2017, 8, 21),
                		150, 1.1),
            new Instruction("Kuwait oil","S",0.05,"AED",LocalDate.of(2017, 8, 10),LocalDate.of(2017, 8, 21),
            		150, 1.1),
            new Instruction("Glasgow Rangers","S",1.05,"GBP",LocalDate.of(2017, 8, 10),LocalDate.of(2017, 8, 23),
            		1500, 99.0),
            new Instruction("SONY","B",0.26,"PLN",LocalDate.of(2017, 8, 11),LocalDate.of(2017, 8, 23),
            		2500, 101.01),
            new Instruction("Glasgow Rangers","B",1.05,"EUR",LocalDate.of(2017, 8, 10),LocalDate.of(2017, 8, 23),
            		500, 999.0)
        		));
    }
}