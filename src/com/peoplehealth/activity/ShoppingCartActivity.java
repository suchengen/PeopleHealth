package com.peoplehealth.activity;

import java.util.List;

import android.os.Bundle;
import android.widget.ListView;

import com.pepleohealth.R;

public class ShoppingCartActivity extends BaseActivity {

	private ListView mListView;
	private List<String> mList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shopping_cart);
	}
}
