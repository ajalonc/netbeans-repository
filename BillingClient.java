
/**
 *
 * @author ajalon
 */
import java.util.Scanner;

public class BillingClient {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
       
            //ajalons code
        System.out.print("Hospital Billing System Program ");
        System.out.print("\n\nEnter patient's ID: ");
        int id = console.nextInt();
        System.out.print("Enter patient's first name: ");
        String firstName = console.next();
        System.out.print("Enter patient's last name: ");
        String lastName = console.next();
        
        System.out.println("\nEnter Doctor's first name: ");
        String drFirstName = console.next();
        System.out.println("Enter Doctor's last name: ");
        String drLastName = console.next();
        System.out.println("Enter Docter's specialty: ");
        String drSpecialty = console.next();
        System.out.println("Enter patient's dirth date (xx/xx/xxxx): ");
        String patientAge = console.next();
        String delims = "[/]";
        String[] patientDate = patientAge.split(delims);
        int patientMonth = Integer.parseInt(patientDate[0]);
        int patientDay = Integer.parseInt(patientDate[1]);
        int patientYear = Integer.parseInt(patientDate[2]);
        
        
        
        System.out.println("Enter patient's admission date (xx/xx/xxxx): ");
        String admission = console.next();
        String[] admissionDate = admission.split(delims);
        int admissionMonth = Integer.parseInt(admissionDate[0]);
        int admissionDay = Integer.parseInt(admissionDate[1]);
        int admissionYear = Integer.parseInt(admissionDate[2]);
        
        System.out.println("Enter patient's discharge date (xx/xx/xxxx): ");
        String discharge = console.next();
        String[] dischargeDate = discharge.split(delims);
        int dischargeMonth = Integer.parseInt(dischargeDate[0]);
        int dischargeDay = Integer.parseInt(dischargeDate[1]);
        int dischargeYear = Integer.parseInt(dischargeDate[2]);
        
        System.out.print("\n\nEnter pharmecy charge: ");
        double medicine = console.nextDouble();
        System.out.print("\nEnter docter's fee: ");
        double drFee = console.nextDouble();
        System.out.print("\nEnter room charge: ");
        double room = console.nextDouble();
        
        
        
        
        

        
        
          //ajalon end

    }
}
