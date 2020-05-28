package com.ixuea.course.mvptest.mvp.base;

import android.content.Intent;
import android.os.Bundle;

import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.model.BaseModel;
import com.ixuea.course.mvptest.mvp.presenter.ILifeCircleMvpPresenter;

/**
 * P层中间类
 */
public abstract class BaseMvpPresenter<T extends IMvpView,M extends BaseModel> extends ILifeCircleMvpPresenter<T> {

    public M mModel;

    public BaseMvpPresenter(T view){
        super(view);
        this.mModel = getModelInstance();
    }

    public abstract M getModelInstance();

    @Override
    public void onCreate(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void destroyView() {

    }

    @Override
    public void onDestroyView() {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
