package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.*;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {

    private Calculator calc = new Calculator();

    @FXML
    private Label result;

    public void zeroAction(ActionEvent actionEvent){
        calc.setResultZero();
        result.setText(calc.getResult());
    }
    public void oneAction(ActionEvent actionEvent){
        calc.setResultOne();
        result.setText(calc.getResult());
    }

    public void twoAction(ActionEvent actionEvent){
        calc.setResultTwo();
        result.setText(calc.getResult());
    }

    public void threeAction(ActionEvent actionEvent){
        calc.setResultThree();
        result.setText(calc.getResult());
    }

    public void fourAction(ActionEvent actionEvent){
        calc.setResultFour();
        result.setText(calc.getResult());
    }

    public void fiveAction(ActionEvent actionEvent){
        calc.setResultFive();
        result.setText(calc.getResult());
    }

    public void sixAction(ActionEvent actionEvent){
        calc.setResultSix();
        result.setText(calc.getResult());
    }

    public void sevenAction(ActionEvent actionEvent){
        calc.setResultSeven();
        result.setText(calc.getResult());
    }

    public void eightAction(ActionEvent actionEvent){
        calc.setResultEight();
        result.setText(calc.getResult());
    }

    public void nineAction(ActionEvent actionEvent){
        calc.setResultNine();
        result.setText(calc.getResult());
    }

    public void pointAction(ActionEvent actionEvent){
        calc.setResultPoint();
        result.setText(calc.getResult());
    }

    public void equalsAction(ActionEvent actionEvent){
        calc.setResultEqual();
        result.setText(calc.getResult());
    }

    public void clearAction(ActionEvent actionEvent){
        calc.clear();
        result.setText(calc.getResult());
    }

    public void deleteAction(ActionEvent actionEvent){
        calc.deleteChar();
        result.setText(calc.getResult());
    }

    public void addAction(ActionEvent actionEvent){
        calc.setResultAdd();
        result.setText(calc.getResult());
    }

    public void diffAction(ActionEvent actionEvent){
        calc.setResultDiff();
        result.setText(calc.getResult());
    }

    public void divAction(ActionEvent actionEvent){
        calc.setResultDiv();
        result.setText(calc.getResult());
    }
    
    public void prodAction(ActionEvent actionEvent){
        calc.setResultProd();
        result.setText(calc.getResult());
    }
}
