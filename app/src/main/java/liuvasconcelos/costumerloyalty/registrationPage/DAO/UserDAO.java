package liuvasconcelos.costumerloyalty.registrationPage.DAO;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import liuvasconcelos.costumerloyalty.R;
import liuvasconcelos.costumerloyalty.registrationPage.model.User;

public class UserDAO {
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public UserDAO(Context context, SQLiteDatabase database) {
        this.mContext = context;
        this.mDatabase = database;

        createUserTable();
    }

    public void createUserTable() {
        mDatabase.execSQL("CREATE TABLE IF NOT EXISTS users(" +
                "id integer primary key autoincrement, " +
                "name varchar, " +
                "cpf varchar, " +
                "phone varchar, " +
                "email varchar, " +
                "password varchar" +
                ")");
    }

    public Boolean insert(String name, String cpf,
                          String phoneNumber, String email,
                          String password) {
        Boolean userInserted = false;
        try {
            mDatabase.execSQL("INSERT INTO users (name, cpf, phone, email, password) " +
                    "values('" + name + "', '" + cpf + "', '" + phoneNumber + "', '" + email + "', '" + password + "') ");
            userInserted = true;

//            saveSharedPreference();
        } catch (Exception e) {

        }

        return userInserted;
    }

    public Boolean hasUser(String email, String password) {
        Boolean hasUser = false;
        String query = "SELECT * FROM users " +
                "WHERE email = '" + email + "' AND password = '" + password + "';";
        Cursor result = mDatabase.rawQuery(query, null);


        if (result.getCount() > 0) {
            hasUser = true;
//            saveSharedPreference();
        }

        return hasUser;

    }
}


