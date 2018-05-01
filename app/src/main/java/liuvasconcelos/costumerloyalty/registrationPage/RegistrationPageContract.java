package liuvasconcelos.costumerloyalty.registrationPage;


import liuvasconcelos.costumerloyalty.BasePresenter;
import liuvasconcelos.costumerloyalty.BaseView;

public interface RegistrationPageContract {
    interface View extends BaseView<Presenter> {
        void goToMainPage(android.view.View view);
    }
    interface Presenter extends BasePresenter {
        //presenter methods
    }
}
