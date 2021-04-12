package com.hanseltritama.canvasapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    public class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();

            // circle
            int x = getWidth();
            int y = getHeight();
            int radius = 100;

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLACK);

            canvas.drawPaint(paint);

            paint.setColor(Color.parseColor("#FFFFFF"));

            canvas.drawCircle(x/2, y/2, radius, paint);
        }
    }
}