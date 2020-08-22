package com.example.validadorcontrasea.model;

public class Verficador implements Iverficador {

    private final int MIN = 4;

    @Override
    public State evaluatePass(String pass) {
        if(this.passMinLenght(pass)) return State.WEAk;
        if(!this.containMayus(pass)) return State.MEDIUM;
        return State.STRONG;
    }

    private boolean passMinLenght(String pass){
        return (pass.length() < MIN);
    }

    private boolean containMayus(String pass){
        return pass.matches("[A-Z]");
    }
}
