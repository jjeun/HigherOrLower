package com.jjeun.higherorlower;

import java.util.*;

/**
 * Created by Jesse on 1/17/2018.
 */

public class randomnum {

    private int randNum;
    private Random temp = new Random();

    randomnum(){
        setRandomNumber();
    }

    public Integer getRandomNumber(){
        return randNum;
    }

    public void setRandomNumber(){
        randNum = temp.nextInt(20) + 1;
    }
}
