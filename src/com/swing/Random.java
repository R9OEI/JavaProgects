package com.swing;

public class Random {
    public static void randomVisionFunction(){
        Thread randomVision = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int numOfWord = (int) (Math.random() * (Main.quantityOfWords));
                    MainWindow.setEnTextFieldRandom(Main.enWordArray[numOfWord]);
                    MainWindow.setRusTextFieldRandom(Main.rusWordArray[numOfWord]);
//                    System.out.println("Случайный выбор: " + numOfWord);
                }
            }
        });
        randomVision.start();
    }
}
