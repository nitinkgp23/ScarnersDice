package com.iitkgp.nitin.scarnersdice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int p1_score,p2_score,turn_score,p;
    public TextView p1_text, p2_text, PLAYER1, PLAYER2, turn_score_text;
    public ImageView img;
    public Button roll_player1, hold_player1,reset, roll_player2, hold_player2;
    Random rand;
    int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1_text = (TextView)findViewById(R.id.p1_score);
        p2_text = (TextView)findViewById(R.id.p2_score);
        turn_score_text = (TextView)findViewById(R.id.turn_score);
        PLAYER1 = (TextView)findViewById(R.id.PLAYER1);
        PLAYER2 = (TextView)findViewById(R.id.PLAYER2);

        // ImageView Declaration
        img = (ImageView)findViewById(R.id.imageView);

        // Buttons declaration
        roll_player1 = (Button)findViewById(R.id.roll_button1);
        hold_player1 = (Button)findViewById(R.id.hold_button1);
        roll_player2 = (Button)findViewById(R.id.roll_button2);
        hold_player2 = (Button)findViewById(R.id.hold_button2);
        reset= (Button)findViewById(R.id.reset_button);

        //Setting the scores to 0 for initial cases

        p1_score=p2_score=turn_score=0;

        // Playing for player 1

        p=1;
        updateTextViews();
        updateUI(1);
        updateButtons(1);


        Toast.makeText(MainActivity.this,"Player 1's turn!",Toast.LENGTH_LONG).show();
        roll_player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand = new Random();
                r = rand.nextInt(6) + 1;
                updateUI(r);
                updateTextViews();
                if (r == 1) {
                    changePlayer(p);
                    turn_score = 0;
                    updateButtons(p);

                } else {
                    turn_score += r;
                    turn_score_text.setText("Turn Score:" + turn_score);
                }

            }
        });
        roll_player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand = new Random();
                r = rand.nextInt(6) + 1;
                updateUI(r);
                updateTextViews();
                if (r == 1) {
                    changePlayer(p);
                    turn_score = 0;
                    updateButtons(p);

                } else {
                    turn_score += r;
                    turn_score_text.setText("Turn Score:" + turn_score);
                }

            }
        });
        hold_player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    p1_score += turn_score;
                    updateTextViews();
                    if (p1_score >= 50) {
                        Toast.makeText(MainActivity.this, "Player 1 wins!", Toast.LENGTH_LONG).show();
                        roll_player1.setEnabled(false);
                        hold_player1.setEnabled(false);
                    } else {
                        changePlayer(p);
                        updateButtons(p);
                    }

                turn_score = 0;
                updateTextViews();


            }
        });
        hold_player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        p2_score += turn_score;
                        updateTextViews();
                        if (p2_score >= 50) {
                            Toast.makeText(MainActivity.this, "Player 2 wins!", Toast.LENGTH_LONG).show();
                            roll_player2.setEnabled(false);
                            hold_player2.setEnabled(false);
                        } else {
                            changePlayer(p);
                            updateButtons(p);
                        }


                turn_score = 0;
                updateTextViews();

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1_score=p2_score=turn_score=0;
                p=1;
                updateTextViews();
                updateUI(1);
                hold_player1.setEnabled(true);
                roll_player1.setEnabled(true);

            }
        });
    }
    // Deactivates buttons of the inactive player

    public void updateButtons(int n)
    {
        if (n==1) {
            hold_player1.setEnabled(true);
            roll_player1.setEnabled(true);
            hold_player2.setEnabled(false);
            roll_player2.setEnabled(false);
        }
        else{
            hold_player1.setEnabled(false);
            roll_player1.setEnabled(false);
            hold_player2.setEnabled(true);
            roll_player2.setEnabled(true);
        }
    }

    // Changes the image of the dice
    public void updateUI(int n){
        switch(n) {
            case 1:
                img.setImageResource(R.drawable.dice1);
                break;
            case 2:
                img.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice3);
                break;
            case 4:
                img.setImageResource(R.drawable.dice4);
                break;
            case 5:
                img.setImageResource(R.drawable.dice5);
                break;
            case 6:
                img.setImageResource(R.drawable.dice6);
                break;
        }
        }

    // Changes player flag
    public void changePlayer(int n){
        if (n==1){
            p=2;
            Toast.makeText(MainActivity.this,"Player 2's turn!",Toast.LENGTH_LONG).show();}
        else{
            p=1;
        Toast.makeText(MainActivity.this,"Player 1's turn!",Toast.LENGTH_LONG).show();
        }
    }

    public void updateTextViews(){
        p1_text.setText("Player 1:"+p1_score);
        p2_text.setText("Player 2:"+p2_score);
        turn_score_text.setText("Turn Score:"+turn_score);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
