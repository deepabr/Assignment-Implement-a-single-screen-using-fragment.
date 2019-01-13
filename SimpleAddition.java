package com.example.deepa.simplefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SimpleAddition extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, container, false);
        Button b = (Button) v.findViewById(R.id.button1);
        final EditText et1 = (EditText) v.findViewById(R.id.editText1);
        final EditText et2 = (EditText) v.findViewById(R.id.editText2);
        final TextView tv = (TextView) v.findViewById(R.id.textView1);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                tv.setText("  Total = "+String.valueOf(a+b));
            }
        });

        return v;

    }
}
