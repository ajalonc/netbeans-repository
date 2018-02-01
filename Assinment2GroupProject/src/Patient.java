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
    private MyDate patientDOB;
    private MyDate arival;
    private MyDate depart;

    public Patient() {
    }

    public Patient(int id, Person patient, Doctor doctor, MyDate patientAge,
                    MyDate arival, MyDate depart) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.patientDOB = patientAge;
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
        return patientDOB;
    }

    public void setPatientAge(MyDate patientAge) {
        this.patientDOB = patientAge;
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

       
    
//calculate age method - Timothy Robinson
    public int calculateAge() {
        return (depart.getYear() - patientDOB.getYear() );
    }
    
    
    
    @Override   //Timothy Robinson
    public String toString() {
        return "Patient Information: " + "\n" +
                "**************************" + "\n" +
                "ID: " + id + "\n" +
                "Patient: " + patient + ", " + 
                    this.calculateAge() + " years old" + "\n" +
                "Doctor: " + doctor + "\n" +
                "Patients Birth date: " + patientDOB +"\n" +
                "Admission Date: " + arival + "\n" +
                "Discharge Date: " + depart + "\n" +
                "**************************" + "\n";
    }




}
