package com.peoplehealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pepleohealth.R;

//登陆页面
public class LoginActivity extends BaseActivity implements OnClickListener {

	private Button btnLogin, btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btnLogin = (Button) findViewById(R.id.btn_login_login);
		btnRegister = (Button) findViewById(R.id.btn_login_phone_register);
		btnLogin.setOnClickListener(this);
		btnRegister.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login_login:
			goMainActivity();
			break;
		case R.id.btn_login_phone_register:
			goRegisterActivity();
			break;
		}
	}

	private void goMainActivity() {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	private void goRegisterActivity() {
		Intent intent = new Intent(this, QuickRegisterActivity.class);
		startActivity(intent);
	}
}
