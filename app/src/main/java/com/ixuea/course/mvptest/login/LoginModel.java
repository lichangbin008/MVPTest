package com.ixuea.course.mvptest.login;

import com.ixuea.course.mvptest.base.BaseModel;

/**
 * Created by ${lichangbin} on 2020/5/26.
 */
public class LoginModel extends BaseModel<LoginPresenter,ILogin.M>{
    public LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public ILogin.M getContact() {
        return new ILogin.M() {
            @Override
            public void requestLogin(String name, String pwd) throws Exception {
                //请求服务登录接口，然后拿到服务器返回的JSON数据
                if ("abc".equals(name) && "123".equals(pwd)) {
//                    mPresenter.responseLoginResult(true);
                    mPresenter.getContact().responseLoginResult(true);
                } else {
//                    mPresenter.responseLoginResult(false);
                    mPresenter.getContact().responseLoginResult(false);
                }
            }
        };
    }

//    @Override
//    public void requestLogin(String name, String pwd) throws Exception {
//        //请求服务登录接口，然后拿到服务器返回的JSON数据
//        if ("abc".equals(name)&&"123".equals(pwd)){
//            mPresenter.responseLoginResult(true);
//        }else {
//            mPresenter.responseLoginResult(false);
//        }
//    }
}
