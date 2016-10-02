package com.shashank.musicplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button mPlayButton;
	Button mPauseButton;
	Button mForwardButton;
	Button mRewindButton;
	MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mPlayButton = (Button) findViewById(R.id.button1);
        mPauseButton = (Button) findViewById(R.id.button2);
        mForwardButton = (Button) findViewById(R.id.button3);
        mForwardButton = (Button) findViewById(R.id.button4);
        mMediaPlayer=MediaPlayer.create(this, R.raw.a);
    mPlayButton.setOnClickListener(new OnClickListener(){
    	@override
    	public void onClick(View V){
    		Toast.makeText(MainActivity.this, "playing music", Toast.LENGTH_SHORT).show();
    		mMediaPlayer.start();
    	}
    });
    
    mPlayButton.setOnClickListener(new OnClickListener(){
    	@override
    	public void onClick(View V){
    		Toast.makeText(MainActivity.this, "pausing music", Toast.LENGTH_SHORT).show();
    		mMediaPlayer.pause();
    		
    	}
    });
    mPlayButton.setOnClickListener(new OnClickListener(){
    	@override
    	public void onClick(View V){
    		Toast.makeText(MainActivity.this, "forwarding music", Toast.LENGTH_SHORT).show();
    		mMediaPlayer.seekTo();
    	}
    });
    mPlayButton.setOnClickListener(new OnClickListener(Cur+10000){
    	@override
    	public void onClick(View V){
    		Toast.makeText(MainActivity.this, "rewinding music", Toast.LENGTH_SHORT).show();
    		mMediaPlayer.seekTo(cur-10000);
    	}
    });
    
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
