package com.peoplehealth.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.peoplehealth.activity.OrderManagerActivity;
import com.pepleohealth.R;

public class PersonalCenterFragment extends Fragment implements OnClickListener {

	public final static String ORDER_MANAGER_INDEX = "ORDER_MANAGER_INDEX";
	public final static int ORDER_MANAGER_ALL_ORDER = 0;
	public final static int ORDER_MANAGER_WAIT_PAY = 1;
	public final static int ORDER_MANAGER_WAIT_SEND = 2;
	public final static int ORDER_MANAGER_WAIT_GET = 3;
	public final static int ORDER_MANAGER_WAIT_EVELATUE = 4;
	public final static int ORDER_MANAGER_REFUND = 5;

	private TextView btnAllOrders;
	private Button btnWaitPay, btnWaitSend, btnWaitGet, btnWaitEvaluate,
			btnRefund;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_personal_center, container,
				false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		initView();
	}

	private void initView() {
		btnAllOrders = (TextView) getView().findViewById(
				R.id.text_personal_center_check_all_orders);
		btnWaitPay = (Button) getView().findViewById(
				R.id.btn_personal_center_wait_pay);
		btnWaitSend = (Button) getView().findViewById(
				R.id.btn_personal_center_wait_send);
		btnWaitGet = (Button) getView().findViewById(
				R.id.btn_personal_center_wait_get);
		btnWaitEvaluate = (Button) getView().findViewById(
				R.id.btn_personal_center_wait_evaluate);
		btnRefund = (Button) getView().findViewById(
				R.id.btn_personal_center_refund);
		btnAllOrders.setOnClickListener(this);
		btnWaitPay.setOnClickListener(this);
		btnWaitSend.setOnClickListener(this);
		btnWaitGet.setOnClickListener(this);
		btnWaitEvaluate.setOnClickListener(this);
		btnRefund.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.text_personal_center_check_all_orders:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_ALL_ORDER);
			getContext().startActivity(intent);
			break;
		case R.id.btn_personal_center_wait_pay:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_WAIT_PAY);
			getContext().startActivity(intent);
			break;
		case R.id.btn_personal_center_wait_send:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_WAIT_SEND);
			getContext().startActivity(intent);
			break;
		case R.id.btn_personal_center_wait_get:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_WAIT_GET);
			getContext().startActivity(intent);
			break;
		case R.id.btn_personal_center_wait_evaluate:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_WAIT_EVELATUE);
			getContext().startActivity(intent);
			break;
		case R.id.btn_personal_center_refund:
			intent = new Intent(getContext(), OrderManagerActivity.class);
			intent.putExtra(ORDER_MANAGER_INDEX, ORDER_MANAGER_REFUND);
			getContext().startActivity(intent);
			break;
		}
	}
}
