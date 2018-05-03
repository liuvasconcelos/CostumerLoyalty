package liuvasconcelos.costumerloyalty.login;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import liuvasconcelos.costumerloyalty.registrationPage.DAO.UserDAO;

public class LoginPresenter implements LoginContract.Presenter{

    private final LoginContract.View mLoginView;
    private Context mContext;
    private SQLiteDatabase mDatabase;
    private UserDAO userDAO;

    public LoginPresenter (LoginContract.View loginView,
                           Context context, SQLiteDatabase database) {
        this.mContext = context;
        this.mDatabase = database;
        mLoginView = loginView;
        mLoginView.setPresenter(this);
        userDAO = new UserDAO(mContext, mDatabase);
    }

    @Override
    public Boolean checkCredentials(String email,
                                    String password) {

        return userDAO.hasUser(email, password);
    }

}
