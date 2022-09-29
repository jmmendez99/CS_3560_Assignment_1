package com.company;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        //Configure question type and pass it to Voting Service
        Question q = new Question();
        VotingService vs = new VotingService();
        vs.setType(q.question_type());

        //Generate a random amount of students
        Random rand = new Random();
        int num_of_students = rand.nextInt(50);
        Student[] students = new Student[num_of_students];

        for (int i=0; i < num_of_students; i++) {
            students[i] = new Student(vs.getType());
        }

        //Generate answers for all students
        for (int i=0; i < num_of_students; i++) {
            //Get answer from student and set it's answer for
            //the VotingService object
            students[i].answer_question();
            vs.setAnswer(students[i].getAnswer());

            //Add that answer to hashtable
            vs.aggregate_student_answers();
        }

        //Output results of the voting
        System.out.println(students.length + " students are responding to a " + q.question_type() + " question!");
        System.out.println("Answer Totals:");
        vs.output_statistics();
    }
}
