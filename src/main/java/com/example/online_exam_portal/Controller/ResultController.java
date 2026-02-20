package com.example.online_exam_portal.Controller;

import com.example.online_exam_portal.Model.UserResult;
import com.example.online_exam_portal.Service.UserResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/result")

public class ResultController {
    @Autowired
    private UserResultService userResultService;

    @PostMapping("/submit")
    public UserResult submitResult(@RequestBody UserResult result){
        return userResultService.submitResult(result);
    }

    @GetMapping("/all")
    public List<UserResult> getAllResults(){
        return userResultService.getAllResults();
    }

}

