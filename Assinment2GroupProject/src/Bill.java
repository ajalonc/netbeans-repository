/**
 *
 * @author ajalon
 */
public class Bill {



    
    private int id;
    private double medicine;
    private double doctorFee;
    private double roomCost;

    public Bill() {
    }

    public Bill(int id, double medicine, double doctorFee, double roomCost) {
        this.id = id;
        this.medicine = medicine;
        this.doctorFee = doctorFee;
        this.roomCost = roomCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMedicine() {
        return medicine;
    }

    public void setMedicine(double medicine) {
        this.medicine = medicine;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }


    // calculateTotalCharge method - Timothy Robinson
    public double calculateTotalCharge() {
    return (this.medicine + this.doctorFee + this.roomCost);
    }



    @Override //Timothy Robinson
    public String toString() {
        return "\nPatient Bill Information:" + "\n" +
               "**************************" + "\n" +
               "Patient Id: " + id + "\n" +
               "Pharmacy Charge: $" + medicine + "\n" +
               "Doctor Fee: $" + doctorFee + "\n" +
               "Room Charge: $" + roomCost + "\n\n" +
                "Total charge: $-.2f" + this.calculateTotalCharge();
    }


    //@Override
    //public String toString() {
    //    return "Id: " + id +
    //           "Medicine: $" + medicine +
    //           "DoctorFee: $" + doctorFee +
    //           "RoomCost: $" + roomCost;
    //}




}
