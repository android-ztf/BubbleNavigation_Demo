package com.wd.bubblenavigation_demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.wd.bubblenavigation_demo.R;

/**
 * AUTHOR: MR.Zhang
 * DATE:2020-8-26
 * INTRODUCE：$
 */
public class ScreenSlidePageFragment extends Fragment {

    private String mTitle;
    private int mColor;

    public ScreenSlidePageFragment(String title, int color) {
        mTitle = title;
        mColor = color;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_screenslidepage, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_fragment);
        textView.setText(mTitle);
        view.setBackgroundColor(ContextCompat.getColor(getActivity(),mColor));
        return view;
    }
}
