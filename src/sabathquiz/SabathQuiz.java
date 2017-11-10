/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabathquiz;

import bean.Answer;
import bean.Question;
import bean.Quizz;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wesinalves
 */
public class SabathQuiz {

    /**
     * @param args the command line arguments
     */
        
    /*public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*XStream xstream =  new XStream(new DomDriver());
        xstream.alias("Quizz",Quizz.class);
        xstream.alias("question",Question.class);
        xstream.alias("answer",Answer.class);
        
        String xml = xstream.toXML(quizz);
        
        //System.out.println(xml);
        
        generateFile(xml);*/
        
        /*readFile();
        
    }*/
    
    public static void readFile(){
        try {
            FileReader fr;
            fr = new FileReader("quizz.xml");
            XStream xstream = new XStream(new DomDriver());
            xstream.alias("Quizz",Quizz.class);
            xstream.alias("question",Question.class);
            xstream.alias("answer",Answer.class);
            Quizz quizz = (Quizz) xstream.fromXML(fr);
            
            //System.out.println(quizz.getTitle());
            
            /*for(Question qt: quizz.getQuestions()){
                System.out.println(qt.getNumber());
                System.out.println(qt.getDescription());
                for(Answer as: qt.getAnswers()){
                    System.out.println(as.getDescription());
                    System.out.println(as.getValue());
                }
                System.out.println("#################");
            }*/
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SabathQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void generateFile(String xml){
        PrintWriter print = null;
        try {
            File file = new File("quizz.xml");
            print = new PrintWriter(file);
            print.write(xml);
            print.flush();
            print.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SabathQuiz.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            print.close();
        }
        
    }
    
    private static Quizz setQuizz() {
        Quizz qzz = new Quizz();
        
        Question qt[];
        qt = new Question[9];
        Answer as[];
        as = new Answer[4];
        
        
        List<Question> listQuestions = new ArrayList<>();
                
        qzz.setTitle("Quizz - Entristecendo o Espirito Santo");
        
        for(int i = 0; i<qt.length; i++){
           qt[i] = new Question();
           qt[i].setDescription("Descrição da Pergunta " + (i+1));
           qt[i].setNumber("Pergunta "+ (i+1));
           List<Answer> listAnswers = new ArrayList<>();
           for(int j = 0; j < as.length; j++){
               as[j] = new Answer();
               as[j].setDescription("A resposta "+ (j+1) + " da pergunta" + (i+1));
               as[j].setValue(true);
               listAnswers.add(as[j]);
           }
           qt[i].setAnswers(listAnswers);
           listQuestions.add(qt[i]);
        }
        
        qzz.setQuestions(listQuestions);
        
        return qzz;
        
    }
}
