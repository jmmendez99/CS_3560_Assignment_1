package com.company;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VotingService {
    //Dictionary to hold answers and the # of times they were selected
    Hashtable<String,Integer> answer_aggregate = new Hashtable<>();

    //Properties
    private String type;
    private String answer;

    //Constructor
    public VotingService () {}

    //Getters
    public String getType() {
        return type;
    }

    public String getAnswer() {
        return answer;
    }

    //Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //Class methods
    public void aggregate_student_answers() {
        //Build key-value pair to put into hashmap
        Integer count = answer_aggregate.get(getAnswer());

        //If there is no value for the key-value pair, set value to 1
        if (count == null) {
            answer_aggregate.put(getAnswer(), 1);
        }
        //If answer exists, increment its counter
        else if (answer_aggregate.containsKey(getAnswer())) {
            answer_aggregate.put(getAnswer(),count + 1);
        }
        //If answer doesn't exist, put create new entry in hashtable
        else {
            answer_aggregate.put(getAnswer(),count);
        }
    }

    public void output_statistics() {
        //Create iterator to output key-value pairs
        Set set = answer_aggregate.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
