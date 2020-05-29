package com.ixuea.course.mvptest.mvp;

import com.ixuea.course.mvptest.mvp.model.BaseModel;

/**
 * Created by ${lichangbin} on 2020/5/29.
 */
public interface IMvpModel<M extends BaseModel> {

    M getModelInstance();
}
