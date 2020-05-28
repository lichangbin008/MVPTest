package com.ixuea.course.mvptest.splash;

import android.os.Bundle;
import android.widget.TextView;

import com.ixuea.course.mvptest.R;
import com.ixuea.course.mvptest.mvp.view.LifeCircleMvpActivity;

public class SplashActivity extends LifeCircleMvpActivity implements ISplashContract.IView{

    //倒计时控件
    private TextView tvCountDowm;

    //闪屏页P层对象
    private ISplashContract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvCountDowm = findViewById(R.id.tv_count_down);

        mPresenter = new SplashPresenter(this);

        initTimer();
    }

    /**
     * 初始化定时器
     */
    private void initTimer() {
        mPresenter.initTimer();
    }

    @Override
    public void setTimer(String timer) {
        tvCountDowm.setText(timer);
    }


}
