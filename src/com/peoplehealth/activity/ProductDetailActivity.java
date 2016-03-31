package com.peoplehealth.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

import com.peoplehealth.adapter.BaseFragmentPagerAdapter;
import com.peoplehealth.fragment.ProductDetailEvelauteFragment;
import com.peoplehealth.fragment.ProductDetailImageFragment;
import com.peoplehealth.fragment.ProductDetailParamsFragment;
import com.pepleohealth.R;
import com.zhy.view.SimpleViewPagerIndicator;

public class ProductDetailActivity extends BaseActivity implements
		OnPageChangeListener {

	private String[] mTitles = new String[] { "图文详情", "产品参数", "产品评价" };
	private SimpleViewPagerIndicator mIndicator;
	private ViewPager mViewPager;

	private ArrayList<Fragment> mList;
	private BaseFragmentPagerAdapter mFragmentAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product_detail);

		initViews();
		initDatas();
		initEvents();
	}

	private void initEvents() {
		mViewPager.addOnPageChangeListener(this);
	}

	private void initDatas() {
		mIndicator.setTitles(mTitles);

		mList = new ArrayList<Fragment>();
		mList.add(new ProductDetailImageFragment());
		mList.add(new ProductDetailParamsFragment());
		mList.add(new ProductDetailEvelauteFragment());

		mFragmentAdapter = new BaseFragmentPagerAdapter(
				getSupportFragmentManager(), mList);

		mViewPager.setAdapter(mFragmentAdapter);
		mViewPager.setCurrentItem(0);
	}

	private void initViews() {
		mIndicator = (SimpleViewPagerIndicator) findViewById(R.id.id_stickynavlayout_indicator);
		mViewPager = (ViewPager) findViewById(R.id.id_stickynavlayout_viewpager);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {
		mIndicator.scroll(position, positionOffset);
	}

	@Override
	public void onPageSelected(int arg0) {

	}

}
