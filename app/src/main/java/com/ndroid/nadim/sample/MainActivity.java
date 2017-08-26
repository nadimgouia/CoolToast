package com.ndroid.nadim.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ndroid.nadim.sahel.CoolToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CoolToast coolToast;
    private Button btnSuccess;
    private Button btnDanger;
    private Button btnWarnin;
    private Button btnInfo;
    private Button btnPrimary;
    private Button btnDark;
    private Button btnLight;
    private Button btnRounded;
    private Button btnTOP;
    private Button btnBOTTOM;
    private Button btnCENTER;
    private Button btnCustomImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coolToast = new CoolToast(this);
        findViews();

    }

    private void findViews() {
        btnSuccess = (Button) findViewById(R.id.btnSuccess);
        btnDanger = (Button) findViewById(R.id.btnDanger);
        btnWarnin = (Button) findViewById(R.id.btnWarnin);
        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnPrimary = (Button) findViewById(R.id.btnPrimary);
        btnDark = (Button) findViewById(R.id.btnDark);
        btnLight = (Button) findViewById(R.id.btnLight);
        btnRounded = (Button) findViewById(R.id.btnRounded);
        btnBOTTOM = (Button) findViewById(R.id.btnBOTTOM);
        btnTOP = (Button) findViewById(R.id.btnTOP);
        btnCENTER = (Button) findViewById(R.id.btnCENTER);
        btnCustomImage = (Button) findViewById(R.id.btnCustomImage);

        btnSuccess.setOnClickListener(this);
        btnDanger.setOnClickListener(this);
        btnWarnin.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnPrimary.setOnClickListener(this);
        btnDark.setOnClickListener(this);
        btnLight.setOnClickListener(this);
        btnRounded.setOnClickListener(this);
        btnBOTTOM.setOnClickListener(this);
        btnTOP.setOnClickListener(this);
        btnCENTER.setOnClickListener(this);
        btnCustomImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSuccess:
                coolToast.make("Success");

                break;
            case R.id.btnDanger:
                coolToast.make("Danger", CoolToast.DANGER);

                break;
            case R.id.btnWarnin:
                coolToast.make("Warning", CoolToast.WARNING, CoolToast.LONG);

                break;
            case R.id.btnInfo:
                coolToast.make("Info", CoolToast.INFO, CoolToast.LONG);

                break;
            case R.id.btnPrimary:
                coolToast.make("Primary", CoolToast.PRIMARY, CoolToast.LONG);

                break;
            case R.id.btnLight:
                coolToast.make("Light", CoolToast.LIGHT, CoolToast.LONG);

                break;
            case R.id.btnDark:
                coolToast.make("Dark", CoolToast.DARK, CoolToast.LONG);

                break;
            case R.id.btnRounded:
                coolToast.setRounded(true);
                coolToast.make("Success", CoolToast.SUCCESS, CoolToast.LONG);

                break;
            case R.id.btnBOTTOM:
                coolToast.setPosition(CoolToast.BOTTOM);
                coolToast.make("Primary to BOTTOM", CoolToast.PRIMARY, CoolToast.LONG);

                break;
            case R.id.btnTOP:
                coolToast.setPosition(CoolToast.TOP);
                coolToast.make("Success to TOP", CoolToast.SUCCESS, CoolToast.LONG);

                break;
            case R.id.btnCENTER:
                coolToast.setPosition(CoolToast.CENTER);
                coolToast.make("Success to CENTER", CoolToast.SUCCESS, CoolToast.LONG);

                break;
            case R.id.btnCustomImage:
                coolToast.setIcon(R.drawable.like);
                coolToast.setPosition(CoolToast.CENTER);
                coolToast.setRounded(true);
                coolToast.setDuration(CoolToast.SHORT);
                coolToast.make("Info with image", CoolToast.INFO, CoolToast.LONG);

                break;

        }

    }

}
