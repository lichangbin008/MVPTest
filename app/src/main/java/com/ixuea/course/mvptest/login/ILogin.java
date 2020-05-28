package com.ixuea.course.mvptest.login;

/**
 * Created by ${lichangbin} on 2020/5/26.
 */
public interface ILogin {

    public interface M{
        void requestLogin(String name,String pwd) throws Exception;
    }

    public interface VP{
        void requestLogin(String name,String pwd);

        void responseLoginResult(boolean loginStatusResult);
    }
}
