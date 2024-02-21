package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo uRepo;

    public User postUser(User r)
    {
        return uRepo.save(r);
    }

    public List<User> getUser()
    {
        return uRepo.findAll();
    }

    public User editUser(User u,Long userId)
    {
        User uAvail=uRepo.findById(userId).orElse(null);

        if(uAvail!=null)
        {
            uAvail.setFname(u.getFname());
            uAvail.setLname(u.getLname());
            uAvail.setPwd(u.getPwd());

            return uRepo.saveAndFlush(uAvail);
        }
        else{
            return null;
        }
    }
    
    
    public String delUserById(Long userId)
    {
        uRepo.deleteById(userId);
        return ("Deleted User Account");

    }

    public User getUserByEmail(String email) {
        return uRepo.getUserByEmail(email);
    }

}
