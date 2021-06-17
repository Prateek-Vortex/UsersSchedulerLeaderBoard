package com.prateek.addaScheduler.addaScheduler.addaDataLeaderboard;

import javax.persistence.*;
import java.util.UUID;

@Entity(name="leaderboard")
@Table(name = "leaderboard")
public class LeaderModel {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String userId;
    @Column
    private String firstName;
    @Column
    private int totalMarks;
    @Column
    private int userRank;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getUserRank() {
        return userRank;
    }

    public void setUserRank(int userRank) {
        this.userRank = userRank;
    }
}
