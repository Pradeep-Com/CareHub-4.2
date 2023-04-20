package com.CareHub.Controller;

import com.CareHub.Payload.MedicationDto;
import com.CareHub.Service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @GetMapping("/{medicationId}")
    public ResponseEntity<MedicationDto> getMedicationById(@PathVariable Long medicationId) {
        MedicationDto medication = medicationService.getMedicationById(medicationId);
        if (medication == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medication);
    }

    @PostMapping
    public ResponseEntity<MedicationDto> createMedication(@RequestBody MedicationDto medicationDto) {
        MedicationDto createdMedication = medicationService.createMedication(medicationDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{medicationId}")
                .buildAndExpand(createdMedication.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdMedication);
    }

    @PutMapping("/{medicationId}")
    public ResponseEntity<MedicationDto> updateMedication(@PathVariable Long medicationId, @RequestBody MedicationDto medicationDto) {
        MedicationDto updatedMedication = medicationService.updateMedication(medicationId, medicationDto);
        if (updatedMedication == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedMedication);
    }

    @DeleteMapping("/{medicationId}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long medicationId) {
        medicationService.deleteMedication(medicationId);
        return ResponseEntity.noContent().build();
    }
}

