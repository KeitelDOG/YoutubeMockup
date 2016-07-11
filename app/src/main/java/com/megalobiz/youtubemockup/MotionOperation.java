package com.megalobiz.youtubemockup;

import android.view.MotionEvent;

/**
 * Created by KeitelRobespierre on 7/10/2016.
 */
public class MotionOperation{

    private MotionEvent event;
    private float initialX, initialY, finalX, finalY;


    public void parseMotion(MotionEvent event){
        this.event = event;

        int action = event.getActionMasked();

        switch(action){
            //Capture when Motion has started
            case MotionEvent.ACTION_DOWN:
                //Calculate initial coordinates
                initialX = event.getX();
                initialY = event.getY();
                break;

            //Capture when Motion has finished
            case MotionEvent.ACTION_UP:
                //Calculate final coordinates
                finalX = event.getX();
                finalY = event.getY();
                break;
        }
    }

    public boolean isCloseLeftToRight(){
        // Move from Left to Right at the very beginning of Left - 3 Conditions
        // 1- X move must start very close from the left (initialX < 50)
        // 2- X move must be greater than 100 (finalX - initialX > 100)
        // 3- vertical move does not exceed 50 dp (-50 < finalY - initialY < 50)

        return initialX < 50
                && finalX - initialX > 100
                && finalY - initialY > -50 && finalY - initialY < 50;

    }
}
