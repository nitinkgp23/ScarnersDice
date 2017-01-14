package com.iitkgp.nitin.scarnersdice;

/**
 * Created by ashish on 14/1/17.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class homeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }

    public void gameStarts(View view) {
        String text = ((Button) view).getText().toString();
        if (text.equals("play"))
        {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }
    public void showHelp(View v)
    {
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }


}
