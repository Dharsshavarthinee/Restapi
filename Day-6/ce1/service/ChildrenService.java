package com.example.day6_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6_1.model.Children;
import com.example.day6_1.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    ChildrenRepo childrenRepo;
    public Children postChildren(Children c)
    {
        return childrenRepo.save(c);
    }
    public List<Children> getChildrenWithSorting(String field)
    {
        Sort s=Sort.by(Sort.Direction.ASC,field);
        return childrenRepo.findAll(s);
    }
    public List<Children> findChildren(int pageNumber,int pageSize)
    {
        return childrenRepo.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }
    public List<Children> getChildrenWithPagingandFieldSorting(int pageNumber,int pageSize,String field)
    {
        return childrenRepo.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }

}
