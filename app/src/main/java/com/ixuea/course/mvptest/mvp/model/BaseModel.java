package com.ixuea.course.mvptest.mvp.model;

import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.base.BaseMvpPresenter;

/**
 * 基础M层
 */
public abstract class BaseModel<P extends BaseMvpPresenter> {

    public P mPresenter;

    public BaseModel(P mPresenter) {
        this.mPresenter = mPresenter;
    }
}
