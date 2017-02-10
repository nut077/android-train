package training.com.cleancodeworkshop.calculator;

public class CalculatorPresenter implements CalculatorContract.Presenter {

    private CalculatorContract.View view;

    @Override
    public void onPlusButtonClick(String val1, String val2) {
        view.showResult(Integer.parseInt(val1) + Integer.parseInt(val2) + "");
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
