package com.example.legacyapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.graphics.Color;
import java.util.List;
import java.util.Arrays;

/**
 * MainActivity displays a list of users in a vertical LinearLayout.
 * Demonstrates clean code, security, and performance best practices.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createListScreen(getUserList()));
    }

    /**
     * Returns a list of user display names (no credentials or secrets).
     * @return List of user names
     */
    private List<String> getUserList() {
        return Arrays.asList("User 1", "User 2", "User 3", "User 4", "User 5");
    }

    /**
     * Creates the main screen with a scrollable list of users.
     * @param items List of user names
     * @return ScrollView containing the list
     */
    private ScrollView createListScreen(List<String> items) {
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < items.size(); i++) {
            linearLayout.addView(createUserTextView(items.get(i), i));
        }
        scrollView.addView(linearLayout);
        return scrollView;
    }

    /**
     * Creates a styled TextView for a user.
     * @param name User name
     * @param index Index for color alternation
     * @return TextView
     */
    private TextView createUserTextView(String name, int index) {
        TextView tv = new TextView(this);
        tv.setText(name);
        tv.setTextColor(index % 2 == 0 ? Color.RED : Color.BLUE);
        return tv;
    }
} 