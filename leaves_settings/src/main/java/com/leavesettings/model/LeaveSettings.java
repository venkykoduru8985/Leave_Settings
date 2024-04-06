package com.leavesettings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class LeaveSettings {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int annualDays;
    private String annaulcarryForward;
    private String annaulmaxCarryForward;
    private String annaulearnedLeave;
    private int sickDays;
    private int hospitalisationDays;
    private int maternityDays;
    private int paternityDays;
    private int lopDays;
    private String lopCarryForward;
    private String lopMaxCarryForward;
    private String lopEarnedLeave;
    
    
    public LeaveSettings() {
    }

    public LeaveSettings(int annualDays, String carryForward, String maxCarryForward, String earnedLeave,
                         int sickDays, int hospitalisationDays, int maternityDays, int paternityDays,
                         int lopDays, String lopCarryForward, String lopMaxCarryForward, String lopEarnedLeave) {
        this.annualDays = annualDays;
        this.annaulcarryForward = carryForward;
        this.annaulmaxCarryForward = maxCarryForward;
        this.annaulearnedLeave = earnedLeave;
        this.sickDays = sickDays;
        this.hospitalisationDays = hospitalisationDays;
        this.maternityDays = maternityDays;
        this.paternityDays = paternityDays;
        this.lopDays = lopDays;
        this.lopCarryForward = lopCarryForward;
        this.lopMaxCarryForward = lopMaxCarryForward;
        this.lopEarnedLeave = lopEarnedLeave;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnualDays() {
        return annualDays;
    }

    public void setAnnualDays(int annualDays) {
        this.annualDays = annualDays;
    }

    public String getCarryForward() {
        return annaulcarryForward;
    }

    public void setCarryForward(String carryForward) {
        this.annaulcarryForward = carryForward;
    }

    public String getMaxCarryForward() {
        return annaulmaxCarryForward;
    }

    public void setMaxCarryForward(String maxCarryForward) {
        this.annaulmaxCarryForward = maxCarryForward;
    }

    public String getEarnedLeave() {
        return annaulearnedLeave;
    }

    public void setEarnedLeave(String earnedLeave) {
        this.annaulearnedLeave = earnedLeave;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public int getHospitalisationDays() {
        return hospitalisationDays;
    }

    public void setHospitalisationDays(int hospitalisationDays) {
        this.hospitalisationDays = hospitalisationDays;
    }

    public int getMaternityDays() {
        return maternityDays;
    }

    public void setMaternityDays(int maternityDays) {
        this.maternityDays = maternityDays;
    }

    public int getPaternityDays() {
        return paternityDays;
    }

    public void setPaternityDays(int paternityDays) {
        this.paternityDays = paternityDays;
    }

    public int getLopDays() {
        return lopDays;
    }

    public void setLopDays(int lopDays) {
        this.lopDays = lopDays;
    }

    public String getLopCarryForward() {
        return lopCarryForward;
    }

    public void setLopCarryForward(String lopCarryForward) {
        this.lopCarryForward = lopCarryForward;
    }

    public String getLopMaxCarryForward() {
        return lopMaxCarryForward;
    }

    public void setLopMaxCarryForward(String lopMaxCarryForward) {
        this.lopMaxCarryForward = lopMaxCarryForward;
    }

    public String getLopEarnedLeave() {
        return lopEarnedLeave;
    }

    public void setLopEarnedLeave(String lopEarnedLeave) {
        this.lopEarnedLeave = lopEarnedLeave;
    }
}
