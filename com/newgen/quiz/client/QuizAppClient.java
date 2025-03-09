package com.newgen.quiz.client;

import com.newgen.quiz.service.QuizService;

public class QuizAppClient {

    public static void main(String[] args) {

        QuizService quizService = new QuizService();
        quizService.playQuiz();
        quizService.printFinalScore();
    }
}
