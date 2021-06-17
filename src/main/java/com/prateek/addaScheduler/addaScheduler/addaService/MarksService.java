package com.prateek.addaScheduler.addaScheduler.addaService;


import com.prateek.addaScheduler.addaScheduler.addaModel.UserAddMarksModel;

public interface MarksService {
    void addMarks(UserAddMarksModel userAddMarksModel);

    void updateLeaderBoard();
}
