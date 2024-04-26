package com.swing;

import java.awt.event.ActionEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

import static com.swing.Main.*;

public class Functions {
    static String rutxt = "";
    static String entxt = "";
    static RandomTranslate randomTranslate = new RandomTranslate();

    public static int[] random6(int masLenght) {//функция получает количество элементов и рандомно возвращает массив
        //из шести из них

        int[] random_FromBase = new int[6];
        int k = 0;
        random_FromBase[0] = (int) (Math.random() * masLenght);
        do {
            k = (int) (Math.random() * masLenght);
        }
        while (k == random_FromBase[0]);
        random_FromBase[1] = k;
        do {
            k = (int) (Math.random() * masLenght);
        }
        while (k == random_FromBase[0] || k == random_FromBase[1]);
        random_FromBase[2] = k;
        do {
            k = (int) (Math.random() * masLenght);
        }
        while (k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2]);
        random_FromBase[3] = k;
        do {
            k = (int) (Math.random() * masLenght);
        }
        while (k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2] || k == random_FromBase[3]);
        random_FromBase[4] = k;
        do {
            k = (int) (Math.random() * masLenght);
        }
        while (k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2] || k == random_FromBase[3] ||
                k == random_FromBase[4]);
        random_FromBase[5] = k;
        return random_FromBase;
    }

    public String encrypt(int dataResult) {
        String quantityOfAnswersStr = String.valueOf((dataResult));
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeText = encoder.encodeToString(quantityOfAnswersStr.getBytes(StandardCharsets.UTF_8));
        return encodeText;
    }

    public int decrypt(String encrypted) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encode = decoder.decode(encrypted);
        String byteToString = (new String(encode));
        int decripted = Integer.parseInt(byteToString);
        return decripted;
    }

    public static void clickSecondButtonRight() {
        quantityOfAnswers++;
        if (quantityOfAnswers == 6) {
            quantityOfRightAnswers++;
            setIqStatus();
            setProgressStatus();
            FileDB.setQuantityOfAnswersIntoBase(quantityOfRightAnswers);
            quantityOfAnswers = 0;
            MainWindow.setlabelQuantityOrAnswersResult(quantityOfRightAnswers);
        }
    }
