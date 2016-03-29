package com.peoplehealth.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.peoplehealth.adapter.BaseFragmentPagerAdapter;
import com.peoplehealth.fragment.ProductListDefaultFragment;
import com.peoplehealth.fragment.ProductListPriceFragment;
import com.peoplehealth.fragment.ProductListSalesFragment;
import com.pepleohealth.R;

public class ProductListActivity extends BaseActivity implements
		OnPageChangeListener, OnClickListener {

	private TextView tvDefault, tvPrice, tvSales;
	private ViewPager mViewPager;
	private ArrayList<Fragment> mList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product_list);
		initView();
	}

	private void initView() {
		tvDefault = (TextView) findViewById(R.id.tv_product_list_default);
		tvPrice = (TextView) findViewById(R.id.tv_product_list_price);
		tvSales = (TextView) findViewById(R.id.tv_product_list_sales);
		tvDefault.setOnClickListener(this);
		tvPrice.setOnClickListener(this);
		tvSales.setOnClickListener(this);
		mViewPager = (ViewPager) findViewById(R.id.vp_product_list);
		mViewPager.addOnPageChangeListener(this);
		mList = new ArrayList<Fragment>();
		mList.add(new ProductListDefaultFragment());
		mList.add(new ProductListPriceFragment());
		mList.add(new ProductListSalesFragment());
		mViewPager.setAdapter(new BaseFragmentPagerAdapter(
				getSupportFragmentManager(), mList));
		mViewPager.setCurrentItem(0);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_product_list_default:
			if (0 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(0);
			}
			break;
		case R.id.tv_product_list_price:
			if (1 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(1);
			}
			break;
		case R.id.tv_product_list_sales:
			if (2 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(2);
			}
			break;
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int arg0) {

	}

}
