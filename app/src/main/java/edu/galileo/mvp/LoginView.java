package edu.galileo.mvp;

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUserNameError(int messageResId);

    void setPasswordError(int messageResId);

    void successAction();

}