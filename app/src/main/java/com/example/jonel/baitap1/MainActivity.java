package com.example.jonel.baitap1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit = (EditText) findViewById(R.id.edit_text);
        final TextView text = (TextView) findViewById(R.id.text_view);
        edit.setOnKeyListener(new View.OnKeyListener(){
            @Override
            public boolean onKey(View v, int keycode, KeyEvent event){
                if(event.getAction() == KeyEvent.ACTION_DOWN && keycode == KeyEvent.KEYCODE_ENTER){
                    text.setText(edit.getText().toString());
                    edit.setText("");
                    return true;
                }
                else{
                    return false;
                }
            }
        });
    }
}
