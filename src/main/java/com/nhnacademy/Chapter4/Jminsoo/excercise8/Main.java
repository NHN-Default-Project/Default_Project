package com.nhnacademy.Chapter4.Jminsoo.excercise8;

public class Main {
    public static void main(String[] args) {
        AddtionQuiz addtionQuiz = new AddtionQuiz(10);

        addtionQuiz.quizGenerate();
        addtionQuiz.quizControl();

        addtionQuiz.quizGrading();
    }
}
