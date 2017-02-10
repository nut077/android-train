package training.com.cleancodeworkshop.utils;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ErrorMessageFactory {

    @Inject
    public ErrorMessageFactory() {

    }

    public String getText(String text) {
        return "Text = " + text;
    }
}
