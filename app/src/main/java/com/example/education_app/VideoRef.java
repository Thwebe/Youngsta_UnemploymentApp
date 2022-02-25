package com.example.education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoRef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_ref);

        VideoView videoView=findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.timemanagement);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);


        VideoView videoView2=findViewById(R.id.videoView2);
        videoView2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.landingajob);
        MediaController mediaController2=new MediaController(this);
        mediaController2.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController2);


        VideoView videoView3=findViewById(R.id.videoView3);
        videoView3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.success);
        MediaController mediaController3=new MediaController(this);
        mediaController3.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController3);

    }
}