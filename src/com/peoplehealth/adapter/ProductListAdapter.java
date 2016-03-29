package com.peoplehealth.adapter;

import java.util.List;

import com.pepleohealth.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductListAdapter<T> extends ListAdapter<T> {

	public ProductListAdapter(Context context, List<T> mList) {
		super(context, mList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder = null;
		if (null == convertView) {
			holder = new Holder();
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_product_list, null);
			holder.imgIntro = (ImageView) convertView.findViewById(R.id.iv_item_product_list_intro);
			holder.tvAddCart = (TextView) convertView.findViewById(R.id.tv_item_product_list_add_cart);
			holder.tvName = (TextView) convertView.findViewById(R.id.tv_item_product_list_name);
			holder.tvPrice = (TextView) convertView.findViewById(R.id.tv_item_product_list_price);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}

		return convertView;
	}

	public class Holder {
		public ImageView imgIntro;
		public TextView tvName, tvPrice, tvAddCart;
	}

}
