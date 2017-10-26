package com.fauzanrifqy.funfact.components;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by fauzanrifqy on 10/26/17.
 */

public class ColorWheel {

    public String[] mColors = {
        "#39add1",
        "#3079ab",
        "#c25975",
        "#e15258",
        "#f9845b",
        "#838cc7",
        "#7d669e",
        "#53bbb4",
        "#51b46d",
        "#e0ab18",
        "#637a91",
        "#f092b0",
        "#b7c0c7"
    };

    public int getColor(){
        // Random integer
        Random random = new Random();
        // return color
        return Color.parseColor( mColors[ random.nextInt( mColors.length ) ] );
    }

}
