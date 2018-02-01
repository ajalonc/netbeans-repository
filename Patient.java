/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajalon
 */
public class Patient {
    
    private int id;
    private Person patient;
    private Doctor doctor;
    private MyDate patientAge;
    private MyDate arival;
    private MyDate depart;

    public Patient() {
    }

    public Patient(int id, Person patient, Doctor doctor, MyDate patientAge, MyDate arival, MyDate depart) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.patientAge = patientAge;
        this.arival = arival;
        this.depart = depart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public MyDate getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(MyDate patientAge) {
        this.patientAge = patientAge;
    }

    public MyDate getArival() {
        return arival;
    }

    public void setArival(MyDate arival) {
        this.arival = arival;
    }

    public MyDate getDepart() {
        return depart;
    }

    public void setDepart(MyDate depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "patien: " + patient + "\n" +
                "doctor: " + doctor + "\n" +
                "patientAge: " + patientAge +"\n" +
                "arival: " + arival + "\n" +
                "depart: " + depart;
    }
    
    
    
    
}
