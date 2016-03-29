package com.peoplehealth.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class WelcomePageAdapter extends FragmentPagerAdapter {

	ArrayList<Fragment> mList;

	public WelcomePageAdapter(FragmentManager fm, ArrayList<Fragment> mList) {
		super(fm);
		this.mList = mList;
	}

	@Override
	public Fragment getItem(int arg0) {
		return mList.get(arg0);
	}

	@Override
	public int getCount() {
		return null == mList ? 0 : mList.size();
	}

}
