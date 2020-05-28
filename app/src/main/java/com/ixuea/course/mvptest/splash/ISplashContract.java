package com.ixuea.course.mvptest.splash;

import com.ixuea.course.mvptest.mvp.ILifeCircle;
import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.MvpControler;

/**
 * 闪屏页契约接口
 */
public interface ISplashContract {

    /**
     * V层契约接口
     */
    interface IView extends IMvpView{
        /**
         * 设置倒计时显示
         * @param timer
         */
        void setTimer(String timer);
    }

    /**
     * P层契约接口
     */
    interface IPresenter extends ILifeCircle {
        /**
         * 初始化计时器
         */
        void initTimer();
    }

    IView emptyView = new IView() {
        @Override
        public void setTimer(String timer) {

        }

        @Override
        public MvpControler getMvpControler() {
            return null;
        }
    };

}
