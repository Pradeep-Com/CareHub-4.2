package com.CareHub.Service;

import com.CareHub.Entity.Medication;
import com.CareHub.Payload.MedicationDto;
import com.CareHub.Repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    public MedicationDto getMedicationById(Long medicationId) {
        Medication medication = medicationRepository.findById(medicationId).orElse(null);
        if (medication == null) {
            return null;
        }
        return mapToDto(medication);
    }

    public MedicationDto createMedication(MedicationDto medicationDto) {
        Medication medication = mapToEntity(medicationDto);
        medication = medicationRepository.save(medication);
        return mapToDto(medication);
    }

    public MedicationDto updateMedication(Long medicationId, MedicationDto medicationDto) {
        Medication medication = medicationRepository.findById(medicationId).orElse(null);
        if (medication == null) {
            return null;
        }
        medication.setPatientId(medicationDto.getPatientId());
        medication.setDosage(medicationDto.getDosage());
        medication.setRoute(medicationDto.getRoute());
        medication.setFrequency(medicationDto.getFrequency());
        medication.setStartDate(medicationDto.getStartDate());
        medication.setEndDate(medicationDto.getEndDate());
        medication = medicationRepository.save(medication);
        return mapToDto(medication);
    }

    public void deleteMedication(Long medicationId) {
        medicationRepository.deleteById(medicationId);
    }

    private MedicationDto mapToDto(Medication medication) {
        MedicationDto medicationDto = new MedicationDto();
        medicationDto.setId(medication.getId());
        medicationDto.setPatientId(medication.getPatientId());
        medicationDto.setDosage(medication.getDosage());
        medicationDto.setRoute(medication.getRoute());
        medicationDto.setFrequency(medication.getFrequency());
        medicationDto.setStartDate(medication.getStartDate());
        medicationDto.setEndDate(medication.getEndDate());
        return medicationDto;
    }

    private Medication mapToEntity(MedicationDto medicationDto) {
        Medication medication = new Medication();
        medication.setPatientId(medicationDto.getPatientId());
        medication.setDosage(medicationDto.getDosage());
        medication.setDosage(medicationDto.getDosage());
        medication.setRoute(medicationDto.getRoute());
        medication.setFrequency(medicationDto.getFrequency());
        medication.setStartDate(medicationDto.getStartDate());
        medication.setEndDate(medicationDto.getEndDate());
        return medication;
    }
}
