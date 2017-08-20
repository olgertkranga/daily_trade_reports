package com.jpmorgan.instruction;

import java.time.LocalDate;

/**
 *The instructions sent by various clients to JP Morgan to execute in the international market.
 *There are variables for instruction 
 */

public class Instruction {
	//Entity's name
    private String entity;
	//B – Buy – outgoing and S – Sell – incoming 
    private String flagBuySell;
	//The foreign exchange rate with respect to USD that was agreed 
    private Double agreedFx;
	//Currency for buy or sell
    private String currency;
    //Date on which the instruction was sent to JP Morgan by various clients 
    private LocalDate instructionDate;
    //The date on which the client wished for the instruction to be settled with respect to Instruction Date
    private LocalDate settlementDate;
    //Number of shares to be bought or sold 
    private Integer units;
    //Price per unit
    private Double pricePerUnit;
    
    public Instruction(String entity, String flagBuySell, Double agreedFx, String currency, LocalDate instructionDate,
    		LocalDate settlementDate, Integer units, Double pricePerUnit)
    {
        this.entity = entity;
        this.flagBuySell = flagBuySell;
        this.agreedFx = agreedFx;
        this.currency = currency;
        this.instructionDate = instructionDate;
        this.settlementDate = settlementDate;
        this.units = units;
        this.pricePerUnit = pricePerUnit;
    }
    
    @Override
    public String toString() {
        return flagBuySell + " " + settlementDate + " " + entity + " " + 
    + (agreedFx*units*pricePerUnit) + " USD from currency " + currency;
    }

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getFlagBuySell() {
		return flagBuySell;
	}

	public void setFlagBuySell(String flagBuySell) {
		this.flagBuySell = flagBuySell;
	}

	public Double getAgreedFx() {
		return agreedFx;
	}

	public void setAgreedFx(Double agreedFx) {
		this.agreedFx = agreedFx;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public LocalDate getInstructionDate() {
		return instructionDate;
	}

	public void setInstructionDate(LocalDate instructionDate) {
		this.instructionDate = instructionDate;
	}

	public LocalDate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = settlementDate;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
    
}
