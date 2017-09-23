package com.mvp.helloworld;

/**
 * Represents the View and Presenter contract
 */
public interface HelloWorldContract {
    interface View {
        void setMessage(String message);
    }

    interface Presenter {
        void bind();

        void unbind();
    }
}
