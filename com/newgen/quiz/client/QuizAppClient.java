package com.newgen.quiz.client;

import com.newgen.quiz.service.QuestionService;

public class QuizAppClient {

    public static void main(String[] args) {

        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printFinalScore();
    }
}
