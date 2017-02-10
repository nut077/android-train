package training.com.cleancodeworkshop;

public interface BasePresenter<T> {
    void setView(T view);
    void onPause();
    void onResume();
    void onDestroy();
}
