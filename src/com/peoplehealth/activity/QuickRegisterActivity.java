package com.peoplehealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pepleohealth.R;

//快速注册
public class QuickRegisterActivity extends BaseActivity implements
		OnClickListener {

	private Button btnVertifyCode, btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quick_register);
		btnVertifyCode = (Button) findViewById(R.id.btn_quick_register_vertify_code);
		btnRegister = (Button) findViewById(R.id.btn_quick_register_finish_reqister);
		btnVertifyCode.setOnClickListener(this);
		btnRegister.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_quick_register_finish_reqister:
			goActivity();
			break;
		case R.id.btn_quick_register_vertify_code:
			break;
		}
	}

	private void goActivity() {
		Intent intent = new Intent(this, InterestingContentActivity.class);
		startActivity(intent);
	}
}
