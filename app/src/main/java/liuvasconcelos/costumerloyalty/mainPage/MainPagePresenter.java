package liuvasconcelos.costumerloyalty.mainPage;


public class MainPagePresenter implements MainPageContract.Presenter{

    private final MainPageContract.View mMainPageView;

    public MainPagePresenter(MainPageContract.View mainPageView) {

        mMainPageView = mainPageView;
        mMainPageView.setPresenter(this);
    }
}
