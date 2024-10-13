package de.thws.lektion15.quiz;

public class Quiz {

    Question[] questions;

    public void printQuiz(){
        for(int i = 0; i < questions.length; i++){
            questions[i].generateQuestion();
        }
    }
}
