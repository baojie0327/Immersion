package com.jackson.immersion.fragment; /**
 * Fragment2  2017-09-12
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jackson.immersion.R;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2017 09 12
 */
public class Fragment2 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=   inflater.inflate(R.layout.fragment2_layout, null);
        return view;
    }

}

