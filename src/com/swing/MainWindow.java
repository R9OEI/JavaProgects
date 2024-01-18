package com.swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import static com.swing.Main.*;

public class MainWindow extends JFrame {

     private static Color yelloyButtons = new Color(252, 215, 3);
     private Color RandomButtons = new Color(192, 192, 192);
     private Font font = new Font("TimeNewRoman", Font.BOLD, 14);
     private Font fontRandomText = new Font("TimeNewRoman", Font.BOLD, 28);
     private Font fontBtnDictionary = new Font("TimeNewRoman", Font.BOLD, 12);
     private Font levelHead = new Font("TimeNewRoman", Font.BOLD, 20);
     private static Font labelLevelValueBig = new Font("TimeNewRoman", Font.BOLD, 96);
     private static JLabel labelQuantityOrWordsInDictionaryResult = new JLabel();//количество слов в базе
     private static JLabel labelQuantityOrAnswersResult = new JLabel();//количество ответов
     private static JLabel labelerrorsAnswer = new JLabel();//количество ошибок
     private static JProgressBar intellectProgressBar = new JProgressBar();//уровень правильных ответов
     private static JLabel labelIntellectLevelResult = new JLabel();//уровень правильных ответов в цифровом виде
     private static JProgressBar progressOfrunningBar = new JProgressBar();//прогресс выполнения
     private static JLabel labelProgressResult = new JLabel();//прогресс выполнения в цифровом виде
     private static JLabel labelLevelValueResult = new JLabel();//ступень прохождения
     private static JTextField rusWorsSetField = new JTextField();//поле ввода русских слов
     private static JTextField enWorsSetField = new JTextField();//поле ввода английских слов
     private static JTextField EnTextFieldRandom = new JTextField();
     private static JTextField RusTextFieldRandom = new JTextField();
     private static JButton BtnRus1 = new JButton();
     private static JButton BtnRus2 = new JButton();
     private static JButton BtnRus3 = new JButton();
     private static JButton BtnRus4 = new JButton();
     private static JButton BtnRus5 = new JButton();
     private static JButton BtnRus6 = new JButton();
     private static JButton BtnEn1 = new JButton();
     private static JButton BtnEn2 = new JButton();
     private static JButton BtnEn3 = new JButton();
     private static JButton BtnEn4 = new JButton();
     private static JButton BtnEn5 = new JButton();
     private static JButton BtnEn6 = new JButton();
     private static JLabel sharik = new JLabel();
     private static JLabel mouse = new JLabel();
     private static JLabel levelUp = new JLabel();



