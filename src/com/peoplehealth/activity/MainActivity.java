package com.peoplehealth.activity;

import com.peoplehealth.main.fragment.HealthNewsFragment;
import com.peoplehealth.main.fragment.MainFragment;
import com.peoplehealth.main.fragment.MyHealthFragment;
import com.peoplehealth.main.fragment.PersonalCenterFragment;
import com.pepleohealth.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity implements OnCheckedChangeListener {

	public final static int MAIN_FRAGMENT = 0;
	public final static int MY_HEALTH_FRAGMENT = 1;
	public final static int HEALTH_NEWS_FRAGMENT = 2;
	public final static int PERSONAL_CENTER_FRAGMENT = 3;

	private RadioGroup tabRadioGroup;

	private Fragment mMainFragment, mMyHealthFragment, mHealthNewsFragment, mPersonalCenterFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		initFragment(0);
	}

	private void initView() {
		tabRadioGroup = (RadioGroup) findViewById(R.id.tab_menu);
		tabRadioGroup.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rbtn_main:
			initFragment(MAIN_FRAGMENT);
			break;
		case R.id.rbtn_my_health:
			initFragment(MY_HEALTH_FRAGMENT);
			break;
		case R.id.rbtn_health_news:
			initFragment(HEALTH_NEWS_FRAGMENT);
			break;
		case R.id.rbtn_personal_center:
			initFragment(PERSONAL_CENTER_FRAGMENT);
			break;
		}
	}

	private void initFragment(int index) {
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		hideFragment(transaction);
		switch (index) {
		case MAIN_FRAGMENT:
			if (null == mMainFragment) {
				mMainFragment = new MainFragment();
				transaction.add(R.id.main_content, mMainFragment);
			} else {
				transaction.show(mMainFragment);
			}
			break;
		case MY_HEALTH_FRAGMENT:
			if (null == mMyHealthFragment) {
				mMyHealthFragment = new MyHealthFragment();
				transaction.add(R.id.main_content, mMyHealthFragment);
			} else {
				transaction.show(mMyHealthFragment);
			}
			break;
		case HEALTH_NEWS_FRAGMENT:
			if (null == mHealthNewsFragment) {
				mHealthNewsFragment = new HealthNewsFragment();
				transaction.add(R.id.main_content, mHealthNewsFragment);
			} else {
				transaction.show(mHealthNewsFragment);
			}
			break;
		case PERSONAL_CENTER_FRAGMENT:
			if (null == mPersonalCenterFragment) {
				mPersonalCenterFragment = new PersonalCenterFragment();
				transaction.add(R.id.main_content, mPersonalCenterFragment);
			} else {
				transaction.show(mPersonalCenterFragment);
			}
			break;
		}
		transaction.commit();
	}

	private void hideFragment(FragmentTransaction transaction) {
		if (null != mMainFragment) {
			transaction.hide(mMainFragment);
		}
		if (null != mMyHealthFragment) {
			transaction.hide(mMyHealthFragment);
		}
		if (null != mHealthNewsFragment) {
			transaction.hide(mHealthNewsFragment);
		}
		if (null != mPersonalCenterFragment) {
			transaction.hide(mPersonalCenterFragment);
		}
	}

}
