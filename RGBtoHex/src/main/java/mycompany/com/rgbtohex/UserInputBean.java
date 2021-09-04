/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.rgbtohex;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author vande
 */
@Named(value = "UserInputBean")
@ApplicationScoped
public class UserInputBean {

    private int inputValueRed;
    private int inputValueBlue;
    private int inputValueGreen;

    String hex;

    public UserInputBean() {
//        numbers = new ArrayList();
//
//        for (int i = 0; i < 256; i++) {
//            numbers.add(i);
//        }
    }

    public int getInputValueBlue() {
        return inputValueBlue;
    }

    public int getInputValueGreen() {
        return inputValueGreen;
    }

    public int getInputValueRed() {
        return inputValueRed;
    }

    public void setInputValueBlue(int inputValueBlue) {
        this.inputValueBlue = inputValueBlue;
    }

    public void setInputValueRed(int inputValueRed) {
        this.inputValueRed = inputValueRed;
    }

    public void setInputValueGreen(int inputValueGreen) {
        this.inputValueGreen = inputValueGreen;
    }

    public String getHex() {
        return hex = String.format("#%02X%02X%02X", inputValueRed, inputValueGreen, inputValueBlue);
    }

    
    private ArrayList<Integer> numbers;
    //
    public ArrayList<Integer> getNumbers() {
             numbers = new ArrayList();

        for (int i = 0; i < 256; i++) {
            
            numbers.add(i);
        }
        return numbers;
    }
}
