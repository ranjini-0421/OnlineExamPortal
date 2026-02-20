package com.example.online_exam_portal.Service;

import com.example.online_exam_portal.Model.UserResult;
import com.example.online_exam_portal.Repository.UserResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserResultService {
    @Autowired
    private UserResultRepository resultRepo;

    public UserResult submitResult(UserResult result){
        return resultRepo.save(result);
    }

    public List<UserResult> getAllResults(){
        return resultRepo.findAll();
    }


}
