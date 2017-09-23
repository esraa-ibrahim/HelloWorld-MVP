package com.mvp.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Represents the V part in MVP architecture
 * Simple view (Activity) that implements {@link HelloWorldContract.View},
 * creates the Presenter, and notify it when the view needs the data or not to bind/unbind to it
 */
public class HelloWorldActivity extends AppCompatActivity
        implements HelloWorldContract.View {

    TextView tvMessage;
    HelloWorldPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.tv_message);
        mPresenter = new HelloWorldPresenter(this);
    }

    @Override
    public void setMessage(String message) {
        tvMessage.setText(message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.bind();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.unbind();
    }
}
