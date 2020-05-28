package com.ixuea.course.mvptest.register;

import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.model.BaseModel;

/**
 * 注册M层
 */
public class RegisterModel extends BaseModel<RegisterPresenter> implements IRegisterContract.IRegisterModel{

    public RegisterModel(RegisterPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public void requestRegister(String name, String pwd) {
        //请求服务登录接口，然后拿到服务器返回的JSON数据
        if ("abc".equals(name) && "123".equals(pwd)) {
            mPresenter.responseRegister(true);
        } else {
            mPresenter.responseRegister(false);
        }
    }


}
