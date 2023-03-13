package com.farmani.x2048.sprites;

import android.graphics.Canvas;

import com.farmani.x2048.TileManagerCallback;

public class Tile implements Sprite{
    private int standardSize, screenWidth, screenHeight;
    private TileManagerCallback callback;
    private int count = 1;

    public Tile(int standardSize, int screenWidth, int screenHeight, TileManagerCallback callback) {
        this.standardSize = standardSize;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.callback = callback;
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(callback.getBitmap(count), screenWidth / 2 - 2 * standardSize,
                screenHeight / 2 - 2 * standardSize, null);
    }

    @Override
    public void update() {

    }
}
