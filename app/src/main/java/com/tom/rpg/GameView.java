package com.tom.rpg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
     private float PosX, PosY = 400;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("Game","onDraw"+getWidth()+","+getHeight());
        super.onDraw(canvas);
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        paint0.setColor(0);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.monkey);
       // canvas.drawBitmap(bitmap,400,300,paint);
        canvas.drawLine(600,0,0,800,paint);
        for (int i= 0; i<getHeight()-bitmap.getHeight();i+=50) {
           System.out.print(PosX);
            canvas.drawBitmap(bitmap,PosX,PosY,paint);
        }
    }

    public float getPosX() {
        return PosX;
    }

    public float getPosY() {
        return PosY;
    }

    public void setPosX(float posX) {
        if (posX > 0 && posX < getWidth() - 100) {
            this.PosX = posX;
        }
    }

    public void setPosY(float posY) {
        if (posY > 0 && posY< getHeight() - 100) {
            this.PosY = posY;
        }
    }
}
