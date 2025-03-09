package com.newgen.quiz.service;

import com.newgen.quiz.model.Question;


public class QuestionService {

   Question [] questions = new Question[5];

   public QuestionService(){

       questions[0] =new Question(1,"What is the size of short ?","2","4","8","1","2");
       questions[1] =new Question(2,"What is the size of int ?","2","4","8","1","4");
       questions[2] =new Question(3,"What is the size of float ?","2","4","8","1","4");
       questions[3] =new Question(4,"What is the size of double ?","2","4","8","1","8");
       questions[4] =new Question(5,"What is the size of char ?","2","4","8","1","2");

   }

   public String addQuestion(Question question){
       return "question added succedfully";
   }
    public String updateQuestion(Question question){
        return "question updated succedfully";
    }
    public String deleteQustion(Question question){
        return "question deleted succedfully";
    }
    public Question[] getAllQuestions(){
        return questions;
    }

}
