public class Contact {

    String firstName;
    String lastName;
    String city;
    String mobileNumber;

    public Contact(String firstName,String lastname, String city, String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.mobileNumber = mobileNumber;

    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
