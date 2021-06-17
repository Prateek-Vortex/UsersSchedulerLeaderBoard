package com.prateek.addaScheduler.addaScheduler.addaService;

import com.prateek.addaScheduler.addaScheduler.addaData.MarksEntity;
import com.prateek.addaScheduler.addaScheduler.addaData.MarksRepository;
import com.prateek.addaScheduler.addaScheduler.addaDataLeaderboard.LeaderRepository;
import com.prateek.addaScheduler.addaScheduler.addaModel.UserAddMarksModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MarksServiceImpl implements MarksService {

    @Autowired
    MarksRepository marksRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    LeaderRepository leaderRepository;

    @Override
    public void addMarks(UserAddMarksModel userAddMarksModel) {
        MarksEntity marksEntity=modelMapper.map(userAddMarksModel,MarksEntity.class);
        marksEntity.setTotalMarks(userAddMarksModel.getAptitude()+userAddMarksModel.getCoding());
        marksRepository.save(marksEntity);
    }

    @Override
    @Scheduled(fixedRate = 60*60*1000)
    public void updateLeaderBoard() {

       System.out.println("update leader board is called "+System.currentTimeMillis() / 1000);
       leaderRepository.deleteAll();
       leaderRepository.saveInLeaderboard();
    }


}
