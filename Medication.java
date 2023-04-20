package com.CareHub.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medications")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "medication_name")
    private String medicationName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "route")
    private String route;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "refills")
    private int refills;

    @Column(name = "prescriber_name")
    private String prescriberName;

    @Column(name = "prescriber_contact")
    private String prescriberContact;

    @Column(name = "patient_id")
    private Long patientId;

    // Constructors, getters and setters, and other methods
}
