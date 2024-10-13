package de.thws.lektion15.quiz;

import de.thws.lektion15.quiz.MultipleChoiceQuestion;
import de.thws.lektion15.quiz.Question;
import de.thws.lektion15.quiz.TextQuestion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    public void testTextQuestion(){
        Question question = new TextQuestion("Was ist die Hauptstadt von Deutschland?");
        assertEquals(question.text + "\nAntwort:\n\n", question.generateQuestion());
    }

    @Test
    public void testMultipleChoiceQuestion(){
        String[] answers = {"4", "2", "1", "0"};

        Question question = new MultipleChoiceQuestion("Wie viele Protonen hat ein Wasserstoff-Atom?", answers);

        String result = question.text + "\nAntwortmöglichkeiten:\n";
        char option = 'A';
        for(String answer : answers){
            result += option + ":" + answer + "\n";
            option++;
        }


        assertEquals(result, question.generateQuestion());
    }

}