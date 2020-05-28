package com.ixuea.course.mvptest.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 基本界面
 */
public abstract class BaseActivity<P extends BasePresenter,CONTRACT> extends AppCompatActivity {

    public abstract CONTRACT getContract();

    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewID());
        initView();
        initData();
        initListener();
        mPresenter = getPresenter();
        mPresenter.bindView(this);
    }

    public abstract int getContentViewID();

    public abstract void initView();

    public abstract void initData();

    public abstract void initListener();

    public abstract void destroy();

    public abstract P getPresenter();

    public abstract <ERROR extends Object> void responseError(ERROR error, Throwable throwable);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }


}
