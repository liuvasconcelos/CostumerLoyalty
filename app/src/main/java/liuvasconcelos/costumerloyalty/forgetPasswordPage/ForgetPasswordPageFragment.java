package liuvasconcelos.costumerloyalty.forgetPasswordPage;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import liuvasconcelos.costumerloyalty.R;
import liuvasconcelos.costumerloyalty.databinding.ForgetPasswordFragBinding;
import liuvasconcelos.costumerloyalty.databinding.RegistrationPageFragBinding;

public class ForgetPasswordPageFragment extends Fragment implements ForgetPasswordPageContract.View{

    private ForgetPasswordPageContract.Presenter mPresenter;
    private ForgetPasswordFragBinding mForgetPasswordPageFragBinding;

    public ForgetPasswordPageFragment() {}

    public static ForgetPasswordPageFragment newInstance() {
        return new ForgetPasswordPageFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mForgetPasswordPageFragBinding = DataBindingUtil.inflate(inflater, R.layout.forget_password_frag,container,false);
        mForgetPasswordPageFragBinding.setHandler(this);

        return mForgetPasswordPageFragBinding.getRoot();
    }

    @Override
    public void setPresenter(ForgetPasswordPageContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showLocalLoader() {

    }

    @Override
    public void hideLocalLoader() {

    }

}

