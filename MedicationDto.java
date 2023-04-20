package com.CareHub.Payload;

import java.time.LocalDate;

public class MedicationDto {

    private Long id;
    private String medicationName;
    private String dosage;
    private String frequency;
    private String route;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer refills;
    private String prescriberName;
    private String prescriberContact;
    private Long patientId;
    
    public MedicationDto() {
    }

    public MedicationDto(Long id, String medicationName, String dosage, String frequency, String route,
                         LocalDate startDate, LocalDate endDate, Integer refills, String prescriberName,
                         String prescriberContact, Long patientId) {
        this.id = id;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.route = route;
        this.startDate = startDate;
        this.endDate = endDate;
        this.refills = refills;
        this.prescriberName = prescriberName;
        this.prescriberContact = prescriberContact;
        this.patientId = patientId;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getRefills() {
        return refills;
    }

    public void setRefills(Integer refills) {
        this.refills = refills;
    }

    public String getPrescriberName() {
        return prescriberName;
    }

    public void setPrescriberName(String prescriberName) {
        this.prescriberName = prescriberName;
    }

    public String getPrescriberContact() {
        return prescriberContact;
    }

    public void setPrescriberContact(String prescriberContact) {
        this.prescriberContact = prescriberContact;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
}

