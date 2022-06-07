package com.tyky.easyutil;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

public class EasyDialog {
    public static void showDialog(final Context context) {
        AlertDialog dialog = new AlertDialog.Builder(context)
//                .setIcon(R.mipmap.icon)//设置标题的图片
                .setTitle("我是对话框")//设置对话框的标题
                .setMessage("我是对话框的内容")//设置对话框的内容
                //设置对话框的按钮
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "点击了确定的按钮", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).create();
        dialog.show();

    }


}
