package com.peoplehealth.activity;

import com.comm.util.LogUtil;
import com.peopel.constants.Constants;
import com.pepleohealth.R;
import com.tencent.mm.sdk.constants.Build;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

//订单确认
public class OrderCheckInActivity extends BaseActivity {

	public final static int PAY_WAY_WX = 0;
	public final static int PAY_WAY_ZFB = 1;

	private ListView mListView;
	private Button btnSubmitOrder, btnContinueShop;
	private RadioGroup rgPayWay;

	private IWXAPI iWXAPI;

	private int payWay = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_check_in);
		initView();
		initEvent();
		initData();
	}

	private void initView() {
		mListView = (ListView) findViewById(R.id.list_order_check_in);
		btnContinueShop = (Button) findViewById(R.id.btn_order_check_in_continue_shop);
		btnSubmitOrder = (Button) findViewById(R.id.btn_order_check_in_submit_order);
		rgPayWay = (RadioGroup) findViewById(R.id.rg_pay_way);
	}

	private void initEvent() {
		btnContinueShop.setOnClickListener(onClickListener);
		btnSubmitOrder.setOnClickListener(onClickListener);
		rgPayWay.setOnCheckedChangeListener(onCheckedChangeListener);
	}

	private void initData() {
		iWXAPI = WXAPIFactory.createWXAPI(this, Constants.WX_APP_ID);
		iWXAPI.registerApp(Constants.WX_APP_ID);
	}

	private void payByWX() {
		boolean isPaySupported = iWXAPI.getWXAppSupportAPI() >= Build.PAY_SUPPORTED_SDK_INT;
		if (!isPaySupported) {
			LogUtil.showInstanceToast("" + isPaySupported, this);
			return;
		}
		
	}

	private void payByZFB() {

	}

	public OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {

		}
	};

	public OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch (checkedId) {
			case R.id.rb_pay_way_wx:
				payWay = PAY_WAY_WX;
				break;
			case R.id.rb_pay_way_zfb:
				payWay = PAY_WAY_ZFB;
			default:
				payWay = PAY_WAY_WX;
				break;
			}
		}
	};

}
