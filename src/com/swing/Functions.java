package com.swing;

import java.awt.event.ActionEvent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static com.swing.Main.*;
import static com.swing.Main.quantityOfclick;

public class Functions {
    public static int[] random6(int masLenght){//функция получает количество элементов и рандомно возвращает массив
        //из шести из них

        int[] random_FromBase = new int [6];
        int k = 0;
        random_FromBase[0] = (int) (Math.random() * masLenght);
        do{
            k = (int) (Math.random() * masLenght);
        }
        while(k == random_FromBase[0]);
        random_FromBase[1] = k;
        do{
            k = (int) (Math.random() * masLenght);
        }
        while(k == random_FromBase[0] || k == random_FromBase[1]);
        random_FromBase[2] = k;
        do{
            k = (int) (Math.random() * masLenght);
        }
        while(k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2]);
        random_FromBase[3] = k;
        do{
            k = (int) (Math.random() * masLenght);
        }
        while(k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2] || k == random_FromBase[3]);
        random_FromBase[4] = k;
        do{
            k = (int) (Math.random() * masLenght);
        }
        while(k == random_FromBase[0] || k == random_FromBase[1] ||
                k == random_FromBase[2] || k == random_FromBase[3] ||
                k == random_FromBase[4]);
        random_FromBase[5] = k;
        return random_FromBase;
    }

    public String encrypt(int dataResult){
        String quantityOfAnswersStr = String.valueOf((dataResult));
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeText = encoder.encodeToString(quantityOfAnswersStr.getBytes(StandardCharsets.UTF_8));
        return encodeText;
    }

    public int decrypt(String encrypted){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encode = decoder.decode(encrypted);
        String byteToString = (new String(encode));
        int decripted = Integer.parseInt(byteToString);
        return decripted;
    }

    public static void clickSecondButtonRight(){
        quantityOfAnswers++;
        if(quantityOfAnswers == 6) {
            quantityOfRightAnswers++;
            setIqStatus();
            setProgressStatus();
            FileDB.setQuantityOfAnswersIntoBase(quantityOfRightAnswers);
            quantityOfAnswers = 0;
            MainWindow.setlabelQuantityOrAnswersResult(quantityOfRightAnswers);
            }
        }
//    }

    public static void clickSecondButtonWrong(int numOfErrorsWord){
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

    public static void setIqStatus(){
        float allAnswers = quantityOfRightAnswers + errors;
        float quantityPercentsInOneAnswer = (100 / allAnswers) / 100;
        float setInPb = quantityPercentsInOneAnswer * quantityOfRightAnswers;
        percentRightAnswer = setInPb * 100;
        MainWindow.setlabelIntellectLevelResult((int) percentRightAnswer);
        MainWindow.setintellectProgressBar((int) percentRightAnswer);
    }

    public static void setProgressStatus(){
        float setInProgressStatusPb = (float) ((100.0 / staerForNewLevel) * quantityOfRightAnswers);
            MainWindow.setprogressOfrunningBar((int) setInProgressStatusPb);
            MainWindow.setlabelProgressResult((int) (setInProgressStatusPb));
    }

    public static void clearAll (){

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

    public static void ifAll12ClickRirht(){

        if((quantityOfRightAnswers >= staerForNewLevel) &&
                (percentRightAnswer >= percentForNewLevelStaer)) {
            clearAll();
            levelValueInt++;
            FileDB.setLevelIntoBase(levelValueInt);
            MainWindow.setlabelLevelValueResult(levelValueInt);
            setPictureLevelUp();
        }
        else {
            summa = 0;
            quantityOfclick = 0;
            setPictureAllCorrect();
        }
        SetButtons.setAllButtons();
    }

    public static void setPictureLevelUp(){
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

    public static void setPictureAllCorrect(){
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

    public static void setSharikBalbes(){
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

    public static void setInToDB() {
        String rutxt = "";
        String entxt = "";
        rutxt = MainWindow.getrusWorsSetField().toUpperCase();
        entxt = MainWindow.getenWorsSetField().toUpperCase();
        if(rutxt.length() <= 16 && entxt.length() <= 16 && rutxt.length() != 0 && entxt.length() != 0) {
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
        else {
            MainWindow.setrusWorsSetField("ОШИБКА ДЛИНЫ СТРОКИ");
            MainWindow.setenWorsSetField("ДОПУСТИМО МИН 1, МАКС 16");
        }
    }
}
