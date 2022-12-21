package lab30;

public class Customer {
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    public static final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 20, null);
    public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 10, null);

    Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }


}
