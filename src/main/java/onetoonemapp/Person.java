package onetoonemapp;

import javax.persistence.*;

//personid,personname,phono,email
@Entity
@Table(name = "Person_Data")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int personid;
   private String personname ;
  private long  phono;
   private String email;

   @OneToOne
   private Address address;
    public int getPersonid() {
        return personid;
    }

//    public void setPersonid(int personid) {
//        this.personid = personid;
//    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public long getPhono() {
        return phono;
    }

    public void setPhono(long phono) {
        this.phono = phono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