     public MainWindow() {//конструктор класса
         super("Английская зубрилка v.2.0");
         super.setBounds(100, 100, 650, 510);
         super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         super.setResizable(false);
         super.setLocationRelativeTo(null);
         try {
             super.setContentPane(new JLabel((new ImageIcon(ImageIO.read(new File("fon1.jpg"))))));
         } catch (IOException e) {
             e.printStackTrace();
         }
         Container container = super.getContentPane();
         container.setLayout(null);

         JLabel sharik = null;
         try {
             sharik = new JLabel(new ImageIcon(ImageIO.read(new File("sharikBalbes.jpg"))));
             sharik.setBounds(0, 0, 640, 480);
             sharik.setVisible(false);
         } catch (IOException e) {
             e.printStackTrace();
         }
         JLabel mouse = null;
         try {
             mouse = new JLabel(new ImageIcon(ImageIO.read(new File("allCorrect.jpg"))));
             mouse.setBounds(0, 0, 640, 480);
             mouse.setVisible(false);
         } catch (IOException e) {
             e.printStackTrace();
         }
         JLabel levelUp = null;
         try {
             levelUp = new JLabel(new ImageIcon(ImageIO.read(new File("levelUp.jpg"))));
             levelUp.setBounds(0, 0, 640, 480);
             levelUp.setVisible(false);
         } catch (IOException e) {
             e.printStackTrace();
         }


         JButton BtnRus1 = new JButton("BtnRus1");
         BtnRus1.setBackground(yelloyButtons);
         BtnRus1.setBounds(14, 14, 188, 37);
         BtnRus1.setFont(font);
         JButton BtnRus2 = new JButton("BtnRus2");
         BtnRus2.setBackground(yelloyButtons);
         BtnRus2.setBounds(14, 58, 188, 37);
         BtnRus2.setFont(font);
         JButton BtnRus3 = new JButton("BtnRus3");
         BtnRus3.setBackground(yelloyButtons);
         BtnRus3.setBounds(14, 102, 188, 37);
         BtnRus3.setFont(font);
         JButton BtnRus4 = new JButton("BtnRus4");
         BtnRus4.setBackground(yelloyButtons);
         BtnRus4.setBounds(14, 146, 188, 37);
         BtnRus4.setFont(font);
         JButton BtnRus5 = new JButton("BtnRus5");
         BtnRus5.setBackground(yelloyButtons);
         BtnRus5.setBounds(14, 190, 188, 37);
         BtnRus5.setFont(font);
         JButton BtnRus6 = new JButton("BtnRus6");
         BtnRus6.setBackground(yelloyButtons);
         BtnRus6.setBounds(14, 234, 188, 37);
         BtnRus6.setFont(font);
         JButton BtnEn1 = new JButton("BtnEn1");
         BtnEn1.setBackground(yelloyButtons);
         BtnEn1.setBounds(229, 14, 188, 37);
         BtnEn1.setFont(font);
         JButton BtnEn2 = new JButton("BtnEn2");
         BtnEn2.setBackground(yelloyButtons);
         BtnEn2.setBounds(229, 58, 188, 37);
         BtnEn2.setFont(font);
         JButton BtnEn3 = new JButton("BtnEn3");
         BtnEn3.setBackground(yelloyButtons);
         BtnEn3.setBounds(229, 102, 188, 37);
         BtnEn3.setFont(font);
         JButton BtnEn4 = new JButton("BtnEn4");
         BtnEn4.setBackground(yelloyButtons);
         BtnEn4.setBounds(229, 146, 188, 37);
         BtnEn4.setFont(font);
         JButton BtnEn5 = new JButton("BtnEn5");
         BtnEn5.setBackground(yelloyButtons);
         BtnEn5.setBounds(229, 190, 188, 37);
         BtnEn5.setFont(font);
         JButton BtnEn6 = new JButton("BtnEn6");
         BtnEn6.setBackground(yelloyButtons);
         BtnEn6.setBounds(229, 234, 188, 37);
         BtnEn6.setFont(font);
         JTextField EnTextFieldRandom = new JTextField("R9OEI");
         EnTextFieldRandom.setBackground(RandomButtons);
         EnTextFieldRandom.setBounds(11, 347, 407, 57);
         EnTextFieldRandom.setFont(fontRandomText);
         EnTextFieldRandom.setHorizontalAlignment(JTextField.CENTER);
         JTextField RusTextFieldRandom = new JTextField("901442");
         RusTextFieldRandom.setBackground(RandomButtons);
         RusTextFieldRandom.setBounds(11, 282, 407, 57);
         RusTextFieldRandom.setFont(fontRandomText);
         RusTextFieldRandom.setHorizontalAlignment(JTextField.CENTER);
         JLabel labelQuantityOrWordsInDictionary = new JLabel("Словарный запас:");
         labelQuantityOrWordsInDictionary.setBounds(437, 18, 114, 14);
         JLabel labelQuantityOrWordsInDictionaryResult = new JLabel("0");
         labelQuantityOrWordsInDictionaryResult.setBounds(573, 18, 114, 14);
         JLabel labelQuantityOrAnswers = new JLabel("Зачётов:");
         labelQuantityOrAnswers.setBounds(437, 40, 114, 14);
         JLabel labelQuantityOrAnswersResult = new JLabel("0");
         labelQuantityOrAnswersResult.setBounds(573, 40, 114, 14);
         JLabel labelerrors = new JLabel("Ошибок:");
         labelerrors.setBounds(437, 62, 114, 14);
         JLabel labelerrorsAnswer = new JLabel("0");
         labelerrorsAnswer.setBounds(573, 62, 63, 14);
         JProgressBar intellectProgressBar = new JProgressBar();
         intellectProgressBar.setBounds(438, 89, 182, 23);
         intellectProgressBar.setMinimum(0);
         intellectProgressBar.setMaximum(100);
         intellectProgressBar.setValue(30);
         JLabel labelIntellectLevel = new JLabel("Интеллект:");
         labelIntellectLevel.setBounds(439, 121, 114, 14);
         JLabel labelIntellectLevelResult = new JLabel("0");
         labelIntellectLevelResult.setBounds(573, 121, 63, 14);
         JProgressBar progressOfrunningBar = new JProgressBar();
         progressOfrunningBar.setBounds(438, 153, 182, 23);
         progressOfrunningBar.setMinimum(0);
         progressOfrunningBar.setMaximum(100);
         progressOfrunningBar.setValue(30);
         JLabel labelProgress = new JLabel("Прохождение:");
         labelProgress.setBounds(437, 192, 114, 14);
         JLabel labelProgressResult = new JLabel("0");
         labelProgressResult.setBounds(573, 192, 63, 14);
         JLabel labelLevelValue = new JLabel("LEVEL:");
         labelLevelValue.setBounds(496, 238, 114, 14);
         labelLevelValue.setFont(levelHead);
         labelLevelValue.setForeground(Color.RED);
         JLabel labelLevelValueResult = new JLabel("0", SwingConstants.CENTER);
         labelLevelValueResult.setBounds(435, 253, 194, 143);
         labelLevelValueResult.setFont(labelLevelValueBig);
         labelLevelValueResult.setForeground(Color.RED);
         JLabel labelRussianWord = new JLabel("Русское слово:");
         labelRussianWord.setBounds(14, 417, 188, 14);
         labelRussianWord.setForeground(Color.RED);
         JLabel labelEnglishWord = new JLabel("Английский перевод:");
         labelEnglishWord.setBounds(226, 417, 188, 14);
         labelEnglishWord.setForeground(Color.RED);
         JTextField rusWorsSetField = new JTextField();
         rusWorsSetField.setBounds(14, 444, 188, 22);
         JTextField enWorsSetField = new JTextField();
         enWorsSetField.setBounds(226, 444, 188, 22);
         JButton setIntoDbBtn = new JButton("Добавить в словарь");
         setIntoDbBtn.setFont(fontBtnDictionary);
         setIntoDbBtn.setBounds(440, 444, 182, 22);

         super.add(sharik);
         super.add(mouse);
         super.add(levelUp);
         super.add(BtnRus1);
         super.add(BtnRus2);
         super.add(BtnRus3);
         super.add(BtnRus4);
         super.add(BtnRus5);
         super.add(BtnRus6);
         super.add(BtnEn1);
         super.add(BtnEn2);
         super.add(BtnEn3);
         super.add(BtnEn4);
         super.add(BtnEn5);
         super.add(BtnEn6);
         super.add(EnTextFieldRandom);
         super.add(RusTextFieldRandom);
         super.add(setIntoDbBtn);
         super.add(labelQuantityOrWordsInDictionary);
         super.add(labelQuantityOrWordsInDictionaryResult);
         super.add(labelQuantityOrAnswers);
         super.add(labelQuantityOrAnswersResult);
         super.add(labelerrors);
         super.add(labelerrorsAnswer);
         super.add(intellectProgressBar);
         super.add(labelIntellectLevel);
         super.add(labelIntellectLevelResult);
         super.add(progressOfrunningBar);
         super.add(labelProgress);
         super.add(labelProgressResult);
         super.add(labelLevelValue);
         super.add(labelLevelValueResult);
         super.add(labelRussianWord);
         super.add(labelEnglishWord);
         super.add(rusWorsSetField);
         super.add(enWorsSetField);



         this.BtnRus1 = BtnRus1;
         this.BtnRus2 = BtnRus2;
         this.BtnRus3 = BtnRus3;
         this.BtnRus4 = BtnRus4;
         this.BtnRus5 = BtnRus5;
         this.BtnRus6 = BtnRus6;
         this.BtnEn1 = BtnEn1;
         this.BtnEn2 = BtnEn2;
         this.BtnEn3 = BtnEn3;
         this.BtnEn4 = BtnEn4;
         this.BtnEn5 = BtnEn5;
         this.BtnEn6 = BtnEn6;
         this.labelQuantityOrWordsInDictionaryResult = labelQuantityOrWordsInDictionaryResult;
         this.labelQuantityOrAnswersResult = labelQuantityOrAnswersResult;
         this.labelerrorsAnswer = labelerrorsAnswer;
         this.intellectProgressBar = intellectProgressBar;
         this.labelIntellectLevelResult = labelIntellectLevelResult;
         this.progressOfrunningBar = progressOfrunningBar;
         this.labelProgressResult = labelProgressResult;
         this.labelLevelValueResult = labelLevelValueResult;
         this.labelLevelValueBig = labelLevelValueBig;
         this.rusWorsSetField = rusWorsSetField;
         this.enWorsSetField = enWorsSetField;
         this.RusTextFieldRandom = RusTextFieldRandom;
         this.EnTextFieldRandom = EnTextFieldRandom;
         this.sharik = sharik;
         this.mouse = mouse;
         this.levelUp = levelUp;

         BtnRus1.addActionListener(new BtnRus1Pressed());
         BtnRus2.addActionListener(new BtnRus2Pressed());
         BtnRus3.addActionListener(new BtnRus3Pressed());
         BtnRus4.addActionListener(new BtnRus4Pressed());
         BtnRus5.addActionListener(new BtnRus5Pressed());
         BtnRus6.addActionListener(new BtnRus6Pressed());
         BtnEn1.addActionListener(new BtnEn1Pressed());
         BtnEn2.addActionListener(new BtnEn2Pressed());
         BtnEn3.addActionListener(new BtnEn3Pressed());
         BtnEn4.addActionListener(new BtnEn4Pressed());
         BtnEn5.addActionListener(new BtnEn5Pressed());
         BtnEn6.addActionListener(new BtnEn6Pressed());
         setIntoDbBtn.addActionListener(new setIntoDbBtnPressed());
         rusWorsSetField.addKeyListener(new KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {

             }

             @Override
             public void keyPressed(KeyEvent e) {
                 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                     Functions.setInToDB();
                 }
             }

             @Override
             public void keyReleased(KeyEvent e) {

             }
         });

         enWorsSetField.addKeyListener(new KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {

             }

             @Override
             public void keyPressed(KeyEvent e) {
                 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                     Functions.setInToDB();
                 }
             }

             @Override
             public void keyReleased(KeyEvent e) {

             }
         });
     }

     public static void setSharik(){
         sharik.setVisible(true);
         sharik.setOpaque(true);
     }

    public static void setSharikUnvisible(){
        sharik.setVisible(false);
        sharik.setOpaque(false);
    }
    public static void setMouse(){
        mouse.setVisible(true);
        mouse.setOpaque(true);
    }

    public static void setMouseUnvisible(){
        mouse.setVisible(false);
        mouse.setOpaque(false);
    }
    public static void setlevelUp(){
        levelUp.setVisible(true);
        levelUp.setOpaque(true);
    }

    public static void setlevelUpUnvisible(){
        levelUp.setVisible(false);
        levelUp.setOpaque(false);
    }

     public static void setTextBtnRus1(String text) {
         BtnRus1.setText(text);
     }
     public static void setBtnRus1ColorRed() {
         BtnRus1.setBackground(Color.RED);
     }
     public static void setBtnRus1ColorGreen() {
         BtnRus1.setBackground(Color.GREEN);
     }
     public static void setBtnRus1ColorBlue() {
         BtnRus1.setBackground(Color.BLUE);
     }
     public static void setBtnRus1ColorYellow() {
         BtnRus1.setBackground(yelloyButtons);
     }

     public static void setTextBtnRus2(String text) {
         BtnRus2.setText(text);
     }
     public static void setBtnRus2ColorRed() {
         BtnRus2.setBackground(Color.RED);
     }
     public static void setBtnRus2ColorGreen() {
         BtnRus2.setBackground(Color.GREEN);
     }
     public static void setBtnRus2ColorBlue() {
         BtnRus2.setBackground(Color.BLUE);
     }
     public static void setBtnRus2ColorYellow() {
         BtnRus2.setBackground(yelloyButtons);
     }

     public static void setTextBtnRus3(String text) {
         BtnRus3.setText(text);
     }
     public static void setBtnRus3ColorRed() {
         BtnRus3.setBackground(Color.RED);
     }
     public static void setBtnRus3ColorGreen() {
         BtnRus3.setBackground(Color.GREEN);
     }
     public static void setBtnRus3ColorBlue() {
         BtnRus3.setBackground(Color.BLUE);
     }
     public static void setBtnRus3ColorYellow() {
         BtnRus3.setBackground(yelloyButtons);
     }

     public static void setTextBtnRus4(String text) {
         BtnRus4.setText(text);
     }
     public static void setBtnRus4ColorRed() {
         BtnRus4.setBackground(Color.RED);
     }
     public static void setBtnRus4ColorGreen() {
         BtnRus4.setBackground(Color.GREEN);
     }
     public static void setBtnRus4ColorBlue() {
         BtnRus4.setBackground(Color.BLUE);
     }
     public static void setBtnRus4ColorYellow() {
         BtnRus4.setBackground(yelloyButtons);
     }

     public static void setTextBtnRus5(String text) {
         BtnRus5.setText(text);
     }
     public static void setBtnRus5ColorRed() {
         BtnRus5.setBackground(Color.RED);
     }
     public static void setBtnRus5ColorGreen() {
         BtnRus5.setBackground(Color.GREEN);
     }
     public static void setBtnRus5ColorBlue() {
         BtnRus5.setBackground(Color.BLUE);
     }
     public static void setBtnRus5ColorYellow() {
         BtnRus5.setBackground(yelloyButtons);
     }

     public static void setTextBtnRus6(String text) {
         BtnRus6.setText(text);
     }
     public static void setBtnRus6ColorRed() {
         BtnRus6.setBackground(Color.RED);
     }
     public static void setBtnRus6ColorGreen() {
         BtnRus6.setBackground(Color.GREEN);
     }
     public static void setBtnRus6ColorBlue() {
         BtnRus6.setBackground(Color.BLUE);
     }
     public static void setBtnRus6ColorYellow() {
         BtnRus6.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn1(String text) {
         BtnEn1.setText(text);
     }
     public static void setBtnEn1ColorRed() {
         BtnEn1.setBackground(Color.RED);
     }
     public static void setBtnEn1ColorGreen() {
         BtnEn1.setBackground(Color.GREEN);
     }
     public static void setBtnEn1ColorBlue() {
         BtnEn1.setBackground(Color.BLUE);
     }
     public static void setBtnEn1ColorYellow() {
         BtnEn1.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn2(String text) {
         BtnEn2.setText(text);
     }
     public static void setBtnEn2ColorRed() {
         BtnEn2.setBackground(Color.RED);
     }
     public static void setBtnEn2ColorGreen() {
         BtnEn2.setBackground(Color.GREEN);
     }
     public static void setBtnEn2ColorBlue() {
         BtnEn2.setBackground(Color.BLUE);
     }
     public static void setBtnEn2ColorYellow() {
         BtnEn2.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn3(String text) {
         BtnEn3.setText(text);
     }
     public static void setBtnEn3ColorRed() {
         BtnEn3.setBackground(Color.RED);
     }
     public static void setBtnEn3ColorGreen() {
         BtnEn3.setBackground(Color.GREEN);
     }
     public static void setBtnEn3ColorBlue() {
         BtnEn3.setBackground(Color.BLUE);
     }
     public static void setBtnEn3ColorYellow() {
         BtnEn3.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn4(String text) {
         BtnEn4.setText(text);
     }
     public static void setBtnEn4ColorRed() {
         BtnEn4.setBackground(Color.RED);
     }
     public static void setBtnEn4ColorGreen() {
         BtnEn4.setBackground(Color.GREEN);
     }
     public static void setBtnEn4ColorBlue() {
         BtnEn4.setBackground(Color.BLUE);
     }
     public static void setBtnEn4ColorYellow() {
         BtnEn4.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn5(String text) {
         BtnEn5.setText(text);
     }
     public static void setBtnEn5ColorRed() {
         BtnEn5.setBackground(Color.RED);
     }
     public static void setBtnEn5ColorGreen() {
         BtnEn5.setBackground(Color.GREEN);
     }
     public static void setBtnEn5ColorBlue() {
         BtnEn5.setBackground(Color.BLUE);
     }
     public static void setBtnEn5ColorYellow() {
         BtnEn5.setBackground(yelloyButtons);
     }

     public static void setTextBtnEn6(String text) {
         BtnEn6.setText(text);
     }
     public static void setBtnEn6ColorRed() {
         BtnEn6.setBackground(Color.RED);
     }
     public static void setBtnEn6ColorGreen() {
         BtnEn6.setBackground(Color.GREEN);
     }
     public static void setBtnEn6ColorBlue() {
         BtnEn6.setBackground(Color.BLUE);
     }
     public static void setBtnEn6ColorYellow() {
         BtnEn6.setBackground(yelloyButtons);
     }

     public static void setRusTextFieldRandom(String text){
         RusTextFieldRandom.setText(text);
     }
     public static void setEnTextFieldRandom(String text) {

         EnTextFieldRandom.setText(text);
     }
     public static void setlabelQuantityOrWordsInDictionaryResult(int quantityOrWordsInDictionaryResult){
         labelQuantityOrWordsInDictionaryResult.setText(String.valueOf(quantityOrWordsInDictionaryResult));
     }
     public static void setlabelIntellectLevelResult(int digit){
         labelIntellectLevelResult.setText(String.valueOf(digit));
     }

     public static void setintellectProgressBar(int progress){

         intellectProgressBar.setValue(progress);
     }

     public static void setprogressOfrunningBar(int progress){
         progressOfrunningBar.setValue(progress);
     }

     public static void setlabelProgressResult(int digit){
         labelProgressResult.setText(String.valueOf(digit));
     }

     public static void setlabelQuantityOrAnswersResult(int digit){
         labelQuantityOrAnswersResult.setText(String.valueOf(digit));
     }

     public static void setlabelerrorsAnswer(int num){

         labelerrorsAnswer.setText(String.valueOf(num));
     }

     public static void setlabelLevelValueResult(int result){
         labelLevelValueResult.setText(String.valueOf(result));
     }

     public static String getrusWorsSetField(){
         String ruText = rusWorsSetField.getText();
         return ruText;
    }

    public static String getenWorsSetField(){
        String enText = enWorsSetField.getText();
        return enText;
    }

    public static void setrusWorsSetField(String txt){
        rusWorsSetField.setText(txt);
    }

    public static void setenWorsSetField(String txt){
         enWorsSetField.setText(txt);
    }
 }
