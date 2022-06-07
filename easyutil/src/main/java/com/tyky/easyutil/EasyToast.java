package com.tyky.easyutil;

import android.content.Context;
import android.widget.Toast;

public class EasyToast {
    public static void show(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(final Context context, final CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
