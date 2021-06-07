package com.example.school_study_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity20 extends AppCompatActivity {

    protected VideoView mViedeoView = null;
    protected MediaPlayer mPlayer = null;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        
        getControls();
        prepareVideoViewVideo();
    }

    private void prepareVideoViewVideo() {
        Uri uri = Uri.parse("android.resource://" + getPackageName()+"/raw/videoplayback");
        mViedeoView.setVideoURI(uri);
        mViedeoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                playVideoView();
            }
        });
    }

    protected void playVideoView(){
        mViedeoView.start();
    }

    protected void stopVideoView(){
        mViedeoView.pause();
    }

    private void getControls() {
        Button btn = (Button)findViewById(R.id.btn_play);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideoView();
            }
        });

        btn = (Button)findViewById(R.id.btn_stop);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopVideoView();
            }
        });

        mViedeoView = (VideoView) findViewById(R.id.videoScreen);
    }
}