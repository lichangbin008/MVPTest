package com.ixuea.course.mvptest.base;

/**
 * 基本Presenter
 */
public abstract class BasePresenter<V extends BaseActivity, M extends BaseModel,CONTRACT> extends SuperBase<CONTRACT> {

    public V mView;

    public M mModel;

    /**
     * 构造方法
     */
    public BasePresenter() {
        this.mModel = getmModelInstance();
    }

    /**
     * 绑定View
     *
     * @param mView
     */
    public void bindView(V mView) {
        this.mView = mView;
    }

    /**
     * 解绑View
     */
    public void unbindView() {
        this.mView = null;
    }

    public abstract M getmModelInstance();
}
