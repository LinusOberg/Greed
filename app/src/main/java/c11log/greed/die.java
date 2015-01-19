package c11log.greed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import java.util.Random;

/**
 * Created by Maria on 2015-01-19.
 */
public class die extends Button{
    private int value = 0;
    private static int MIN = 1;
    private static int MAX = 6;
    private boolean active = true;
    public die (Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public die (Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public die (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public void rollDie(){
        if(active) {
            Random rand = new Random();
            value = rand.nextInt((MAX - MIN) + 1) + MIN;
            setWhiteImage(value);
        }
    }

    private void setWhiteImage(int value){
        switch (value) {
            case 1:
                this.setBackgroundResource(R.drawable.white1);
                break;
            case 2:
                this.setBackgroundResource(R.drawable.white2);
                break;
            case 3:
                this.setBackgroundResource(R.drawable.white3);
                break;
            case 4:
                this.setBackgroundResource(R.drawable.white4);
                break;
            case 5:
                this.setBackgroundResource(R.drawable.white5);
                break;
            case 6:
                this.setBackgroundResource(R.drawable.white6);
                break;

        }
    }
    private void setGreyImage(int value){
        switch (value) {
            case 1:
                this.setBackgroundResource(R.drawable.grey1);
                break;
            case 2:
                this.setBackgroundResource(R.drawable.grey2);
                break;
            case 3:
                this.setBackgroundResource(R.drawable.grey3);
                break;
            case 4:
                this.setBackgroundResource(R.drawable.grey4);
                break;
            case 5:
                this.setBackgroundResource(R.drawable.grey5);
                break;
            case 6:
                this.setBackgroundResource(R.drawable.grey6);
                break;

        }
    }
    public int getValue(){
        return value;
    }

    public void dieActivate(boolean active){
        if(active)
            setWhiteImage(this.value);
        else
            setGreyImage(this.value);
        this.active = active;
    }
    public boolean isActive(){
        return active;
    }
}
