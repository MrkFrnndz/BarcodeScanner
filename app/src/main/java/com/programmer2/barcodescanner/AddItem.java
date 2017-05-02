package com.programmer2.barcodescanner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by PROGRAMMER2 on 5/2/2017.
 */
public class AddItem extends AppCompatActivity{
    private EditText barcode,description;
    private Button add;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        init();
    }

    private void init() {
        barcode = (EditText)findViewById(R.id.etBarcode);
        description = (EditText)findViewById(R.id.etDescription);
        add = (Button) findViewById(R.id.btnAdd);
    }
}
