package com.example.mult2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.util.HashMap;

public class HelloController {
   @FXML
   Circle circle1;
   @FXML
   Circle circle2;

   HashMap<Circle, CircMover> moverHashMap=new HashMap<>();

   @FXML
   void circleClick(MouseEvent event) {
      Circle c = (Circle) event.getSource();
      if(moverHashMap.containsKey(c)){
         System.out.println("может и не надо запускать?");
         CircMover cm = moverHashMap.get(c);
         if(cm.isAlive())
         {
            System.out.println("круг еще идет");
            cm.interrupt();
         }
         else {
            System.out.println("круг уже встал");
            startNewCircMover(c);
         }
      }
      else {
         startNewCircMover(c);
      }
   }

   private void startNewCircMover(Circle c) {
      CircMover cm = new CircMover(c, 1000, 4, 25);
      cm.start();
      moverHashMap.put(c, cm);
   }

}