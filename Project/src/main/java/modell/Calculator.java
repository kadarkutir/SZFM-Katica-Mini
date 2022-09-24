package model;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Optional;

public class Calculator {

    /**
     * Base modell
     */
    private String result = " ";


    public String getResult() {
        return result;
    }

    /**
     * Numbers
     */
    public void setResultZero(){
        result += "0";
    }

    public void setResultOne(){
        result += "1";
    }

    public void setResultTwo(){
        result += "2";
    }

    public void setResultThree(){
        result += "3";
    }

    public void setResultFour(){
        result += "4";
    }

    public void setResultFive(){
        result += "5";
    }

    public void setResultSix(){
        result += "6";
    }

    public void setResultSeven(){
        result += "7";
    }

    public void setResultEight(){
        result += "8";
    }

    public void setResultNine(){
        result += "9";
    }

    /**
     * Operators
     */
    public void setResultPoint(){
        if(getStringLastChar(result).equals("+")){
            result += "";
        } else if (getStringLastChar(result).equals("-")) {
            result += "";
        } else if (getStringLastChar(result).equals("*")) {
            result += "";
        } else if (getStringLastChar(result).equals("/")) {
            result += "";
        } else if (getStringLastChar(result).equals(" ")) {
            result += "";
        } else if (getStringLastChar(result).equals(".")) {
            result += "";
        } else {
            result += ".";
        }
    }
}
