package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input,signbox;
    String value1,value2;
    Double num1,num2,result;

    String sign;
    String check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signbox=findViewById(R.id.input);
        input=findViewById(R.id.sign);
    }

    public void btnClick_0(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"0");
    }
    public void btnClick_1(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"1");

    }
    public void btnClick_2(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"2");
    }
    public void btnClick_3(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"3");
    }
    public void btnClick_4(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"4");
    }
    public void btnClick_5(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"5");
    }
    public void btnClick_6(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"6");
    }
    public void btnClick_7(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"7");
    }
    public void btnClick_8(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"8");
    }
    public void btnClick_9(View view) {
        if (check=="1"){
            input.setText("");
            check=null;
        }
        input.setText(input.getText().toString()+"9");
    }




    public void btnCLick_add(View view) {
        sign="+";
        value1=input.getText().toString();
        input.setText("");
        signbox.setText(value1+"+");
    }
    public void btnCLick_sub(View view) {
        sign="-";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText(value1+"-");
    }
    public void btnCLick_multi(View view) {
        sign="*";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText(value1+"X");
    }
    public void btnCLick_division(View view) {
        sign="/";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText(value1+"÷");
    }





    public void btnCLick_equal(View view){

      if (input.getText().equals("")){
          signbox.setText("error");
      }else if (sign!=null){
          value2=input.getText().toString();
          num1=Double.parseDouble(value1);
          num2=Double.parseDouble(value2);

          input.setText(null);

          switch (sign){
              case "+":
                  result=num1+num2;
                  input.setText(result+"");
                  sign=null;
                  signbox.setText(null);
                  check="1";
                  break;
              case "-":
                  result=num1-num2;
                  input.setText(result+"");
                  sign=null;
                  signbox.setText(null);
                  check="1";
                  break;
              case "*":
                  result=num1*num2;
                  input.setText(result+"");
                  sign=null;
                  signbox.setText(null);
                  check="1";
                  break;
              case "/":
                  result=num1/num2;
                  input.setText(result+"");
                  sign=null;
                  signbox.setText(null);
                  check="1";
                  break;
          }
      }else {
          input.setText("error");
      }
    }

    public void all_ClearBtn(View view) {
        input.setText(null);
        signbox.setText(null);
    }
}