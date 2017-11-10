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
public class Question {
    private String number;
    private String description;
    private List<Answer> answers;

    public String getNumber() {
        return number;
    }

        
    public String getDescription() {
        return description;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setNumber(String number) {
        this.number = number;
    }
        
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
    
            
    
}
