package com.prateek.addaScheduler.addaScheduler.addaData;

import javax.persistence.*;

@Entity(name="marks")
@Table(name = "marks")
public class MarksEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String userId;
    @Column
    private String firstName;
    @Column
    private int aptitude;
    @Column
    private int coding;
    @Column
    private int totalMarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public int getAptitude() {
        return aptitude;
    }

    public void setAptitude(int aptitude) {
        this.aptitude = aptitude;
    }

    public int getCoding() {
        return coding;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
