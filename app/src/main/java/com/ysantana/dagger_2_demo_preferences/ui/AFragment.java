package com.ysantana.dagger_2_demo_preferences.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ysantana.dagger_2_demo_preferences.MyApplication;
import com.ysantana.dagger_2_demo_preferences.R;
import javax.inject.Inject;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by ysantana on 20/10/2016.
 */
public class AFragment extends BaseFragment {

    public AFragment(){}

    @Inject
    SharedPreferences mPreferences;

    @BindView(R.id.texto)
    EditText mTexto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication) getActivity().getApplication()).getComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @OnClick(R.id.btn_storage)
    public void onStorageEvent() {
        String text = mTexto.getText().toString().trim();
        if (!TextUtils.isEmpty(text)) {
            mPreferences.edit()
                    .putString(PREF_INPUT, text)
                    .apply();
        }
    }
}