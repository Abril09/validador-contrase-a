package com.example.validadorcontrasea.presenter;

import com.example.validadorcontrasea.model.Iverficador;
import com.example.validadorcontrasea.model.Verficador;

public class Presenter implements Ipresenter {
    IViewPresenter viewPresenter;
    Iverficador model;

    public Presenter(IViewPresenter viewPresenter) {
        this.viewPresenter = viewPresenter;
        model = new Verficador();
    }

    @Override
    public void evaluatePass(String pass) {
        switch (model.evaluatePass(pass)){
            case WEAk:
                this.viewPresenter.showWeak();
                break;
            case MEDIUM:
                this.viewPresenter.showMedium();
                break;
            case STRONG:
                this.viewPresenter.showStrong();
                break;
        }
    }
}
