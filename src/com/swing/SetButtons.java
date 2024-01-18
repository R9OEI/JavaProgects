package com.swing;

public class SetButtons {

    public static void setAllButtons(){

        Main.sixDigitsFromArraysOfWords = Functions.random6(Main.quantityOfWords);
//        System.out.println(Main.sixDigitsFromArraysOfWords[0]);
//        System.out.println(Main.sixDigitsFromArraysOfWords[1]);
//        System.out.println(Main.sixDigitsFromArraysOfWords[2]);
//        System.out.println(Main.sixDigitsFromArraysOfWords[3]);
//        System.out.println(Main.sixDigitsFromArraysOfWords[4]);
//        System.out.println(Main.sixDigitsFromArraysOfWords[5]);
        MainWindow.setTextBtnRus1(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[0]]);
        Main.idBtnRus1 = Main.sixDigitsFromArraysOfWords[0];
        MainWindow.setTextBtnRus2(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[1]]);
        Main.idBtnRus2 = Main.sixDigitsFromArraysOfWords[1];
        MainWindow.setTextBtnRus3(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[2]]);
        Main.idBtnRus3 = Main.sixDigitsFromArraysOfWords[2];
        MainWindow.setTextBtnRus4(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[3]]);
        Main.idBtnRus4 = Main.sixDigitsFromArraysOfWords[3];
        MainWindow.setTextBtnRus5(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[4]]);
        Main.idBtnRus5 = Main.sixDigitsFromArraysOfWords[4];
        MainWindow.setTextBtnRus6(Main.rusWordArray[Main.sixDigitsFromArraysOfWords[5]]);
        Main.idBtnRus6 = Main.sixDigitsFromArraysOfWords[5];

        int randomEn = (int) (Math.random() * 6);
        MainWindow.setTextBtnEn1(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn1 = Main.sixDigitsFromArraysOfWords[randomEn];

        do {
            randomEn = (int) (Math.random() * 6);
        }
        while ((Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn1);
        MainWindow.setTextBtnEn2(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn2 = Main.sixDigitsFromArraysOfWords[randomEn];

        do {
            randomEn = (int) (Math.random() * 6);
        }
        while ((Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn1 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn2);
        MainWindow.setTextBtnEn3(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn3 = Main.sixDigitsFromArraysOfWords[randomEn];

        do {
            randomEn = (int) (Math.random() * 6);
        }
        while ((Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn1 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn2 ||
                (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn3);
        MainWindow.setTextBtnEn4(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn4 = Main.sixDigitsFromArraysOfWords[randomEn];

        do {
            randomEn = (int) (Math.random() * 6);
        }
        while ((Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn1 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn2 ||
                (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn3 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn4);
        MainWindow.setTextBtnEn5(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn5 = Main.sixDigitsFromArraysOfWords[randomEn];

        do {
            randomEn = (int) (Math.random() * 6);
        }
        while ((Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn1 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn2 ||
                (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn3 || (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn4 ||
                (Main.sixDigitsFromArraysOfWords[randomEn]) == Main.idBtnEn5);
        MainWindow.setTextBtnEn6(Main.enWordArray[Main.sixDigitsFromArraysOfWords[randomEn]]);
        Main.idBtnEn6 =Main.sixDigitsFromArraysOfWords[randomEn];

        MainWindow.setBtnRus1ColorYellow();
        MainWindow.setBtnRus2ColorYellow();
        MainWindow.setBtnRus3ColorYellow();
        MainWindow.setBtnRus4ColorYellow();
        MainWindow.setBtnRus5ColorYellow();
        MainWindow.setBtnRus6ColorYellow();
        MainWindow.setBtnRus1ColorYellow();
        MainWindow.setBtnEn1ColorYellow();
        MainWindow.setBtnEn2ColorYellow();
        MainWindow.setBtnEn3ColorYellow();
        MainWindow.setBtnEn4ColorYellow();
        MainWindow.setBtnEn5ColorYellow();
        MainWindow.setBtnEn6ColorYellow();
    }
}
