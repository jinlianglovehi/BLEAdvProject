package com.huami.watch.bleadv;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.huami.watch.bleadv.services.BLEAdvService;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private Handler handler  = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.start_service)
    public void startSerivce(){

        Intent intent = new Intent(MainActivity.this, BLEAdvService.class) ;
        startService(intent);

        handler.removeCallbacks(runnable);

        handler.postDelayed(runnable,1000);

    }


    @OnClick(R.id.clear_handler)
    public void clearHandler(){


        handler.removeCallbacks(runnable);
    }
    
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Log.i(TAG, "run: runing ");
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
