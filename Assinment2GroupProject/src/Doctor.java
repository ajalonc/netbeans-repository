/*
 *Author: Timothy Robinson
 *Date:1/29/2018
 *Assignment: Assignment2 Doctor.java
 *Description: Stores Doctors first name and last name through aggrigation
 * as well as their specialty.
 */


public class Doctor {

        //data members
    private String specialty;
    private Person doctorName;

    public Doctor() {
    }

    public Doctor(String specialty, Person doctorName) {
        this.specialty = specialty;
        this.doctorName = doctorName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Person getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(Person doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Doctors Name: " + doctorName + "\n" + 
                "Specialty: " + specialty;
    }





}       //end class