package cn.com.tjise.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "training", catalog = "")
public class AddressEntity {
    private int addressId;
    private int userId;
    private String addressProvicense;
    private String addressCity;
    private String addressStreet;
    private String addressContact;
    private String addressPhone;
    private String addressPostnumber;

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "address_provicense")
    public String getAddressProvicense() {
        return addressProvicense;
    }

    public void setAddressProvicense(String addressProvicense) {
        this.addressProvicense = addressProvicense;
    }

    @Basic
    @Column(name = "address_city")
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @Basic
    @Column(name = "address_street")
    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    @Basic
    @Column(name = "address_contact")
    public String getAddressContact() {
        return addressContact;
    }

    public void setAddressContact(String addressContact) {
        this.addressContact = addressContact;
    }

    @Basic
    @Column(name = "address_phone")
    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    @Basic
    @Column(name = "address_postnumber")
    public String getAddressPostnumber() {
        return addressPostnumber;
    }

    public void setAddressPostnumber(String addressPostnumber) {
        this.addressPostnumber = addressPostnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return addressId == that.addressId &&
                userId == that.userId &&
                Objects.equals(addressProvicense, that.addressProvicense) &&
                Objects.equals(addressCity, that.addressCity) &&
                Objects.equals(addressStreet, that.addressStreet) &&
                Objects.equals(addressContact, that.addressContact) &&
                Objects.equals(addressPhone, that.addressPhone) &&
                Objects.equals(addressPostnumber, that.addressPostnumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, userId, addressProvicense, addressCity, addressStreet, addressContact, addressPhone, addressPostnumber);
    }
}
