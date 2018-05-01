package liuvasconcelos.costumerloyalty.login;


import liuvasconcelos.costumerloyalty.introductionPage.IntroPageContract;

public class LoginPresenter implements LoginContract.Presenter{

    private final LoginContract.View mLoginView;

    public LoginPresenter (LoginContract.View loginView) {

        mLoginView = loginView;
        mLoginView.setPresenter(this);
    }
}
