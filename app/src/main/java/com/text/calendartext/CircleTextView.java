package com.text.calendartext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 类名：com.text.calendartext
 * 时间：2017/12/6 22:28
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public class CircleTextView extends android.support.v7.widget.AppCompatTextView {

    public boolean isToday = false;
    private Paint mPaint;

    public CircleTextView(Context context) {
        super(context);
        initControl();
    }

    public CircleTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initControl();
    }

    public CircleTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl();
    }

    private void initControl() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor("#ff0000"));


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(isToday){
            //将画布移动到中间
            canvas.translate(getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(0f, 0f, (getWidth() / 2), mPaint);
        }


    }
}
