package training.com.cleancodeworkshop.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import training.com.cleancodeworkshop.R;
import training.com.cleancodeworkshop.calculator.di.DaggerCalculatorComponent;
import training.com.cleancodeworkshop.di.DaggerAppComponent;

public class CalculatorFragment extends Fragment implements CalculatorContract.View {
    @BindView(R.id.firstNumber_editText)
    EditText firstNumberEditText;
    @BindView(R.id.secondNumber_editText)
    EditText secondNumberEditText;
    @BindView(R.id.result_textView)
    TextView resultTextView;

    private String firstNumber;
    private String secondNumber;

    @Inject
    CalculatorPresenter presenter;

    public static CalculatorFragment newInstance() {
        CalculatorFragment fragment = new CalculatorFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerCalculatorComponent
                .builder()
                .appComponent(DaggerAppComponent.create())
                .build()
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
        initInstances(rootView, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.setView(this);
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

    }

    private void prepareInputText() {
        firstNumber = firstNumberEditText.getText().toString();
        secondNumber = secondNumberEditText.getText().toString();
    }


    @OnClick({R.id.plus_button, R.id.minus_button, R.id.multiply_button, R.id.divide_button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.plus_button:
                prepareInputText();
                presenter.onPlusButtonClick(firstNumber, secondNumber);
                break;
            case R.id.minus_button:
                break;
            case R.id.multiply_button:
                break;
            case R.id.divide_button:
                break;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();

    }

    @Override
    public void showResult(String text) {
        resultTextView.setText(text);
    }
}
