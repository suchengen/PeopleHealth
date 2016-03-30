package com.peoplehealth.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.peoplehealth.activity.ProductDetailActivity;
import com.peoplehealth.adapter.ProductListAdapter;
import com.pepleohealth.R;

public class ProductListDefaultFragment extends Fragment implements
		OnItemClickListener {

	private ListView mListView;
	private ProductListAdapter<String> mAdapter;
	private List<String> mList;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_product_list_default,
				container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		initView();
		for (int i = 0; i < 20; ++i) {
			mList.add("");
		}
		mAdapter.notifyDataSetChanged();
	}

	private void initView() {
		mListView = (ListView) getView().findViewById(
				R.id.list_product_list_default);
		mListView.setOnItemClickListener(this);
		mList = new ArrayList<String>();
		mAdapter = new ProductListAdapter<String>(getContext(), mList);
		mListView.setAdapter(mAdapter);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent intent = new Intent(getActivity(), ProductDetailActivity.class);
		getActivity().startActivity(intent);
	}
}
