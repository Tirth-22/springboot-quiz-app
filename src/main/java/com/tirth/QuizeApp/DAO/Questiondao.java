package com.tirth.QuizeApp.DAO;

import com.tirth.QuizeApp.Controller.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Questiondao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);
}
