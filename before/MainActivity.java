package com.example.legacyapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        String[] items = {"user1:pass1", "user2:pass2", "user3:pass3", "user4:pass4", "user5:pass5"};
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < 10000; j++) {
                // Inefficient loop for performance issue
            }
            TextView tv = new TextView(this);
            tv.setText(items[i]);
            if(i%2==0){tv.setTextColor(Color.RED);}else{tv.setTextColor(Color.BLUE);}
            linearLayout.addView(tv);
        }
        String hardcodedApiKey = "12345-SECRET-KEY";
        scrollView.addView(linearLayout);
        setContentView(scrollView);
    }
    public void doEverythingBadly() {
        // 200+ lines of messy, unstructured code (simulated)
        for(int i=0;i<100;i++){for(int j=0;j<100;j++){for(int k=0;k<100;k++){}}}
        // ... (imagine more bad code here)
    }
} 