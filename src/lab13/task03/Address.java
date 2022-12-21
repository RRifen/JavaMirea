package lab13.task03;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void AddressSplit(String address) {
        String[] addressFields = address.split(",");
        country = addressFields[0].trim();
        region = addressFields[1].trim();
        city = addressFields[2].trim();
        street = addressFields[3].trim();
        house = addressFields[4].trim();
        building = addressFields[5].trim();
        apartment = addressFields[6].trim();
    }

    public void AddressTokenizer(String address) {
        StringTokenizer addressFields = new StringTokenizer(address, ",.;");
        country = addressFields.nextToken().trim();
        region = addressFields.nextToken().trim();
        city = addressFields.nextToken().trim();
        street = addressFields.nextToken().trim();
        house = addressFields.nextToken().trim();
        building = addressFields.nextToken().trim();
        apartment = addressFields.nextToken().trim();
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
