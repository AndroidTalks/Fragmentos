package com.androidtalks.fragmentos.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.androidtalks.fragmentos.R;

/**
 * Created by leonelmendez on 05/07/15.
 */
public class StateFragment extends Fragment {

    private EditText firstEdit,secondEdit;
    private static final String FIRST_EDIT_TAG = "first_edit";
    private static final String SECOND_EDIT_TAG = "second_edit";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.state_fragment_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstEdit = (EditText)view.findViewById(R.id.first_edit);
        secondEdit = (EditText)view.findViewById(R.id.second_edit);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null){
            firstEdit.setText(savedInstanceState.getString(FIRST_EDIT_TAG));
            secondEdit.setText(savedInstanceState.getString(SECOND_EDIT_TAG));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(FIRST_EDIT_TAG,firstEdit.getText().toString());
        outState.putString(SECOND_EDIT_TAG,firstEdit.getText().toString());

    }
}
