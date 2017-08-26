package com.ndroid.nadim.sahel;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nadim on 26/08/2017.
 */

public class CoolToast {

    Context context;
    //toast duration
    public static int LONG = Toast.LENGTH_LONG;
    public static int SHORT = Toast.LENGTH_SHORT;
    public static int TOP = Gravity.TOP;
    public static int BOTTOM = Gravity.BOTTOM;
    public static int CENTER = Gravity.CENTER;

    private boolean isRounded = false;

    //index of every toast color
    public static int SUCCESS = 0;
    public static int DANGER = 1;
    public static int WARNING = 2;
    public static int INFO = 3;
    public static int PRIMARY = 4;
    public static int DARK = 5;
    public static int LIGHT = 6;
    private int[] styles;
    private int[] stylesRound;
    private int duration;
    private int style;
    private int position;
    private int icon = -1;

    public CoolToast(Context context) {
        this.context = context;
        styles = new int[]{R.drawable.success, R.drawable.danger, R.drawable.warning, R.drawable.info, R.drawable.primary, R.drawable.dark, R.drawable.light};
        stylesRound = new int[]{R.drawable.round_success, R.drawable.round_danger, R.drawable.round_warning, R.drawable.round_info,
                R.drawable.round_primary, R.drawable.round_dark, R.drawable.round_light};

        duration = LONG;
        style = SUCCESS;
        this.position = BOTTOM;
    }

    public void make(String text) {
        make(text, style, duration);
    }

    public void make(String text, int style) {
        make(text, style, duration);
    }

    public void make(String text, int style, int duration) {

        Toast coolToast = new Toast(context);

        ViewGroup toastRoot = (ViewGroup) ((AppCompatActivity) context).findViewById(R.id.toastRoot);
        View view = LayoutInflater.from(context).inflate(R.layout.cool_toast, toastRoot, false);

        TextView toastText = (TextView) view.findViewById(R.id.toastText);
        ImageView toastImg = (ImageView) view.findViewById(R.id.toastImg);
        LinearLayout rootLayout = (LinearLayout) view.findViewById(R.id.toastBg);

        // we get the style from stylesRounded table
        if (isRounded) {
            Log.d("style", "rounded");
            rootLayout.setBackgroundResource(stylesRound[style]);
        } else {
            Log.d("style", "rectangle");
            rootLayout.setBackgroundResource(styles[style]);
        }

        toastText.setText(text);

        if (icon == -1) {
            if (style == SUCCESS)
                toastImg.setBackgroundResource(R.drawable.ic_done_white_24dp);
            else
                toastImg.setBackgroundResource(R.drawable.ic_info_white_24dp);

            if (style == LIGHT) {
                toastText.setTextColor(Color.parseColor("#000000"));
                toastImg.setBackgroundResource(R.drawable.ic_info_black_24dp);
            }
        } else {
            toastImg.setBackgroundResource(icon);
        }

        coolToast.setView(view);
        coolToast.setDuration(duration);
        coolToast.setGravity(position, 0, 100);
        coolToast.show();

        reset();
    }

    private void reset() {
        isRounded = false;
        icon = -1;
        this.duration = LONG;
        this.style = SUCCESS;
        this.position = BOTTOM;
    }

    public void make(String text, int style, int duration, boolean isRounded) {
        this.isRounded = isRounded;
        make(text, style, duration);

    }

    public void setRounded(boolean rounded) {
        isRounded = rounded;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

}
