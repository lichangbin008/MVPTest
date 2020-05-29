package com.ixuea.course.mvptest.mvp;

import com.ixuea.course.mvptest.mvp.model.BaseModel;

/**
 * MVP架构M层接口
 */
public interface IMvpModel<M extends BaseModel> {

    M getModelInstance();
}
