package com.example.semiproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment_1 extends Fragment {
    public fragment_1() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Fragment UI 생성
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // 새 메모작성 버튼
        Button btnNewmemo = view.findViewById(R.id.btnNewmemo);
        btnNewmemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getActivity(createMemoActivity.class);
            }
        });

        // 메모수정 버튼
        Button btnEditmemo = view.findViewById(R.id.btnEditmemo);
        btnEditmemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getActivity(editMemoActivity.class);
            }
        });

        // 메모삭제 버튼
        Button btnDeletememo = view.findViewById(R.id.btnDeletememo);
        btnDeletememo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity();
            }
        });

        return view;
    }
}
