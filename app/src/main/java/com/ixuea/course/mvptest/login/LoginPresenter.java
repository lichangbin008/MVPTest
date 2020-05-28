package com.ixuea.course.mvptest.login;

import com.ixuea.course.mvptest.base.BasePresenter;

/**
 * Created by ${lichangbin} on 2020/5/26.
 */
public class LoginPresenter extends BasePresenter<LoginActivity,LoginModel,ILogin.VP>{
    @Override
    public LoginModel getmModelInstance() {
        return new LoginModel(this);
    }

    @Override
    public ILogin.VP getContact() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
                //校验请求的信息，进行逻辑处理
                //...
                try {
//                    mModel.requestLogin(name,pwd);
                    mModel.getContact().requestLogin(name,pwd);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //异常处理
            }

            @Override
            public void responseLoginResult(boolean loginStatusResult) {
                //真是开发过程中要解析数据
                //...
//              mView.responseLoginResult(loginStatusResult);
                mView.getContract().responseLoginResult(loginStatusResult);
            }
        };
    }

//    @Override
//    public void requestLogin(String name, String pwd) {
//        //校验请求的信息，进行逻辑处理
//        //...
//        try {
//            mModel.requestLogin(name,pwd);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //异常处理
//    }
//
//    @Override
//    public void responseLoginResult(boolean loginStatusResult) {
//        //真是开发过程中要解析数据
//        //...
//        mView.responseLoginResult(loginStatusResult);
//    }
}
