package com.ryan.opengles.sample01;

import android.content.Context;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLSurfaceView extends GLSurfaceView {

    final float ANGLE_SPAN = 0.375f;

    RotateThread rthread;

    SceneRenderer mRenderer;//自定义渲染器的引用

    public MyGLSurfaceView(Context context) {
        super(context);
        // 设置opengl es版本为3.0
        this.setEGLContextClientVersion(3);

        mRenderer=new SceneRenderer();
        this.setRenderer(mRenderer);
        this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }

    private class SceneRenderer implements GLSurfaceView.Renderer
    {
        public void onDrawFrame(GL10 gl)
        {
            //清除深度缓冲与颜色缓冲
            GLES30.glClear( GLES30.GL_DEPTH_BUFFER_BIT | GLES30.GL_COLOR_BUFFER_BIT);


        }
        public void onSurfaceChanged(GL10 gl, int width, int height)
        {

        }
        public void onSurfaceCreated(GL10 gl, EGLConfig config)
        {

        }
    }
    public class RotateThread extends Thread//自定义的内部类线程
    {
        public boolean flag=true;
        @Override
        public void run()//重写的run方法
        {
            while(flag)
            {

            }
        }
    }


}
