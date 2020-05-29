package com.ixuea.course.mvptest.register;

import com.ixuea.course.mvptest.mvp.IMvpModel;
import com.ixuea.course.mvptest.mvp.base.BaseMvpPresenter;

/**
 * 注册P层
 */
public class RegisterPresenter extends BaseMvpPresenter<IRegisterContract.IView> implements IRegisterContract.IPresenter, IMvpModel<RegisterModel> {

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
            getModelInstance().requestRegister(name,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void responseRegister(boolean isSuccess) {
        getView().responseRegister(isSuccess);
    }

}
