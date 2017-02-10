package training.com.cleancodeworkshop.calculator.di;

import dagger.Module;
import dagger.Provides;
import training.com.cleancodeworkshop.calculator.CalculatorContract;

@Module
public class CalculatorModule {

    @Provides
    public CalculatorContract.Presenter provideCalculatorPresenter(CalculatorContract.Presenter presenter) {
        return presenter;
    }
}
