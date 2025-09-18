package com.tirth.QuizeApp.Service;

import com.tirth.QuizeApp.Controller.Question;
import com.tirth.QuizeApp.DAO.Questiondao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private Questiondao questiondao;

    public List<Question> getAllQuestions() {
        return questiondao.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questiondao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questiondao.save(question);
        return "Success";
    }
}
