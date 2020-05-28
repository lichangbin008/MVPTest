package com.ixuea.course.mvptest.splash;

import android.os.CountDownTimer;

import com.ixuea.course.mvptest.mvp.IMvpView;
import com.ixuea.course.mvptest.mvp.base.BaseMvpPresenter;
import com.ixuea.course.mvptest.mvp.model.BaseModel;

/**
 * 闪屏页P层
 */
public class SplashPresenter extends BaseMvpPresenter<ISplashContract.IView,SplashModel> implements ISplashContract.IPresenter {

    // 定时器
    private CountDownTimer countDownTimer;

    /**
     * 构造方法
     *
     * @param view
     */
    public SplashPresenter(ISplashContract.IView view) {
        super(view);
    }

    @Override
    public SplashModel getModelInstance() {
        return null;
    }


    @Override
    protected ISplashContract.IView getEmptyView() {
        // 防止空指针
        return ISplashContract.emptyView;
    }

    @Override
    public void initTimer() {

        countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                getView().setTimer(String.format("%d秒",millisUntilFinished / 1000 + 1));
            }

            @Override
            public void onFinish() {
                getView().setTimer("跳过");
            }
        };
        countDownTimer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cancel();
    }

    /**
     * 取消定时器
     */
    private void cancel() {
        countDownTimer.cancel();
    }
}
