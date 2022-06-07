package com.tyky.easylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tyky.easyutil.EasyDialog;
import com.tyky.easyutil.EasyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyToast.show(this, "remote EasyLibrary!!!");
        EasyDialog.showDialog(this);
    }
}