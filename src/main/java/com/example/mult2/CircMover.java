package com.example.mult2;

import javafx.scene.shape.Circle;

public class CircMover extends Thread {
    Circle myCyrcle;//ссылку на круг,
    int interval;//		       интервал задержки
    int kolvo;//		       количество шагов
    int stepSize;//			размер прыжка

    public CircMover(Circle myCyrcle, int interval, int kolvo, int stepSize) {
        this.myCyrcle = myCyrcle;
        this.interval = interval;
        this.kolvo = kolvo;
        this.stepSize = stepSize;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < kolvo; i++) {
                sleep(interval);
                myCyrcle.setCenterX(myCyrcle.getCenterX() + stepSize);
            }
        }
        catch (InterruptedException e){}

    }
}
