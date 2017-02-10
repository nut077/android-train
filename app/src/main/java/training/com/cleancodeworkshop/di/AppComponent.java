package training.com.cleancodeworkshop.di;

import javax.inject.Singleton;

import dagger.Component;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ErrorMessageFactory errorMessageFactory();
}
