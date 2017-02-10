package training.com.cleancodeworkshop.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    public ErrorMessageFactory provideErrorMessageFactory() {
        return new ErrorMessageFactory();
    }
}
