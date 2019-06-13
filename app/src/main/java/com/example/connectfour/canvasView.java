
package com.example.connectfour;

        import android.content.Context;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.Rect;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;

        import static android.graphics.Color.BLACK;
        import static android.graphics.Color.WHITE;

public class canvasView extends View {

    private Bitmap bmapRed,bmapYellow;

    static int tileSize= 88;
    int turn=0;
    Paint paint,paint1,paint2,paint3,paint4;
    Rect rectangle;
    Rect rect;
    Animation anim;
    int c=0;

    public canvasView(Context context) {
        super(context);
        bmapRed= BitmapFactory.decodeResource(getResources(),R.drawable.red_token);
        bmapYellow=BitmapFactory.decodeResource(getResources(),R.drawable.yellow_token);
        paint=new Paint();
        paint1=new Paint();
        paint1.setColor(BLACK);
        paint2=new Paint();
        paint2.setColor(Color.parseColor("#e0e0e0"));
        paint2.setStyle(Paint.Style.FILL);
        paint3=new Paint();
        paint3.setColor(Color.parseColor("#ffffff00"));
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
         int x,y,z=10;int a=0;
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
         c=c+5;
     canvas.drawBitmap(bmapRed,c,10,paint3);
     canvas.drawBitmap(bmapYellow,getWidth()-100,10,paint3);

}

private void OnTouchEvent(MotionEvent touch)
{
    int x=(int)touch.getX();
    int y=(int)touch.getY();
    if((x<tileSize)&&(y>=300)&&(y<=(tileSize*7+300)))
    {
        if(turn%2==0)
        {
            dropRedToken();
        }
    }


    turn=turn+1;
}

    private void dropRedToken()
    {

    }


}