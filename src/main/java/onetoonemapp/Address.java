package onetoonemapp;

import javax.persistence.*;

@Entity
@Table(name = "Address_Data")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // addressid,housenumber,area,city and pincode.
    private int addressid;
    private String housenumber;
    private String area;
    private String city;
    private long pincode;

    public int getAddressid() {
        return addressid;
    }

//    public void setAddressid(int addressid) {
//        this.addressid = addressid;
//    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }
}
