package com.tirth.QuizeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class QuizeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizeAppApplication.class, args);
	}

    @RestController
    @RequestMapping("question")
    public static class QuestionController {
        @GetMapping("allQuestion")

        public String getAllQuestions(){
            return "this is tirth starting of springboot";
        }
    }
}
