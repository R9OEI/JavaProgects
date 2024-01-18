package com.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    static int quantityOfWords = 0;//количество слов в базе
    static int quantityOfWordsForRandom = 0;
    static String rustext = "";
    static String entext = "";
    static int[] sixDigitsFromArraysOfWords = null;
    static int quantityOfRightAnswers = 0;//количество правильных ответов
    static int quantityOfclick = 0;//количество кликов
    static int click1 = 0;
    static int click2 = 0;
    static int summa = 0;//количество любых нажатий
    static int quantityOfAnswers = 0;//количество ответов
    static int errors = 0;//количество ошибок
    static String[] allWordArray = new String[0];
    static String[] rusWordArray = new String[0];
    static String[] enWordArray = new String[0];
    static String[] rusWordArrayForRandom = new String[0];
    static String[] enWordArrayForRandom = new String[0];
    static int levelValueInt = 5;//уровень
    static float percentRightAnswer = 0f;
    static int staerForNewLevel = 45;
    static int percentForNewLevelStaer = 93;
    static String errorWord1 = "";
    static String errorWord2 = "";

    static int idBtnEn1 = 0;
    static int idBtnEn2 = 0;
    static int idBtnEn3 = 0;
    static int idBtnEn4 = 0;
    static int idBtnEn5 = 0;
    static int idBtnEn6 = 0;
    static int idBtnRus1 = 0;
    static int idBtnRus2 = 0;
    static int idBtnRus3 = 0;
    static int idBtnRus4 = 0;
    static int idBtnRus5 = 0;
    static int idBtnRus6 = 0;

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        Functions functions = new Functions();
        FileDB fileDb = new FileDB();

        quantityOfWords = fileDb.getQuantityOfWords();//
        quantityOfRightAnswers = fileDb.getQuantityOfAnswersFromBase();
        errors = fileDb.getQuantityOfErrorsFromBase();
        levelValueInt = fileDb.getLevelFromBase();
        allWordArray = fileDb.readAllFromFile(quantityOfWords);
        rusWordArray = fileDb.getRusWords(allWordArray);
        enWordArray = fileDb.getEnWords(allWordArray);
        MainWindow. setlabelQuantityOrAnswersResult(quantityOfRightAnswers);//установить количество ответов
        MainWindow.setlabelerrorsAnswer(errors);//установить количество ошибок
        Functions.setIqStatus();//установить статус знаний
        rusWordArrayForRandom = fileDb.getRusWords(allWordArray);
        enWordArrayForRandom = fileDb.getEnWords(allWordArray);
        quantityOfWordsForRandom = fileDb.getQuantityOfWords();
        Random.randomVisionFunction();//запуск рандомного вывода слов
        MainWindow.setlabelQuantityOrWordsInDictionaryResult(quantityOfWords);//установить количество слов в лэйбл
        MainWindow.setlabelLevelValueResult(levelValueInt);//установить левел
        SetButtons.setAllButtons();
        Functions.setProgressStatus();
    }
        }
