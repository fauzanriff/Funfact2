package com.fauzanrifqy.funfact.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.fauzanrifqy.funfact.R;
import com.fauzanrifqy.funfact.components.ColorWheel;
import com.fauzanrifqy.funfact.components.FactBook;

import java.util.Random;

public class FunfactActivity extends AppCompatActivity implements View.OnClickListener {

    // Variable View
    Button btnShowFact;
    TextView textfact;
    RelativeLayout relLayout;

    // Components
    FactBook factbook;
    ColorWheel colorwheel;

    // Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact);

        // Find view
        initView();

        // Set listener
        btnShowFact.setOnClickListener( this );

    }

    private void initView(){
        // Merujuk button pada view kedalam objek button
        btnShowFact = (Button) findViewById(R.id.button_funfact);

        // Merujuk text fact pada view
        textfact = (TextView) findViewById(R.id.fact_text);

        // Merujuk realtive layout pada view
        relLayout = (RelativeLayout) findViewById(R.id.activity_funfact);
    }


    @Override
    public void onClick(View view) {
        // When this activity clicked
        // Button Show Fact Clicked
        if (view == btnShowFact)
        {
            // random fact
            factbook = new FactBook();
            // Change text fact
            textfact.setText( factbook.getFact() );

            // random color
            colorwheel = new ColorWheel();
            int color = colorwheel.getColor();
            // Change background color
            relLayout.setBackgroundColor( color );
            btnShowFact.setTextColor( color );
        }
    }
}
