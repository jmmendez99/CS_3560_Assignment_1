package com.company;

import java.util.UUID;

public class Student extends Question{
    //Properties
    private String unique_ID;
    private String type;
    private String answer;

    //Constructor
    public Student(String type) {
        unique_ID = UUID.randomUUID().toString();
        this.type = type;
    }

    //Getters
    public String getType() {
        return type;
    }

    public String getUnique_ID() {
        return unique_ID;
    }


    public String getAnswer() {return answer; }

    //Setters
    public void setAnswer(String answer) {this.answer = answer; }

    //Class Methods
    public void answer_question() {
        //Answer multiple choice question
        if (getType().equals("multiple choice")) {
            setMc_answer();
            String mc_answer = getMc_answer();
            setAnswer(mc_answer);
        }
        //Answer single choice question
        else if (getType().equals("single choice")) {
            setSc_answer();
            String sc_answer = getSc_answer();
            setAnswer(sc_answer);
        }
    }
}
