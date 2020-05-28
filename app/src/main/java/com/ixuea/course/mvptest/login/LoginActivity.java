package com.ixuea.course.mvptest.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ixuea.course.mvptest.R;
import com.ixuea.course.mvptest.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter, ILogin.VP> implements View.OnClickListener {

    private EditText etName;

    private EditText etPwd;

    private Button btLogin;

    @Override
    public ILogin.VP getContract() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
                mPresenter.getContact().requestLogin(name, pwd);
            }

            @Override
            public void responseLoginResult(boolean loginStatusResult) {
                Toast.makeText(LoginActivity.this, loginStatusResult ? "登录成功" : "登录失败", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(getContentViewID());
    }

    @Override
    public int getContentViewID() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        etName = findViewById(R.id.et_name);
        etPwd = findViewById(R.id.et_pwd);
        btLogin = findViewById(R.id.bt_login);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        btLogin.setOnClickListener(this);
    }

    @Override
    public void destroy() {

    }

    @Override
    public LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    public <ERROR> void responseError(ERROR error, Throwable throwable) {
        Toast.makeText(this, "" + error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String name = etName.getText().toString();
        String pwd = etPwd.getText().toString();
        //面向方法
//        requestLogin(name, pwd);
        //面向接口
        getContract().requestLogin(name, pwd);
    }

//    @Override
//    public void requestLogin(String name, String pwd) {
//        mPresenter.requestLogin(name, pwd);
//    }
//
//    @Override
//    public void responseLoginResult(boolean loginStatusResult) {
//        Toast.makeText(this, loginStatusResult ? "登录成功" : "登录失败", Toast.LENGTH_SHORT).show();
//    }
}
