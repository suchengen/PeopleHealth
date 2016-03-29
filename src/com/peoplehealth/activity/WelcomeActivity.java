package com.peoplehealth.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.WindowManager;

import com.comm.util.SharedPreferencesUtil;
import com.peoplehealth.adapter.WelcomePageAdapter;
import com.peoplehealth.fragment.WelcomeFirstFragment;
import com.peoplehealth.fragment.WelcomeSecondFragment;
import com.peoplehealth.viewpager.NoScrollViewPager;
import com.pepleohealth.R;

//欢迎引导页
public class WelcomeActivity extends BaseActivity {

	public static final String FIRST_START = "first_start";
	public static final int DELAY_MILLES = 1000;

	private NoScrollViewPager mViewPager;
	private ArrayList<Fragment> mList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_welcome);
		setFirstStart();

		mViewPager = (NoScrollViewPager) findViewById(R.id.welcome_viewpage);
		mList = new ArrayList<Fragment>();
		mList.add(new WelcomeFirstFragment());
		mList.add(new WelcomeSecondFragment());
		mViewPager.setAdapter(new WelcomePageAdapter(
				getSupportFragmentManager(), mList));
		mViewPager.setCurrentItem(0);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				mViewPager.setCurrentItem(1);
			}
		}, DELAY_MILLES);

	}

	public void setFirstStart() {
		SharedPreferencesUtil.save(this, FIRST_START, false);
	}
}
