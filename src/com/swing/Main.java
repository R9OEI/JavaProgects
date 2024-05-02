package com.swing;

import java.util.ArrayList;

public class Main {
    static int forTranslateCycle = 0;
    static ArrayList<String> rusArray = new ArrayList<>();
    static ArrayList <String> enArray = new ArrayList<>();
//    static Boolean isRandom = true;
    static Boolean isTranslate = false;
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
//        FileDB fileDb = new FileDB();

        quantityOfWords = FileDB.getQuantityOfWords();//
        quantityOfRightAnswers = FileDB.getQuantityOfAnswersFromBase();
        errors = FileDB.getQuantityOfErrorsFromBase();
        levelValueInt = FileDB.getLevelFromBase();
        allWordArray = FileDB.readAllFromFile(quantityOfWords);
        rusWordArray = FileDB.getRusWords(allWordArray);
        enWordArray = FileDB.getEnWords(allWordArray);
        MainWindow. setlabelQuantityOrAnswersResult(quantityOfRightAnswers);//установить количество ответов
        MainWindow.setlabelerrorsAnswer(errors);//установить количество ошибок
        Functions.setIqStatus();//установить статус знаний
        rusWordArrayForRandom = FileDB.getRusWords(allWordArray);
        enWordArrayForRandom = FileDB.getEnWords(allWordArray);
        quantityOfWordsForRandom = FileDB.getQuantityOfWords();
        Random.randomVisionFunction();//запуск рандомного вывода слов
        RandomTranslate randomTranslate = new RandomTranslate();
        randomTranslate.start();//запуск рандомного вывода перевода
        MainWindow.setlabelQuantityOrWordsInDictionaryResult(quantityOfWords);//установить количество слов в лэйбл
        MainWindow.setlabelLevelValueResult(levelValueInt);//установить левел
        SetButtons.setAllButtons();
        Functions.setProgressStatus();
//        EnableChatWindow enableChatWindow = new EnableChatWindow(false);
//        RandomVisionClass randomVision = new RandomVisionClass();
//        Thread randomVisionThread = new Thread(randomVision);
//        randomVisionThread.start();
//        randomVisionThread.interrupt();
    }
        }
