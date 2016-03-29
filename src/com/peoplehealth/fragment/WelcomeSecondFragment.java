package com.peoplehealth.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.peoplehealth.activity.LoginActivity;
import com.peoplehealth.activity.WelcomeActivity;
import com.pepleohealth.R;

public class WelcomeSecondFragment extends Fragment {

	private Button btnStart;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_welcome_second, container,
				false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		btnStart = (Button) getView().findViewById(
				R.id.btn_fragment_welcome_second_main);
		btnStart.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getContext(), LoginActivity.class);
				getContext().startActivity(intent);
				((WelcomeActivity) getContext()).finish();
			}
		});
	}
}
