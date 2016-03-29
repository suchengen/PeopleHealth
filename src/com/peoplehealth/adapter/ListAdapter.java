package com.peoplehealth.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class ListAdapter<T> extends BaseAdapter {

	protected List<T> mList;
	protected Context context;

	public ListAdapter(Context context, List<T> mList) {
		this.mList = mList;
		this.context = context;
	}

	public Context getContext() {
		return context;
	}

	public List<T> getList() {
		return mList;
	}

	@Override
	public int getCount() {
		return null == mList ? null : mList.size();
	}

	@Override
	public Object getItem(int position) {
		return null == mList ? null : mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public abstract View getView(int position, View convertView,
			ViewGroup parent);

}
