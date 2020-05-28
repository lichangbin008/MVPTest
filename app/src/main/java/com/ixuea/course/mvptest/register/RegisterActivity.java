package com.ixuea.course.mvptest.register;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ixuea.course.mvptest.R;
import com.ixuea.course.mvptest.mvp.view.LifeCircleMvpActivity;

public class RegisterActivity extends LifeCircleMvpActivity implements IRegisterContract.IView {

    private EditText etName;

    private EditText etPwd;

    private Button btRegister;

    private IRegisterContract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.et_name);
        etPwd = findViewById(R.id.et_pwd);
        btRegister = findViewById(R.id.bt_register);

        mPresenter = new RegisterPresenter(this);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String pwd = etPwd.getText().toString();
                mPresenter.requestRegister(name, pwd);
            }
        });
    }

    @Override
    public void responseRegister(boolean isSuccess) {
        Toast.makeText(this, isSuccess ? "注册成功" : "注册失败", Toast.LENGTH_SHORT).show();
    }
}
