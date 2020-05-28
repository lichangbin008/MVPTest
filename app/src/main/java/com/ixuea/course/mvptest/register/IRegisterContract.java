package com.ixuea.course.mvptest.register;

import com.ixuea.course.mvptest.mvp.ILifeCircle;
import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.MvpControler;

/**
 * 注册界面契约接口
 */
public interface IRegisterContract {

    interface IView extends IMvpView {
        /**
         * 响应注册结果
         *
         * @param isSuccess
         */
        void responseRegister(boolean isSuccess);
    }

    interface IPresenter extends ILifeCircle {
        /**
         * 请求注册
         *
         * @param name
         * @param pwd
         */
        void requestRegister(String name, String pwd);

        /**
         * 响应注册结果
         *
         * @param isSuccess
         */
        void responseRegister(boolean isSuccess);
    }

    interface IRegisterModel {
        /**
         * 请求注册
         *
         * @param name
         * @param pwd
         */
        void requestRegister(String name, String pwd) throws Exception;
    }

    IView emptyView = new IView() {
        @Override
        public void responseRegister(boolean isSuccess) {

        }

        @Override
        public MvpControler getMvpControler() {
            return null;
        }
    };
}
