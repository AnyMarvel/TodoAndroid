package com.todo.android.basemvp;

/**
 * Created by AnyMarvel on 2017/10/7.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
