package com.peoplehealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pepleohealth.R;

//完善基本信息
public class CompleteBaseInfoActivity extends BaseActivity implements
		OnClickListener {

	private Button btnFinish;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complete_base_info);
		btnFinish = (Button) findViewById(R.id.btn_complete_base_info_finish);
		btnFinish.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == btnFinish.getId()) {
			goActivity();
		}
	}

	private void goActivity() {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
