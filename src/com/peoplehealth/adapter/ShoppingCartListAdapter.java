package com.peoplehealth.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class ShoppingCartListAdapter<T> extends ListAdapter<T> {

	public ShoppingCartListAdapter(Context context, List<T> mList) {
		super(context, mList);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}

}
