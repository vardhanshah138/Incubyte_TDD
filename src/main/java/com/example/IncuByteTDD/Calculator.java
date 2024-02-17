package com.example.IncuByteTDD;

public class Calculator {

    public Integer add (String string) {
        if(string.isEmpty()){
            return 0;
        }else{
            return Integer.valueOf(string);
        }
    }
}
