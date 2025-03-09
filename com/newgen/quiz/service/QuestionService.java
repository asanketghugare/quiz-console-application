package com.newgen.quiz.service;

import com.newgen.quiz.model.Question;

import java.util.Scanner;

public class QuestionService {

   Question [] questions = new Question[5];
   String userProvidedAns[] = new String[5];
   public QuestionService(){

       questions[0] =new Question(1,"What is the size of short ?","2","4","8","1","2");
       questions[1] =new Question(2,"What is the size of int ?","2","4","8","1","4");
       questions[2] =new Question(3,"What is the size of float ?","2","4","8","1","4");
       questions[3] =new Question(4,"What is the size of double ?","2","4","8","1","8");
       questions[4] =new Question(5,"What is the size of char ?","2","4","8","1","2");

   }

   public void playQuiz(){
       for(int i=0; i< questions.length; i++){

           System.out.println("Question : " + questions[i].getId());
           System.out.println(  questions[i].getQueston());

           System.out.println(questions[i].getOption1());
           System.out.println(questions[i].getOption2());
           System.out.println(questions[i].getOption3());
           System.out.println(questions[i].getOption4());

           Scanner scanner = new Scanner(System.in);
           userProvidedAns[i] = scanner.next();

       }
   }

   public void printFinalScore(){

       int correctAnswers = 0;
       for (int i=0; i< userProvidedAns.length; i++){
           if(questions[i].getAnswer().equals(userProvidedAns[i])){
               correctAnswers++;
           }
       }
       int incorrectAnswers = questions.length - correctAnswers;

       double percentage = (correctAnswers*100)/questions.length;

       System.out.println("Correct Answers ; "+correctAnswers);
       System.out.println("InCorrect Answers ; "+incorrectAnswers);
       System.out.println("Percentage ; "+percentage);
   }

}
