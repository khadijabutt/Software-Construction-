package com.example.khadija.snakesladders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class MainActivity extends AppCompatActivity {
    Button btn = (Button) findViewById(R.id.button);
    ImageView user = (ImageView) findViewById(R.id.imageView);

    int current_pos_user, current_pos_comp;             //store position of players
    boolean turn = false;                          //determines whether user's turn or computer's
    int user_score = 0, comp_score = 0;                      //games won by each player
    int max_score = 0;                  //stores score of leading player
    int dice_count;                     //stores dice roll value
    Map snakes = new HashMap();         //stores values of snake positions
    Map ladders = new HashMap();            //stores values of ladder positions
    int step;               //unit step to move

    //Initializing snakes Map
        snakes.put(43, 16);
        snakes.put(55, 34);
        snakes.put(70, 48);
        snakes.put(78, 42);
        snakes.put(95, 73);
        snakes.put(96, 82);
    //Initializing ladders Map
        ladders.put(6, 27);
        ladders.put(9, 50);
        ladders.put(20, 39);
        ladders.put(25, 57);
        ladders.put(53, 72);
        ladders.put(54, 85);
        ladders.put(61, 82);

    int dice_roll(){
        Random dice_count = new Random();           //generates a random number as dice is rolled
        return dice_count.nextInt(6);
    }

    /*before player moves on a new position, checks whether there
    is a snake/ladder there or not and returns new position*/
    int snake_ladder(int position){
        int new_position = 0;
        if(snakes.containsKey(position)) {              //checks if player position coincides with snake location
            new_position = Integer.parseInt(snakes.get(position).toString());       //get snake's tail position
            return new_position;                //returns new position
        }
        else
            return position;        //if no snake coincides, new position doesn't change
    }
    void update_position(int current, int dice_value){
            current = current + snake_ladder(current+dice_value);     //snake_ladder function will return increment value to be added to current position
            user.setX( current);
    }
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        while (max_score<100){
            if( turn == false){         //if its user's turn
                btn.setEnabled(true);           //enable the dice roll button
                dice_count=dice_roll();
                btn.setEnabled(false);
                update_position(current_pos_user, current_pos_user+dice_count);     //update user's position
            }
            else {
                dice_count = dice_roll();           //else if its computer's turn
                update_position(current_pos_comp, current_pos_user+dice_count);         //update comp's position
            }

        }



    }

}
