package com.webninjamobile.xyntax;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Help extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is BlackBerry tab");
        setContentView(textview);
    }
}