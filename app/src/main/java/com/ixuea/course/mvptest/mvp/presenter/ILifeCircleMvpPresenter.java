package com.ixuea.course.mvptest.mvp.presenter;

import com.ixuea.course.mvptest.mvp.ILifeCircle;
import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.MvpControler;

import java.lang.ref.WeakReference;

/**
 * 生命周期MVP架构的P层
 */
public abstract class ILifeCircleMvpPresenter<T extends IMvpView> implements ILifeCircle {

    //关联View层通过弱引用
    protected WeakReference<T> weakReference;

    public ILifeCircleMvpPresenter() {
        super();
    }

    public ILifeCircleMvpPresenter(IMvpView iMvpView) {
        super();
        attachView(iMvpView);
        MvpControler mvpControler = iMvpView.getMvpControler();
        mvpControler.savePresenter(this);
    }

    @Override
    public void attachView(IMvpView iMvpView) {
        if (weakReference == null) {
            weakReference = new WeakReference(iMvpView);
        } else {
            T view = (T) weakReference.get();
            if (view != iMvpView) {
                weakReference = new WeakReference(iMvpView);
            }
        }
    }

    @Override
    public void onDestroy() {
        weakReference = null;
    }

    /**
     * 获取View层对象
     *
     * @return
     */
    protected T getView() {
        T view = weakReference != null ? (T) weakReference.get() : null;
        if (view == null) {
            return getEmptyView();
        }
        return view;
    }

    protected abstract T getEmptyView();
}
