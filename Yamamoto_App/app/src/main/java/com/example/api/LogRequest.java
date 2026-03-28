package com.example.api;

public class LogRequest {
    private int    prescriptionId;
    private int    patientId;
    private int    painLevel;
    private int    mobilityLevel;
    private String observations;

    public LogRequest(int prescriptionId, int patientId, int painLevel, int mobilityLevel, String observations) {
        this.prescriptionId = prescriptionId;
        this.patientId      = patientId;
        this.painLevel      = painLevel;
        this.mobilityLevel  = mobilityLevel;
        this.observations   = observations;
    }
}