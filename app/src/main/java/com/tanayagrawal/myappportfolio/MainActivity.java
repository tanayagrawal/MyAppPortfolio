package com.tanayagrawal.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.spotify_streamer_button)
    Button spotifyStreamerButton;

    @Bind(R.id.scores_app_button)
    Button scoresAppButton;

    @Bind(R.id.library_app_button)
    Button libraryAppButton;

    @Bind(R.id.build_bigger_button)
    Button buildBiggerButton;

    @Bind(R.id.xyz_reader_button)
    Button xyzReaderButton;

    @Bind(R.id.capstone_button)
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.spotify_streamer_button)
    public void spotifyStreamerButtonClicked(){
        createToastMessage(getString(R.string.spotify_streamer));
    }

    @OnClick(R.id.scores_app_button)
    public void scoresAppButtonClicked(){
        createToastMessage(getString(R.string.scores_app));
    }

    @OnClick(R.id.library_app_button)
    public void libraryAppButtonClicked(){
        createToastMessage(getString(R.string.library_app));
    }

    @OnClick(R.id.build_bigger_button)
    public void buildBiggerButtonClicked(){
        createToastMessage(getString(R.string.build_it_bigger));
    }

    @OnClick(R.id.xyz_reader_button)
    public void xyzReaderButtonClicked(){
        createToastMessage(getString(R.string.xyz_reader));
    }

    @OnClick(R.id.capstone_button)
    public void capstoneButtonClicked(){
        createToastMessage(getString(R.string.capstone));
    }

    private void createToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
