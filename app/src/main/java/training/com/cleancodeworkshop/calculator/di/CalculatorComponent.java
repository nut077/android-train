package training.com.cleancodeworkshop.calculator.di;

import dagger.Component;
import training.com.cleancodeworkshop.calculator.CalculatorFragment;
import training.com.cleancodeworkshop.di.ActivityScore;
import training.com.cleancodeworkshop.di.AppComponent;

@ActivityScore
@Component(modules = CalculatorModule.class, dependencies = AppComponent.class)
public interface CalculatorComponent {
    void inject(CalculatorFragment fragment);
}