//    }

    public static void clickSecondButtonWrong(int numOfErrorsWord) {
        errorWord1 = rusWordArray[numOfErrorsWord];
        errorWord2 = enWordArray[numOfErrorsWord];
        errors++;
        setIqStatus();
        FileDB.setQuantityOfErrorsIntoBase(errors);
        MainWindow.setlabelerrorsAnswer(errors);
        quantityOfAnswers = 0;
        SetButtons.setAllButtons();
        summa = 0;
        setSharikBalbes();
    }

    public static void setIqStatus() {
        float allAnswers = quantityOfRightAnswers + errors;
        float quantityPercentsInOneAnswer = (100 / allAnswers) / 100;
        float setInPb = quantityPercentsInOneAnswer * quantityOfRightAnswers;
        percentRightAnswer = setInPb * 100;
        MainWindow.setlabelIntellectLevelResult((int) percentRightAnswer);
        MainWindow.setintellectProgressBar((int) percentRightAnswer);
    }

    public static void setProgressStatus() {
        float setInProgressStatusPb = (float) ((100.0 / staerForNewLevel) * quantityOfRightAnswers);
        MainWindow.setprogressOfrunningBar((int) setInProgressStatusPb);
        MainWindow.setlabelProgressResult((int) (setInProgressStatusPb));
    }

    public static void clearAll() {

        quantityOfRightAnswers = 0;
        errors = 0;
        FileDB.setQuantityOfAnswersIntoBase(quantityOfRightAnswers);
        FileDB.setQuantityOfErrorsIntoBase(errors);
        MainWindow.setlabelQuantityOrAnswersResult(quantityOfRightAnswers);
        MainWindow.setlabelerrorsAnswer(errors);
        setIqStatus();
        setProgressStatus();
        summa = 0;
        quantityOfclick = 0;
    }

    public static void ifAll12ClickRirht() {

        MainWindow.setrusWorsSetField("");
        MainWindow.setenWorsSetField("");

        if ((quantityOfRightAnswers >= staerForNewLevel) &&
                (percentRightAnswer >= percentForNewLevelStaer)) {
            clearAll();
            levelValueInt++;
            FileDB.setLevelIntoBase(levelValueInt);
            MainWindow.setlabelLevelValueResult(levelValueInt);
            setPictureLevelUp();
        } else {
            summa = 0;
            quantityOfclick = 0;
            setPictureAllCorrect();
        }
        SetButtons.setAllButtons();
        MainWindow.setRusTextFieldRandomVisible(true);
        MainWindow.setEnTextFieldRandomVisible(true);
        MainWindow.setRusTextFieldRandomTranslateVisible(false);
        MainWindow.setEnTextFieldRandomTranslateVisible(false);
    }

    public static void setPictureLevelUp() {
        Thread levUp = new Thread(new Runnable() {
            @Override
            public void run() {
                MainWindow.setlevelUp();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MainWindow.setlevelUpUnvisible();
            }
        });
        levUp.start();
    }

    public static void setPictureAllCorrect() {
        Thread mose = new Thread(new Runnable() {
            @Override
            public void run() {
                MainWindow.setMouse();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MainWindow.setMouseUnvisible();
            }
        });
        mose.start();
    }

    public static void setSharikBalbes() {
        Thread shar = new Thread(new Runnable() {
            @Override
            public void run() {
                MainWindow.setSharik();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MainWindow.setSharikUnvisible();
            }
        });
        shar.start();
    }

    public static void checkForTranslate(){
        rutxt = MainWindow.getrusWorsSetField().toUpperCase();
        entxt = MainWindow.getenWorsSetField().toUpperCase();
        if (rutxt.length() <= 16 && entxt.length() <= 16 && rutxt.length() != 0 && entxt.length() != 0) {
            setInToDB();
        }
        else if (rutxt.length() != 0 || entxt.length() != 0) {
            translate();
        }
    }

    public static void setInToDB() {

        Main.rusArray.clear();
        Main.enArray.clear();
            rustext = rutxt;
            entext = entxt;
            FileDB.setTextIntoBase(quantityOfWords, entext, rustext, allWordArray);
            MainWindow.setrusWorsSetField("");
            MainWindow.setenWorsSetField("");
            quantityOfWords = FileDB.getQuantityOfWords();
            allWordArray = FileDB.readAllFromFile(quantityOfWords);
            rusWordArray = FileDB.getRusWords(allWordArray);
            enWordArray = FileDB.getEnWords(allWordArray);
            MainWindow.setlabelQuantityOrWordsInDictionaryResult(quantityOfWords);
    }

    public static void translate(){

        rusArray.clear();
        enArray.clear();
//        System.out.println("значения не нулевые");
//        System.out.println("количество слов в базе: " + quantityOfWords);
        Boolean isThereTranslateRus = false;
        Boolean isThereTranslateEn = false;
        for (int i = 0; i < quantityOfWords; i++) {
            String searshingWord = allWordArray[i];
            isThereTranslateRus = false;
            isThereTranslateEn = false;
            if (!rutxt.equals("")) {
                isThereTranslateRus = searshingWord.contains(rutxt);
            }
            if (!entxt.equals("")) {
                isThereTranslateEn = searshingWord.contains(entxt);
            }
            if (isThereTranslateRus == true || isThereTranslateEn == true) {
//                System.out.println("найдено совпадение " + rusWordArray[i] + " " + enWordArray[i]);
                rusArray.add(rusWordArray[i]);
                enArray.add(enWordArray[i]);
            }
        }
        isTranslate = false;
        forTranslateCycle = 0;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        isTranslate = true;
        MainWindow.setEnTextFieldRandomVisible(false);
        MainWindow.setRusTextFieldRandomVisible(false);
        MainWindow.setRusTextFieldRandomTranslateVisible(true);
        MainWindow.setEnTextFieldRandomTranslateVisible(true);
//        System.out.println("русских совпадений: " + rusArray.size());
//        System.out.println("английских совпадений: " + enArray.size());
        if (rusArray.size() == 0 || enArray.size() == 0) {

//            System.out.println("совпадений не найдено");
            isTranslate = false;
            forTranslateCycle = 0;
            rusArray.add("СОВПАДЕНИЙ");
            enArray.add("НЕ НАЙДЕНО");
            rusArray.add("NO MATCHES");
            enArray.add("FOUND");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            isTranslate = true;
            MainWindow.setEnTextFieldRandomVisible(false);
            MainWindow.setRusTextFieldRandomVisible(false);
            MainWindow.setRusTextFieldRandomTranslateVisible(true);
            MainWindow.setEnTextFieldRandomTranslateVisible(true);
        }

//        System.out.println("размер русского массива: " + rusArray.size());
//        System.out.println("размер английского массива: " + enArray.size());
    }
}

