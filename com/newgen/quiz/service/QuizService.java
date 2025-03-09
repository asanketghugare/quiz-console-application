package com.newgen.quiz.service;

import com.newgen.quiz.model.Question;

import java.util.Scanner;

public class QuizService {

    private String []userProvidedAns = new String[5];
    private Question[] questions;

    public QuizService() {
        QuestionService questionService = new QuestionService();
        questions = questionService.getAllQuestions();
    }


    public void playQuiz(){
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< questions.length; i++){


            System.out.println("Question : " + questions[i].getId());
            System.out.println(  questions[i].getQueston());

            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());

            userProvidedAns[i] = scanner.next();

        }
        scanner.close();
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
