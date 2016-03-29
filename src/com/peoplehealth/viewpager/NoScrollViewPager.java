package com.peoplehealth.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollViewPager extends ViewPager {

	private boolean noScroll = true;

	public NoScrollViewPager(Context context) {
		super(context);
	}

	public NoScrollViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		if (noScroll) {
			return false;
		}
		return super.onTouchEvent(arg0);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		if (noScroll) {
			return false;
		}
		return super.onInterceptTouchEvent(arg0);
	}

	public boolean isNoScroll() {
		return noScroll;
	}

	public void setNoScroll(boolean noScroll) {
		this.noScroll = noScroll;
	}

}
