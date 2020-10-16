package cn.com.tjise.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "training", catalog = "")
public class UserEntity {
    private int userId;
    private String userName;
    private String userPassword;
    private String userGender;
    private String userPname;
    private String userProvicnes;
    private String userCity;
    private String userStreet;
    private String userPhone;
    private String userContact;
    private Date userBirthday;
    private String userPostnumber;

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_gender")
    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    @Basic
    @Column(name = "user_pname")
    public String getUserPname() {
        return userPname;
    }

    public void setUserPname(String userPname) {
        this.userPname = userPname;
    }

    @Basic
    @Column(name = "user_provicnes")
    public String getUserProvicnes() {
        return userProvicnes;
    }

    public void setUserProvicnes(String userProvicnes) {
        this.userProvicnes = userProvicnes;
    }

    @Basic
    @Column(name = "user_city")
    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    @Basic
    @Column(name = "user_street")
    public String getUserStreet() {
        return userStreet;
    }

    public void setUserStreet(String userStreet) {
        this.userStreet = userStreet;
    }

    @Basic
    @Column(name = "user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_contact")
    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    @Basic
    @Column(name = "user_birthday")
    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Basic
    @Column(name = "user_postnumber")
    public String getUserPostnumber() {
        return userPostnumber;
    }

    public void setUserPostnumber(String userPostnumber) {
        this.userPostnumber = userPostnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userGender, that.userGender) &&
                Objects.equals(userPname, that.userPname) &&
                Objects.equals(userProvicnes, that.userProvicnes) &&
                Objects.equals(userCity, that.userCity) &&
                Objects.equals(userStreet, that.userStreet) &&
                Objects.equals(userPhone, that.userPhone) &&
                Objects.equals(userContact, that.userContact) &&
                Objects.equals(userBirthday, that.userBirthday) &&
                Objects.equals(userPostnumber, that.userPostnumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPassword, userGender, userPname, userProvicnes, userCity, userStreet, userPhone, userContact, userBirthday, userPostnumber);
    }
}
