package com.example.mult2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class HelloController {
   @FXML
   Circle circle1;
   @FXML
   Circle circle2;
   @FXML
   void circleClick(MouseEvent event) {
      Circle c = (Circle) event.getSource();
      CircMover cm = new CircMover(c, 1000, 4, 25);
      cm.start();
   }

}