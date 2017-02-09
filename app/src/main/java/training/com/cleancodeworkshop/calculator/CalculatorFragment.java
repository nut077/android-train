package training.com.cleancodeworkshop.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import training.com.cleancodeworkshop.R;

public class CalculatorFragment extends Fragment {
    @BindView(R.id.firstNumber_editText)
    EditText firstNumberEditText;
    @BindView(R.id.secondNumber_editText)
    EditText secondNumberEditText;
    @BindView(R.id.result_textView)
    TextView resultTextView;
    private Button plusButton, minusButton, multiplyButton, divideButton;
    private String firstNumber;
    private String secondNumber;

    public static CalculatorFragment newInstance() {
        CalculatorFragment fragment = new CalculatorFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
        initInstances(rootView, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        System.out.println("eiei");
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
                break;
            case R.id.minus_button:
                break;
            case R.id.multiply_button:
                break;
            case R.id.divide_button:
                break;
        }
    }
}
