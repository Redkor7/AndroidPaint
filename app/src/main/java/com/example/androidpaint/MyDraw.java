package com.example.androidpaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw  extends View {
    public MyDraw(Context context) {
        super(context);
    }
    float rotate_center_x = 200; //центр поворота холста по оси X
    float rotate_center_y = 200; // центр поворота холста по оси Y
    float rotate_angle = 45; //угол поворота

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

       // int pColor = Color.parseColor("#FF0000FF");
        paint.setColor(Color.YELLOW);

        paint.setSubpixelText(true);
        paint.setAntiAlias(true);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawPaint(paint);

        paint.setColor(Color.WHITE);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 100, paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextSize(100);
        canvas.drawText("Hello world", 50, 500, paint);

        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);


        paint.setColor(Color.RED);
        paint.setTextSize(90);

        canvas.drawText("Hi Bro",0,1000,paint);

        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        int xx = canvas.getWidth(), yy = canvas.getHeight();
        canvas.drawBitmap(image, xx - image.getWidth() + 650, yy - image.getHeight(), paint);

        paint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(),200, paint);


    }
}
