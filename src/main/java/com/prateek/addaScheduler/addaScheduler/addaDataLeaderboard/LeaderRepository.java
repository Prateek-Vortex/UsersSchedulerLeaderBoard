package com.prateek.addaScheduler.addaScheduler.addaDataLeaderboard;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface LeaderRepository extends CrudRepository<LeaderModel,Long> {

    @Transactional
    @Modifying
    @Query(
            value = "insert into leaderboard(id,first_name,user_id,total_marks,user_rank) select id,first_name,user_id,total_marks, dense_rank() OVER (ORDER BY total_marks DESC) AS userRank FROM marks limit 10;",nativeQuery = true
    )

    //insert into leaderboard select userId,firstName,aptitude,coding,totalMarks, dense_rank() OVER (ORDER BY totalMarks DESC) AS userRank FROM marks limit 10;
     void saveInLeaderboard();


}
