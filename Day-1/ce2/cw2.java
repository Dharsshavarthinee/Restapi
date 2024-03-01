package com.example.day1;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;
    
    @RestController
    public class cw2 {
        @GetMapping ("/stuName")
        public String getMethodName(@RequestParam String studentName)
        {
            return ("Welcome "+studentName+"!");
        }
    }   

