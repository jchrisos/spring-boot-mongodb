package mongodb.documents;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by juliochrisostomo on 20/08/17.
 */
public class User {

    @Id
    private String id;

    private String name;

    private String phone;

    private String birthDate;

    private Boolean acceptTerms;

    private Integer amountOfCars;

    private Double balance;

    private Date createdAt;

    private Date updateAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getAcceptTerms() {
        return acceptTerms;
    }

    public void setAcceptTerms(Boolean acceptTerms) {
        this.acceptTerms = acceptTerms;
    }

    public Integer getAmountOfCars() {
        return amountOfCars;
    }

    public void setAmountOfCars(Integer amountOfCars) {
        this.amountOfCars = amountOfCars;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
