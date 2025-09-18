package com.tirth.QuizeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    @GetMapping("AllQuestions")
    public String getQuestions(){
        return "Tirth spring boot test";
    }
}
