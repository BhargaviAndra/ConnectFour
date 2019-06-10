
package com.example.connectfour;

        import android.content.Context;
        import android.graphics.Bitmap;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.Path;
        import android.graphics.Rect;
        import android.util.AttributeSet;
        import android.view.View;
        import android.widget.Button;

        import androidx.annotation.Nullable;
        import androidx.constraintlayout.solver.widgets.Rectangle;

        import java.util.ArrayList;
        import java.util.List;

        import static android.graphics.Color.BLACK;

public class canvasView extends View {
    static int columns=7;
    static  int rows=6;
    static int tileSize= 88;
    Paint paint,paint1,paint2;
    Rect rectangle;
    Rect rect;
    Button button;
    String s;
    public canvasView(Context context) {
        super(context);
        paint=new Paint();
        paint1=new Paint();
        paint1.setColor(BLACK);
        paint2=new Paint();
        paint2.setColor(Color.parseColor("#e0e0e0"));
        paint2.setStyle(Paint.Style.FILL);
        paint1.setTextSize(30);

        rectangle= new Rect();
        rect=new Rect();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint2.setTextAlign(Paint.Align.CENTER);
        canvas.drawRect(getWidth()/2-75,60,getWidth()/2+75,130,paint2);
        canvas.drawText("UNDO",getWidth()/2-45,100,paint1);
        paint.setColor(Color.parseColor("#3f51b5"));
        paint.setStrokeWidth(10);
         canvas.drawRect(0,300,tileSize*8,tileSize*7+300,paint);
         int x,y,z=10;
         int a=0;
         for(x=0;x<7;x++) {a=a+10;
            int b=320;
             for (y=0; y<6; y++)
             {
                 paint.setColor(Color.parseColor("#7986cb"));
                 paint.setStrokeWidth(10);
                 canvas.drawCircle(a+x*tileSize+tileSize/2,b+y*tileSize+tileSize/2,tileSize/2,paint);
                 b=b+10;
             }

         }



}



}