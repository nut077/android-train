package training.com.cleancodeworkshop.calculator;

import training.com.cleancodeworkshop.BasePresenter;

public interface CalculatorContract {
    interface View {
        void showResult(String text);
    }

    interface Presenter extends BasePresenter<CalculatorContract.View> {
        void onPlusButtonClick(String val1, String val2);
    }
}
