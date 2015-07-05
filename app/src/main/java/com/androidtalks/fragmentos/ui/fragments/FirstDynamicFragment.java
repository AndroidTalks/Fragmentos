package com.androidtalks.fragmentos.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidtalks.fragmentos.R;

/**
 * Created by leonelmendez on 05/07/15.
 */
public class FirstDynamicFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_dymic_fragment_layout,container,false);
    }

}
