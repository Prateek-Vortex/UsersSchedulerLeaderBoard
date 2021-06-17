package com.prateek.addaScheduler.addaScheduler.addaController;

import com.prateek.addaScheduler.addaScheduler.addaModel.UserAddMarksModel;
import com.prateek.addaScheduler.addaScheduler.addaService.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("adda")
public class AddaController {

    @Autowired
    MarksService marksService;

    @PostMapping("/add/marks")
    public String addMarks(@RequestBody UserAddMarksModel userAddMarksModel){
    marksService.addMarks(userAddMarksModel);
    return "User Marks added successfully";
    }


}
