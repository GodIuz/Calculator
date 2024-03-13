package com.droidgeniuslabs.calculator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calc_Fragment extends Fragment {

    double num1,num2,res;

    public Calc_Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calc, container, false);

        Button add = view.findViewById(R.id.buttonADD);
        Button sub = view.findViewById(R.id.buttonSUB);
        Button multi = view.findViewById(R.id.buttonMulti);
        Button division = view.findViewById(R.id.buttonDivision);
        Button klasma = view.findViewById(R.id.buttonKlasma);
        Button apoliti_timi = view.findViewById(R.id.buttonApolitiTImi);
        Button Ln = view.findViewById(R.id.buttonLN);
        Button Log = view.findViewById(R.id.buttonLOG);
        Button x10 = view.findViewById(R.id.button_Dynami_10);
        Button xy = view.findViewById(R.id.button_X_Dynami_eis_Y);
        Button x2 = view.findViewById(R.id.button_X_stin_2);
        Button paragwntiko = view.findViewById(R.id.buttonParagwntiko);
        Button T_Riza = view.findViewById(R.id.buttonSQRT);
        Button clear = view.findViewById(R.id.buttonCLEAR);


        EditText arithmos1 = view.findViewById(R.id.editTextNumberDecimal4);
        EditText arithmos2 = view.findViewById(R.id.editTextNumberDecimal5);
        TextView result = view.findViewById(R.id.TextResult);

        String x = arithmos1.getText().toString();
        String y = arithmos2.getText().toString();

        arithmos2.setText("0");
        arithmos1.setText("0");
        result.setText("0");
            if (!x.isEmpty() && !y.isEmpty()) {
               add.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       num2 = Double.parseDouble(y);
                       res = num1+num2;
                       result.setText("Result: " +res);
                   }
               });

               sub.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       num2 = Double.parseDouble(y);
                       res = num1-num2;
                       result.setText("Result: " +res);
                   }
               });

               multi.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       num2 = Double.parseDouble(y);
                       res = num1*num2;
                       result.setText("Result: " +res);
                   }
               });

               division.setOnClickListener(new View.OnClickListener() {
                   @SuppressLint("SetTextI18n")
                   @Override
                   public void onClick(View v) {
                       if(num2 !=0) {
                           num1 = Double.parseDouble(x);
                           num2 = Double.parseDouble(y);
                           res = num1 / num2;
                           result.setText("Result: " + res);
                       }
                   }
               });

               klasma.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                           num1 = Double.parseDouble(x);
                       if(num1 !=0) {
                           res = 1 / num1;
                           result.setText("Result: " + res);
                       }
                   }
               });

               apoliti_timi.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       res = java.lang.Math.abs(num1);
                       result.setText("Result: " +res);
                   }
               });

               Ln.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       res = java.lang.Math.log(num1);
                       result.setText("Result: " +res);
                   }
               });

               Log.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       res = java.lang.Math.log10(num1);
                       result.setText("Result: " +res);
                   }
               });

               x10.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       res = java.lang.Math.pow(10,num1);
                       result.setText("Result: " +res);
                   }
               });

               xy.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       num2 = Double.parseDouble(y);
                       res = java.lang.Math.pow(num1,num2);
                       result.setText("Result: " +res);
                   }
               });

               x2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       res = java.lang.Math.pow(2,num1);
                       result.setText("Result: " +res);
                   }
               });

               paragwntiko.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       int number = Integer.parseInt(x);
                       long factorial = calculateFactorial(number);
                       result.setText("Result" + factorial);
                   }
               });

               T_Riza.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       num1 = Double.parseDouble(x);
                       if (num1>=0) {
                           res = java.lang.Math.sqrt(num1);
                           result.setText("Result: " + res);
                       }
                   }
               });

               clear.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       arithmos1.setText("");
                       arithmos2.setText("");
                   }
               });
            } else {
                Toast.makeText(requireContext(), "Invalid Type", Toast.LENGTH_LONG).show();
            }
         return view;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}