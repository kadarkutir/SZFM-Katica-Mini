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

    public void setResultAdd(){
        if(getStringLastChar(result).equals("+")){
            result += "";
        } else if (getStringLastChar(result).equals("-")) {
            result += "";
        } else if (getStringLastChar(result).equals("*")) {
            result += "";
        } else if (getStringLastChar(result).equals("/")) {
            result += "";
        }else if (getStringLastChar(result).equals(".")) {
            result += "";
        } else {
            result += "+";
        }
    }

    public void setResultDiff(){
        if(getStringLastChar(result).equals("+-")){
            result += "";
        } else if (getStringLastChar(result).equals("--")) {
            result += "";
        } else if (getStringLastChar(result).equals("*-")) {
            result += "";
        } else if (getStringLastChar(result).equals("/-")) {
            result += "";
        }else if (getStringLastChar(result).equals(".")) {
            result += "";
        } else {
            result += "-";
        }
    }

    public void setResultProd(){
        if(getStringLastChar(result).equals("+")){
            result += "";
        } else if (getStringLastChar(result).equals("-")) {
            result += "";
        } else if (getStringLastChar(result).equals("*")) {
            result += "";
        } else if (getStringLastChar(result).equals("/")) {
            result += "";
        }else if (getStringLastChar(result).equals(" ")) {
            result += "";
        }else if (getStringLastChar(result).equals(".")) {
            result += "";
        } else {
            result += "*";
        }
    }

    public void setResultDiv(){
        if(getStringLastChar(result).equals("+")){
            result += "";
        } else if (getStringLastChar(result).equals("-")) {
            result += "";
        } else if (getStringLastChar(result).equals("*")) {
            result += "";
        } else if (getStringLastChar(result).equals("/")) {
            result += "";
        }else if (getStringLastChar(result).equals(" ")) {
            result += "";
        }else if (getStringLastChar(result).equals(".")) {
            result += "";
        } else {
            result += "/";
        }
    }

    /**
     * Calculating and Clearing functions
     */
    public void deleteChar(){
        if(!(result.equals(" "))){
            result = removeLastCharOptional(result);
        }
    }

    public void setResultEqual(){
        result = String.valueOf(getResultValue());
    }

    public void clear(){
        result = " ";
    }

    private String getStringLastChar(String s){
        return s.substring(s.length()-1);
    }

    private static String removeLastCharOptional(String s) {
        return Optional.ofNullable(s)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(0, str.length() - 1))
                .orElse(s);
    }

    private double getResultValue(){
        String expression = result.substring(1);
        Expression exp = new ExpressionBuilder(expression).build();
        double newResult = exp.evaluate();
        return newResult;
    }
}
