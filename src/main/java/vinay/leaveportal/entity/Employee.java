package vinay.leaveportal.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="salary")
    private Integer salary;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="designation")
    private String designation;

    @Column(name="date_of_joining")
    private Date dateOfJoining;

    @Column(name="date_of_leaving")
    private Date dateOfLeaving;

    @Column(name="photo")
    private String Photo;

    @Column
    private String status;

    public Employee(){

    }


    public Employee(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public Date getDateOfJoining() {
        return dateOfJoining;
    }


    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }


    public Date getDateOfLeaving() {
        return dateOfLeaving;
    }


    public void setDateOfLeaving(Date dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public String getPhoto() {
        return Photo;
    }


    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth + ", designation=" + designation
                + ", dateOfJoining=" + dateOfJoining + ", dateOfLeaving=" + dateOfLeaving + ", Photo=" + Photo + "]";
    }

}
