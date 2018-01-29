/*
 *Author: Timothy Robinson
 *Date:
 *Assignment: Assignment .java
 *Description:
 */


public class Person {

        //data members
    private String firstName;
    private String lastName;



            //default constructor
    public Person() {
    }


            //override constructor
    public Person(String firstName, String lastName, String address, String city, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }





}       //end class
