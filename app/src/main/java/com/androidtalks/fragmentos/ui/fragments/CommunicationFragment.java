package com.androidtalks.fragmentos.ui.fragments;

import android.app.Activity;
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
public class CommunicationFragment extends Fragment {

    private OnFragmentClickListener onFragmentClickListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            onFragmentClickListener = (OnFragmentClickListener)activity;
        }catch(ClassCastException e){
            throw new ClassCastException(CommunicationFragment.class.getSimpleName() + "must be implement OnFragmentClickListener");
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.communication_fragment_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.send_message_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentClickListener.onFragmentClick();
            }
        });
    }

    public interface OnFragmentClickListener{
        void onFragmentClick();
    }
}
