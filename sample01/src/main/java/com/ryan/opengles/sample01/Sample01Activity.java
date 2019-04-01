package com.ryan.opengles.sample01;

import android.app.Activity;
import android.os.Bundle;

public class Sample01Activity extends Activity {

    private MyGLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);
        mGLView.requestFocus(); // 获取焦点
        mGLView.setFocusable(true); // 设置为可以触控
        setContentView(mGLView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLView.onResume(); // 开始渲染
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLView.onPause(); // 停止渲染
    }
}
