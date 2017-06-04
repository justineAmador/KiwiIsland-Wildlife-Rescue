/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class TrueFalseQuestionTest {
    private Position position;
    private Island island;
    private Tool tool1;
    private Tool tool2;
    private Tool tool3;
    private Tool tool4;
    
    public TrueFalseQuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        island = new Island(5,5);
        position = new Position(island, 4,4);
        tool1 = new Tool(position, "Trap","An effective and efficient pest trap", 1, 1);
        tool2 = new Tool(position, "Trap","An effective and efficient pest trap", 1, 1);
        tool3 = new Tool(position, "Trap","An effective and efficient pest trap", 1, 1);
        tool4 = new Tool(position, "Trap","An effective and efficient pest trap", 1, 1);
    }
    
    @After
    public void tearDown() {
        island = null;
        position = null;
        tool1 = null;
        tool2 = null;
        tool3 = null;
        tool4 = null;
    }
    
    @Test
    public void checkAnswerTest(){
        
        TrueFalseQuestion question2 = tool2.getQuestion();
        TrueFalseQuestion question4 = tool4.getQuestion();
        
        assertEquals(question2.checkAnswer(true), false);
        assertEquals(question2.checkAnswer(false), true);
        assertEquals(question4.checkAnswer(true), false);
        assertEquals(question4.checkAnswer(false), true);
       
    }
    //Test that ensures that each tool generates a different question to prevent clone questions
    //Also ensures that a question is assigned appropriatley when an item is created.
    //In this case the first tool created should have the first question and the third should contain
    // the third respectively.
    @Test
    public void getQuestionTest(){
       TrueFalseQuestion question1 = tool1.getQuestion(); 
       assertEquals(question1.getQuestion(), "Stoats are responsible for approximately half of kiwi chick deaths");
       }
    
    /**
     *
     */
    
    
    /* @Test
    public boolean checkAnswer(boolean answer){
        return this.answer == answer;
    }*/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
