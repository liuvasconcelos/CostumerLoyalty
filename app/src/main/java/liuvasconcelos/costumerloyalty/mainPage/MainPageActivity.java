package liuvasconcelos.costumerloyalty.mainPage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import liuvasconcelos.costumerloyalty.ActivityUtils;
import liuvasconcelos.costumerloyalty.R;

public class MainPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.main_page_act);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        MainPageFragment mainPageFragment = (MainPageFragment) getSupportFragmentManager().findFragmentById(R.id.main_page_content_frame);

        if (mainPageFragment == null){
            mainPageFragment = MainPageFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mainPageFragment, R.id.main_page_content_frame);
        }

        new MainPagePresenter(mainPageFragment);
    }
}
