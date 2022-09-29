package com.company;

import java.util.Random;

public class Question {
    //Properties
    private String mc_answer;
    private String sc_answer;

    //Constructor
    public Question() {}

    //Getters
    public String getMc_answer() {
        return mc_answer;
    }

    public String getSc_answer() {
        return sc_answer;
    }

    //Setters
    public void setMc_answer() {
        this.mc_answer = multiple_choice_answer();
    }

    public void setSc_answer() {
        this.sc_answer = single_choice_answer();
    }

    //Class methods
    private int generate_random_index(String[] array) {
        Random rand = new Random();
        return rand.nextInt(array.length);
    }

    public String question_type() {
        final String [] question_type_arr = {"multiple choice","single choice"};
        int index = generate_random_index(question_type_arr);
        return question_type_arr[index];
    }

    public String multiple_choice_answer() {
        final String [] multiple_choice_answers_arr = {"A","B","C","D"};
        int index = generate_random_index(multiple_choice_answers_arr);
        return multiple_choice_answers_arr[index];
    }

    public String single_choice_answer() {
        final String [] single_choice_answers_arr = {"True","False"};
        int index = generate_random_index(single_choice_answers_arr);
        return single_choice_answers_arr[index];
    }
}
