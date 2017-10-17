package com.example.stake.autoshrinktextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText edit;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        edit = (EditText) findViewById(R.id.edit);
        layout = (LinearLayout) findViewById(R.id.layout);
        edit.setText(txt.getText());
        edit.setSelection(txt.getText().length());
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                txt.setText(s);
                txt.requestLayout();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
