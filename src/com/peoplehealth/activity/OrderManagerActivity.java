package com.peoplehealth.activity;

import java.util.ArrayList;

import com.peoplehealth.adapter.BaseFragmentPagerAdapter;
import com.peoplehealth.fragment.OrderManagerAllFragment;
import com.peoplehealth.fragment.OrderManagerNoEvelauteFragment;
import com.peoplehealth.fragment.OrderManagerNoGetFragment;
import com.peoplehealth.fragment.OrderManagerNoPayFragment;
import com.peoplehealth.fragment.OrderManagerNoSendFragment;
import com.peoplehealth.fragment.OrderManagerRefundFragment;
import com.peoplehealth.main.fragment.PersonalCenterFragment;
import com.pepleohealth.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

//订单管理
public class OrderManagerActivity extends BaseActivity implements
		OnPageChangeListener, OnClickListener {

	private ViewPager mViewPager;
	private ArrayList<Fragment> mList;
	private TextView btnAll, btnNoPay, btnNoSend, btnNoGet, btnNoEvelaute,
			btnRefund;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_manager);
		initView();
		setStartPager();
	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.vp_order_manager);
		mViewPager.addOnPageChangeListener(this);
		mList = new ArrayList<Fragment>();
		mList.add(new OrderManagerAllFragment());
		mList.add(new OrderManagerNoPayFragment());
		mList.add(new OrderManagerNoSendFragment());
		mList.add(new OrderManagerNoGetFragment());
		mList.add(new OrderManagerNoEvelauteFragment());
		mList.add(new OrderManagerRefundFragment());

		mViewPager.setAdapter(new BaseFragmentPagerAdapter(
				getSupportFragmentManager(), mList));

		btnAll = (TextView) findViewById(R.id.tv_order_manager_all);
		btnNoPay = (TextView) findViewById(R.id.tv_order_manager_no_pay);
		btnNoSend = (TextView) findViewById(R.id.tv_order_manager_no_send);
		btnNoGet = (TextView) findViewById(R.id.tv_order_manager_no_get);
		btnNoEvelaute = (TextView) findViewById(R.id.tv_order_manager_no_evelaute);
		btnRefund = (TextView) findViewById(R.id.tv_order_manager_no_refund);
		btnAll.setOnClickListener(this);
		btnNoPay.setOnClickListener(this);
		btnNoSend.setOnClickListener(this);
		btnNoGet.setOnClickListener(this);
		btnNoEvelaute.setOnClickListener(this);
		btnRefund.setOnClickListener(this);
	}

	private void setStartPager() {
		int index = getIntent().getIntExtra(
				PersonalCenterFragment.ORDER_MANAGER_INDEX,
				PersonalCenterFragment.ORDER_MANAGER_ALL_ORDER);
		mViewPager.setCurrentItem(index);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_order_manager_all:
			if (0 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(0);
			}
			break;
		case R.id.tv_order_manager_no_pay:
			if (1 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(1);
			}
			break;
		case R.id.tv_order_manager_no_send:
			if (2 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(2);
			}
			break;
		case R.id.tv_order_manager_no_get:
			if (3 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(3);
			}
			break;
		case R.id.tv_order_manager_no_evelaute:
			if (4 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(4);
			}
			break;
		case R.id.tv_order_manager_no_refund:
			if (5 != mViewPager.getCurrentItem()) {
				mViewPager.setCurrentItem(5);
			}
			break;
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}

	@Override
	public void onPageSelected(int arg0) {

	}

}
