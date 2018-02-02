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

    public Patient(int id, Person patient, Doctor doctor, MyDate patientDOB,
                   MyDate arival, MyDate depart) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.patientDOB = patientDOB;
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

    public MyDate getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(MyDate patientDOB) {
        this.patientDOB = patientDOB;
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

    //@Override
    //public String toString() {
    //    return "id: " + id + "\n" +
    //            "patien: " + patient + "\n" +
    //            "doctor: " + doctor + "\n" +
    //            "patientAge: " + patientAge +"\n" +
    //            "arival: " + arival + "\n" +
    //            "depart: " + depart;
   // }
    
    
    
    
}
