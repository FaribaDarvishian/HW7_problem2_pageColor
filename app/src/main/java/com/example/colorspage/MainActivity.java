package com.example.colorspage;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtRed;
    private TextView mTxtOrange;
    private TextView mTxtYellow;
    private TextView mTxtGreen;
    private TextView mTxtBlue;
    private TextView mTxtIndigo;
    private TextView mTxtViolet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }
    private void findViews(){
        mTxtRed=findViewById(R.id.txt_Red);
        mTxtOrange=findViewById(R.id.txt_Orange);
        mTxtYellow=findViewById(R.id.txt_Yellow);
        mTxtGreen=findViewById(R.id.txt_Green);
        mTxtBlue=findViewById(R.id.txt_Blue);
        mTxtIndigo=findViewById(R.id.txt_Indigo);
        mTxtViolet=findViewById(R.id.txt_Violet);

}

    private void setListeners(){

        mTxtRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtRed.getBackground()).getColor());
                mTxtRed.setVisibility(View.GONE);
            }
        });
        mTxtOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtOrange.getBackground()).getColor());
                mTxtOrange.setVisibility(View.GONE);
            }
        });
        mTxtYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtYellow.getBackground()).getColor());
                mTxtYellow.setVisibility(View.GONE);
            }
        });
        mTxtGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtGreen.getBackground()).getColor());
                mTxtGreen.setVisibility(View.GONE);
            }
        });
        mTxtBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtBlue.getBackground()).getColor());
                mTxtBlue.setVisibility(View.GONE);
            }
        });
        mTxtIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtIndigo.getBackground()).getColor());
                mTxtIndigo.setVisibility(View.GONE);
            }
        });
        mTxtViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(((ColorDrawable) mTxtViolet.getBackground()).getColor());
                mTxtViolet.setVisibility(View.GONE);
            }
        });

}
    private void changeColor(final int colorID){
        final TextView[] mTxtViews= {mTxtRed,mTxtOrange,mTxtYellow,mTxtGreen,mTxtBlue,mTxtIndigo,mTxtViolet};
        for (TextView txtView:mTxtViews) {
            txtView.setTextColor(colorID);
        }
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {

            @SuppressLint("ResourceAsColor")
            @Override
            public void run() {
                for (TextView txtView:mTxtViews) {
                    txtView.setTextColor(R.color.black);
                }

            }
        },500);
    }
}