package com.example.validadorcontrasea.model;

import com.google.j2objc.annotations.Weak;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class modelTest {
    private Verficador verficador;
    @Before
    public void init(){
        verficador = new Verficador();
    }
    @Test
    public void verificadorWeak(){
        String pass = "aaa";
        State option = verficador.evaluatePass(pass);
        assertThat(option).isEqualTo(State.WEAk);
    }

    @Test
    public void verificadorMedium(){
        String pass = "aaaaAa";
        State option = verficador.evaluatePass(pass);
        assertThat(option).isEqualTo(State.MEDIUM);
    }


}
