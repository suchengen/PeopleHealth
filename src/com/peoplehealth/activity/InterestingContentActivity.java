package com.peoplehealth.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pepleohealth.R;

//选择您感兴趣内容
public class InterestingContentActivity extends BaseActivity implements
		OnClickListener {

	private Button btnFinish;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interesting_content);
		btnFinish = (Button) findViewById(R.id.btn_interesting_content_finish);
		btnFinish.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == btnFinish.getId()) {
			goActivity();
		}
	}

	private void goActivity() {
		Intent intent = new Intent(this, CompleteBaseInfoActivity.class);
		startActivity(intent);
	}
}
