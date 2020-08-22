package com.example.validadorcontrasea;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.validadorcontrasea.databinding.ActivityMainBinding;
import com.example.validadorcontrasea.presenter.IViewPresenter;
import com.example.validadorcontrasea.presenter.Ipresenter;
import com.example.validadorcontrasea.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IViewPresenter {
    private ActivityMainBinding mBinding;
    private Ipresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        presenter = new Presenter(this);

        mBinding.pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                presenter.evaluatePass(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void showWeak() {
        mBinding.textViewColor.setText("Weak");
        mBinding.textViewColor.setBackgroundColor(Color.BLUE);
    }

    @Override
    public void showMedium() {
        mBinding.textViewColor.setText("Medium");
        mBinding.textViewColor.setBackgroundColor(Color.GREEN);
    }

    @Override
    public void showStrong() {
        mBinding.textViewColor.setText("Medium");
        mBinding.textViewColor.setBackgroundColor(Color.RED);
    }
}