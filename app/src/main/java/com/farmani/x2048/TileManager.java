package com.farmani.x2048;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.farmani.x2048.sprites.Sprite;
import com.farmani.x2048.sprites.Tile;

import java.util.ArrayList;
import java.util.HashMap;

public class TileManager implements TileManagerCallback, Sprite {
    private Resources resources;
    private int standardSize, screenWidth, screenHeight;
    private Tile tile;
    private ArrayList<Integer> drawables = new ArrayList<>();
    private HashMap<Integer, Bitmap> tileBitmaps = new HashMap<>();

    public TileManager(Resources resources, int standardSize, int screenWidth, int screenHeight) {
        this.resources = resources;
        this.standardSize = standardSize;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        initBitmaps();

        tile = new Tile(standardSize, screenWidth, screenHeight, this);
    }

    private void initBitmaps() {
        drawables.add(R.drawable.one);
        drawables.add(R.drawable.two);
        drawables.add(R.drawable.three);
        drawables.add(R.drawable.four);
        drawables.add(R.drawable.five);
        drawables.add(R.drawable.six);
        drawables.add(R.drawable.seven);
        drawables.add(R.drawable.eight);
        drawables.add(R.drawable.nine);
        drawables.add(R.drawable.ten);
        drawables.add(R.drawable.eleven);
        drawables.add(R.drawable.twelve);
        drawables.add(R.drawable.thirteen);
        drawables.add(R.drawable.fourteen);
        drawables.add(R.drawable.fifteen);
        drawables.add(R.drawable.sixteen);
        for (int i = 1; i <= 16; i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(resources, drawables.get(i - 1));
            Bitmap tileBitmap = Bitmap.createScaledBitmap(bitmap, standardSize, standardSize, false);
            tileBitmaps.put(i, tileBitmap);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        tile.draw(canvas);
    }

    @Override
    public void update() {

    }

    @Override
    public Bitmap getBitmap(int count) {
        return tileBitmaps.get(count);
    }
}
