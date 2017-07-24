package com.iswsc.smackdemo.util;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class MyToast {

	private static Toast toast;

	public static void showToastShort(Context context, String message) {
		try {
			if (TextUtils.isEmpty(message)) {
				return;
			}
			if (context != null) {
				if (toast == null) {
					toast = Toast
							.makeText(context, message, Toast.LENGTH_SHORT);
				} else {
					toast.setText(message);
				}
				toast.show();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		}
	}

	public static void showToastShort(Context context, int resId) {
		try {
			if (resId == 0) {
				return;
			}
			if (context != null) {
				if (toast == null) {
					toast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
				} else {
					toast.setText(resId);
				}
				toast.show();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		}
	}

	public static void showToastLong(Context context, String message) {
		try {
			if (TextUtils.isEmpty(message)) {
				return;
			}
			if (context != null) {
				if (toast == null) {
					toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
				} else {
					toast.setText(message);
				}
				toast.show();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		}
	}

	public static void showToastLong(Context context, int resId) {
		try {
			if (resId == 0) {
				return;
			}
			if (context != null) {
				if (toast == null) {
					toast = Toast.makeText(context, resId, Toast.LENGTH_LONG);
				} else {
					toast.setText(resId);
				}
				toast.show();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		}
	}
}
