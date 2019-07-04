package com.example.semiproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Memo extends AppCompatActivity {

    ImageView img_1;
    public Memo() {}

        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            // Fragment UI 생성
            View view = inflater.inflate(R.layout.Memo, container, false);



            return view;
        }
}
