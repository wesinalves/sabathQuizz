/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author wesinalves
 */
public class Quizz {
    private String title;
    private List<Question> questions;
    private Integer result;

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }
    
    public Integer getResult() {
        return result;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public void setResult(Integer result) {
        this.result = result;
    }
    
    
    
}
