package com.comm.util;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

/** 专门用于打印log */
public class LogUtil {
	private static boolean PRINT = true;

	public static void setPrint(boolean print) {
		PRINT = print;
	}

	public static void println(String message) {
		if (PRINT) {
			System.out.println(message);
		}
	}

	/***/
	public static void printLogD(String tag, String message) {
		if (PRINT) {
			Log.d(tag, message);
		}
	}

	/***/
	public static void printLogE(String tag, String message) {
		if (PRINT) {
			Log.e(tag, message);
		}
	}

	/***/
	public static void printLogV(String tag, String message) {
		if (PRINT) {
			Log.v(tag, message);
		}
	}

	/** 显示一个Toast 必须在主线程运行 */
	public static void showToast(String message, Context context) {
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}

	public static void showLongToast(String message, Context context) {
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	};

	public static Toast mToast;

	public static void showInstanceToast(int resId, Context context) {
		if (null == mToast || mToast.getView().getContext() != context) {
			mToast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(resId);
		}
		mToast.show();
	}

	public static void showInstanceToast(String message, Context context) {
		if (null == mToast || mToast.getView().getContext() != context) {
			mToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(message);
		}
		mToast.show();
	}

	/** 显示一个Toast 可以在非UI线程调用 */
	public static void showToast(final String message, final Context context,
			Handler mainHandler) {
		if (mainHandler != null) {
			mainHandler.post(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
				}
			});
		}
	}
}
