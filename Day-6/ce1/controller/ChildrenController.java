package com.example.day6_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6_1.model.Children;
import com.example.day6_1.service.ChildrenService;

@RestController
public class ChildrenController {
    @Autowired
    ChildrenService childrenService;
    @PostMapping("/api/children")
    public ResponseEntity<Children> postChildren(@RequestBody Children c)
    {
        return new ResponseEntity<>(childrenService.postChildren(c),HttpStatus.CREATED);
    }
    @GetMapping("/api/children/sortBy/{field}")
    public List<Children> sortChildrens(@PathVariable String field)
    {
        return childrenService.getChildrenWithSorting(field);
    }
    @GetMapping("/api/children/{offset}/{pagesize}")
    public List<Children> getChildrens(@PathVariable int offset,@PathVariable int pagesize)
    {
        return childrenService.findChildren(offset, pagesize);
    }
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public List<Children> getData(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        return childrenService.getChildrenWithPagingandFieldSorting(offset, pagesize, field);
    }
}
