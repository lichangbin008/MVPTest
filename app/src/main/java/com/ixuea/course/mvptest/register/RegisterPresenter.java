package com.ixuea.course.mvptest.register;

import com.ixuea.course.mvptest.mvp.base.BaseMvpPresenter;

/**
 * 注册P层
 */
public class RegisterPresenter extends BaseMvpPresenter<IRegisterContract.IView, RegisterModel> implements IRegisterContract.IPresenter {

    /**
     * 构造方法
     *
     * @param view
     */
    public RegisterPresenter(IRegisterContract.IView view) {
        super(view);
    }

    @Override
    public RegisterModel getModelInstance() {
        return new RegisterModel(this);
    }

    @Override
    protected IRegisterContract.IView getEmptyView() {
        return IRegisterContract.emptyView;
    }

    @Override
    public void requestRegister(String name, String pwd) {
        try {
            mModel.requestRegister(name,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void responseRegister(boolean isSuccess) {
        getView().responseRegister(isSuccess);
    }

}
