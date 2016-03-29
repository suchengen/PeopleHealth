package com.peoplehealth.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {

	ArrayList<Fragment> mList;

	public BaseFragmentPagerAdapter(FragmentManager fm,
			ArrayList<Fragment> mList) {
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
