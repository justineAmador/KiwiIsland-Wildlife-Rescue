/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

/**
 *
 * @author
 */
public class TrueFalseQuestion {
    
    private String question;
    private boolean answer;
    
    public TrueFalseQuestion(String question, boolean answer){
        this.question = question;
        this.answer = answer;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public boolean checkAnswer(boolean answer){
        return this.answer == answer;
    }
}
