package com.swing;

import static com.swing.Main.enArray;
import static com.swing.Main.rusArray;

public class RandomTranslate extends Thread {
    @Override
    public void run() {
        while (true) {
            if(Main.isTranslate) {
                if(Main.rusArray.size() != 0){
                for (Main.forTranslateCycle = 0; Main.forTranslateCycle < Main.rusArray.size(); Main.forTranslateCycle++) {
//                    System.out.println("Размер цикла: " + Main.rusArray.size() + " итерация " + Main.forTranslateCycle);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(Main.rusArray.size() != 0) {
                        MainWindow.setEnTextFieldRandomTranslate((String) Main.enArray.get(Main.forTranslateCycle));
                        MainWindow.setRusTextFieldRandomTranslate((String) Main.rusArray.get(Main.forTranslateCycle));
                    }
                    else {
//                        System.out.println("Неуловимая ошибка длины массива");
                        Main.forTranslateCycle = 0;
                        rusArray.add("УСПЕШНО");
                        enArray.add("ДОБАВЛЕНО");
                        rusArray.add("ADDED");
                        enArray.add("SUCCESSFULLY");
                    }
                }
                }
            }
            else{
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

