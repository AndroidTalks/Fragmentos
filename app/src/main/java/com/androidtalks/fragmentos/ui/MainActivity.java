package com.androidtalks.fragmentos.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidtalks.fragmentos.R;
import com.androidtalks.fragmentos.ui.fragments.FirstDynamicFragment;
import com.androidtalks.fragmentos.ui.fragments.SecondDynamicFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view){
        addFragmentWithFragmentManager(new FirstDynamicFragment());
    }

    public void replaceFragment(View view){
        replaceFragmentWithFragmentManager(new SecondDynamicFragment());
    }

    private void addFragmentWithFragmentManager(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.add(R.id.fragment_container,fragment);
        fragmentTransaction.add(R.id.fragment_container,fragment,"add_fragment");
        fragmentTransaction.commit();
        printHowManyFragmentsAre();
    }

    private void replaceFragmentWithFragmentManager(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.replace(R.id.fragment_container, fragment, "replace_fragment");
        //fragmentTransaction.addToBackStack("replace_fragment");
        fragmentTransaction.commit();
        printHowManyFragmentsAre();
    }

    private void printHowManyFragmentsAre(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Log.d(MainActivity.class.getSimpleName(),""+fragmentManager.getBackStackEntryCount());
    }
}
