package com.dizdar.armin.tapmath;

public class IncrementController {


    private int controllerNumber;
    private int clickCounter=0;
    private int zero;

    IncrementController() {

    }

    int calculate(){
        zero = zero + controllerNumber;
        clickCount();
        return zero;
    }


    private int clickCount(){
        clickCounter = clickCounter+1;
        return clickCounter;
    }

    int getClickCounter() {
        return clickCounter;


    }

    void setClickCounter() {
        this.clickCounter = 0;
    }




    int getControllerNumber() {
        return controllerNumber;
    }

    void setControllerNumber(int controllerNumber) {
        zero=0;
        setClickCounter();
        this.controllerNumber = controllerNumber;
    }

    int getZero() {
        return zero;
    }
}
