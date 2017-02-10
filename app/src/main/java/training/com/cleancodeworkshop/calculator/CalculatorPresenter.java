package training.com.cleancodeworkshop.calculator;

import javax.inject.Inject;

import training.com.cleancodeworkshop.di.ActivityScore;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

@ActivityScore
public class CalculatorPresenter implements CalculatorContract.Presenter {

    @Inject
    public CalculatorPresenter() {

    }

    @Inject
    ErrorMessageFactory errorMessageFactory;

    private CalculatorContract.View view;

    @Override
    public void onPlusButtonClick(String val1, String val2) {
        view.showResult(Integer.parseInt(val1) + Integer.parseInt(val2) + "" + errorMessageFactory.getText("5555"));
    }

    @Override
    public void setView(CalculatorContract.View view) {
        this.view = view;
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        this.view = null;
    }
}
