package week3;

// Program 11: Address class with encapsulation (private fields + getters/setters)

class Address {
    private String street;
    private String city;
    private String zipCode;

    // Getters
    public String getStreet()  { return street; }
    public String getCity()    { return city; }
    public String getZipCode() { return zipCode; }

    // Setters
    public void setStreet(String street)   { this.street = street; }
    public void setCity(String city)       { this.city = city; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}

public class Program11 {
    public static void main(String[] args) {

        Address addr = new Address();

        // Set values using setters
        addr.setStreet("Thamel Road");
        addr.setCity("Kathmandu");
        addr.setZipCode("44600");

        // Get values using getters
        System.out.println("Street  : " + addr.getStreet());
        System.out.println("City    : " + addr.getCity());
        System.out.println("ZipCode : " + addr.getZipCode());

        // Update city
        addr.setCity("Lalitpur");
        System.out.println("Updated City : " + addr.getCity());
    }
}
