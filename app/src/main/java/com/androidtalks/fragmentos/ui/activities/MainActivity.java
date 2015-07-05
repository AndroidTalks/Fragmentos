package com.androidtalks.fragmentos.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.androidtalks.fragmentos.R;
import com.androidtalks.fragmentos.ui.fragments.CommunicationFragment;


public class MainActivity extends AppCompatActivity implements CommunicationFragment.OnFragmentClickListener{

    private TextView messageFromFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageFromFragment = (TextView)findViewById(R.id.activity_text_view);
    }

    @Override
    public void onFragmentClick() {
        messageFromFragment.setText("Received message from Fragment");
    }
}
