package com.ysantana.dagger_2_demo_preferences.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ysantana.dagger_2_demo_preferences.MyApplication;
import com.ysantana.dagger_2_demo_preferences.R;

import javax.inject.Inject;
import javax.inject.Singleton;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by ysantana on 20/10/2016.
 */
public class BFragment extends BaseFragment {

    public BFragment(){}

    @Inject
    SharedPreferences mPreferences;

    @BindView(R.id.text_stored)
    TextView mTextStored;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication) getActivity().getApplication()).getComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @OnClick(R.id.btn_refresh)
    public void onRefreshEvent() {
        mTextStored.setText(mPreferences.getString(PREF_INPUT, ""));
    }
}