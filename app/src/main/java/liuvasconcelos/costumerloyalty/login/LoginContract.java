package liuvasconcelos.costumerloyalty.login;


import liuvasconcelos.costumerloyalty.BasePresenter;
import liuvasconcelos.costumerloyalty.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        //fragment methods

    }
    interface Presenter extends BasePresenter {
        //presenter methods
    }
}
