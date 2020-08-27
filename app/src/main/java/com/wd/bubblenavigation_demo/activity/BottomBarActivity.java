package com.wd.bubblenavigation_demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.wd.bubblenavigation_demo.R;
import com.wd.bubblenavigation_demo.adapter.ScreenSlidePageFragmentAdapter;
import com.wd.bubblenavigation_demo.fragment.ScreenSlidePageFragment;

import java.util.ArrayList;
import java.util.List;

public class BottomBarActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private BubbleNavigationLinearView mBubbleNavigationLinearView;
    private List<Fragment> mFragmentList = new ArrayList<>();
    private ScreenSlidePageFragmentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);

        mViewPager = (ViewPager) findViewById(R.id.view_pager_bottom);
        mBubbleNavigationLinearView = (BubbleNavigationLinearView) findViewById(R.id.bottom_navigation_view_linear);

        // TODO 添加所需的Fragment
        mFragmentList.add(new ScreenSlidePageFragment(getString(R.string.home), R.color.red_inactive));
        mFragmentList.add(new ScreenSlidePageFragment(getString(R.string.search), R.color.blue_inactive));
        mFragmentList.add(new ScreenSlidePageFragment(getString(R.string.likes), R.color.blue_grey_inactive));
        mFragmentList.add(new ScreenSlidePageFragment(getString(R.string.notification), R.color.green_inactive));
        mFragmentList.add(new ScreenSlidePageFragment(getString(R.string.profile), R.color.purple_inactive));

        // TODO 设置适配器
        mAdapter = new ScreenSlidePageFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(mAdapter);

        // TODO viewpager滑动切换并改变导航栏
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBubbleNavigationLinearView.setCurrentActiveItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // TODO 导航栏切换改变Viewpager
        mBubbleNavigationLinearView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                mViewPager.setCurrentItem(position,true);
            }
        });

    }

}
