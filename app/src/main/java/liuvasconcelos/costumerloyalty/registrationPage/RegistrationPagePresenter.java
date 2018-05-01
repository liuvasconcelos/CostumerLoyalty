package liuvasconcelos.costumerloyalty.registrationPage;


public class RegistrationPagePresenter implements RegistrationPageContract.Presenter{

    private final RegistrationPageContract.View mRegistrationPageView;

    public RegistrationPagePresenter(RegistrationPageContract.View registrationPageView) {

        mRegistrationPageView = registrationPageView;
        mRegistrationPageView.setPresenter(this);
    }
}
