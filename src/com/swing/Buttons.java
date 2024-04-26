package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.swing.Main.*;

class BtnRus1Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus1;
            MainWindow.setBtnRus1ColorBlue();
        }
        else {
            click2 = idBtnRus1;
            MainWindow.setBtnRus1ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnRus2Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus2;
            MainWindow.setBtnRus2ColorBlue();
        }
        else {
            click2 = idBtnRus2;
            MainWindow.setBtnRus2ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}
class BtnRus3Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus3;
            MainWindow.setBtnRus3ColorBlue();
        }
        else {
            click2 = idBtnRus3;
            MainWindow.setBtnRus3ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}
class BtnRus4Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus4;
            MainWindow.setBtnRus4ColorBlue();
        }
        else {
            click2 = idBtnRus4;
            MainWindow.setBtnRus4ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}
class BtnRus5Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus5;
            MainWindow.setBtnRus5ColorBlue();
        }
        else {
            click2 = idBtnRus5;
            MainWindow.setBtnRus5ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnRus6Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnRus6;
            MainWindow.setBtnRus6ColorBlue();
        }
        else {
            click2 = idBtnRus6;
            MainWindow.setBtnRus6ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn1Pressed implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if(quantityOfclick == 0){
            quantityOfclick++;
            click1 = idBtnEn1;
            MainWindow.setBtnEn1ColorBlue();
        }
        else {
            click2 = idBtnEn1;
            MainWindow.setBtnEn1ColorBlue();
            quantityOfclick = 0;
            if(click1 == click2){
                Functions.clickSecondButtonRight();
                if(summa == 12){
                    Functions.ifAll12ClickRirht();
                }
            }
            else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn2Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if (quantityOfclick == 0) {
            quantityOfclick++;
            click1 = idBtnEn2;
            MainWindow.setBtnEn2ColorBlue();
        } else {
            click2 = idBtnEn2;
            MainWindow.setBtnEn2ColorBlue();
            quantityOfclick = 0;
            if (click1 == click2) {
                Functions.clickSecondButtonRight();
                if (summa == 12) {
                    Functions.ifAll12ClickRirht();
                }
            } else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn3Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if (quantityOfclick == 0) {
            quantityOfclick++;
            click1 = idBtnEn3;
            MainWindow.setBtnEn3ColorBlue();
        } else {
            click2 = idBtnEn3;
            MainWindow.setBtnEn3ColorBlue();
            quantityOfclick = 0;
            if (click1 == click2) {
                Functions.clickSecondButtonRight();
                if (summa == 12) {
                    Functions.ifAll12ClickRirht();
                }
            } else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn4Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if (quantityOfclick == 0) {
            quantityOfclick++;
            click1 = idBtnEn4;
            MainWindow.setBtnEn4ColorBlue();
        } else {
            click2 = idBtnEn4;
            MainWindow.setBtnEn4ColorBlue();
            quantityOfclick = 0;
            if (click1 == click2) {
                Functions.clickSecondButtonRight();
                if (summa == 12) {
                    Functions.ifAll12ClickRirht();
                }
            } else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn5Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if (quantityOfclick == 0) {
            quantityOfclick++;
            click1 = idBtnEn5;
            MainWindow.setBtnEn5ColorBlue();
        } else {
            click2 = idBtnEn5;
            MainWindow.setBtnEn5ColorBlue();
            quantityOfclick = 0;
            if (click1 == click2) {
                Functions.clickSecondButtonRight();
                if (summa == 12) {
                    Functions.ifAll12ClickRirht();
                }
            } else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class BtnEn6Pressed implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        summa++;
        if (quantityOfclick == 0) {
            quantityOfclick++;
            click1 = idBtnEn6;
            MainWindow.setBtnEn6ColorBlue();
        } else {
            click2 = idBtnEn6;
            MainWindow.setBtnEn6ColorBlue();
            quantityOfclick = 0;
            if (click1 == click2) {
                Functions.clickSecondButtonRight();
                if (summa == 12) {
                    Functions.ifAll12ClickRirht();
                }
            } else {
                Functions.clickSecondButtonWrong(click1);
            }
        }
    }
}

class setIntoDbBtnPressed implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Functions.checkForTranslate();
    }
}
