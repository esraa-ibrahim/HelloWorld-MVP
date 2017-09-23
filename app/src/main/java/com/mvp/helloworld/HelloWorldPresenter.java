package com.mvp.helloworld;

/**
 * Represents the P part in MVP architecture
 * Simple presenter that implements {@link HelloWorldContract.Presenter},
 * delegate view requests to model, and update the view with data
 */
public class HelloWorldPresenter implements HelloWorldContract.Presenter {
    HelloWorldModel mModel;
    HelloWorldContract.View mView;

    public HelloWorldPresenter(HelloWorldContract.View view) {
        this.mView = view;
    }

    @Override
    public void bind() {
        mModel = new HelloWorldModel();
        mView.setMessage(mModel.generateRandomHelloWorldText());
    }

    @Override
    public void unbind() {
        mModel = null;
        mView = null;
    }
}
