package com.CareHub.Exception;

public class MedicationException extends RuntimeException {
    public MedicationException(String message) {
        super(message);
    }

    public MedicationException(String message, Throwable cause) {
        super(message, cause);
    }
}