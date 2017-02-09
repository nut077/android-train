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

import training.com.cleancodeworkshop.R;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public class CalculatorFragment extends Fragment{
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;
    private Button plusButton,minusButton,multiplyButton,divideButton;
    private String firstNumber;
    private String secondNumber;

    public static CalculatorFragment newInstance(){
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
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        firstNumberEditText = (EditText) rootView.findViewById(R.id.firstNumber_editText);
        secondNumberEditText = (EditText) rootView.findViewById(R.id.secondNumber_editText);
        resultTextView = (TextView) rootView.findViewById(R.id.result_textView);
        plusButton = (Button) rootView.findViewById(R.id.plus_button);
        minusButton = (Button) rootView.findViewById(R.id.minus_button);
        multiplyButton = (Button) rootView.findViewById(R.id.minus_button);
        divideButton = (Button) rootView.findViewById(R.id.divide_button);
        // Bind Listener
        plusButton.setOnClickListener(onCalculatorButtonClick);
        minusButton.setOnClickListener(onCalculatorButtonClick);
        multiplyButton.setOnClickListener(onCalculatorButtonClick);
        divideButton.setOnClickListener(onCalculatorButtonClick);

    }

    private void prepareInputText() {
        firstNumber = firstNumberEditText.getText().toString();
        secondNumber = secondNumberEditText.getText().toString();
    }

    View.OnClickListener onCalculatorButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.plus_button:
                    prepareInputText();
                    break;
                case R.id.minus_button:
                    break;
                case R.id.multiply_button:
                    break;
                case R.id.divide_button:
                    break;
                default:
                    break;
            }
        }
    };

}
