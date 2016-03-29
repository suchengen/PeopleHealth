package com.peoplehealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.comm.util.SharedPreferencesUtil;
import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.HttpUtils;
import com.pepleohealth.R;

// 闪屏页。。。启动页
public class FirstStartActivity extends BaseActivity {

	public static final String FIRST_START = "first_start";
	public static final int DELAY_MILLES = 1000;

	public static final String saveVerKey = "saveVerKey";
	public static final String FirstStartImageCache = "FirstStartImageCache";
	private BitmapUtils bitmapUtils;
	private HttpUtils http;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_first_start);
		downloadAdsImage();
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				startActivity();
			}
		}, DELAY_MILLES);
	}

	private void downloadAdsImage() {

	}

	private void startActivity() {
		Intent intent;
		intent = new Intent(this, WelcomeActivity.class);
		// if (SharedPreferencesUtil.getBoolean(this, FIRST_START, true)) {
		// intent = new Intent(this, WelcomeActivity.class);
		// } else {
		// intent = new Intent(this, MainActivity.class);
		// }
		startActivity(intent);
		this.finish();
	}

	@Override
	public void onBackPressed() {
	}
}
