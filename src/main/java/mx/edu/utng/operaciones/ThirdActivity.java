package mx.edu.utng.operaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edtNumber1=(EditText)findViewById(R.id.edt_number_x);
        edtNumber2=(EditText)findViewById(R.id.edt_number_y);
        btnCalculate=(Button)findViewById(R.id.btn_calculate);
        txvResult=(TextView)findViewById(R.id.txv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numX=Double.parseDouble(edtNumber1.getText().toString());
                double numY=Double.parseDouble(edtNumber2.getText().toString());
                double result =0;
                result=(2*Math.sqrt(numX)+Math.sqrt(2*numY))-(Math.sqrt(numX)-2*(Math.sqrt(2*numY)));
                txvResult.setText(String.valueOf(result));
            }

        });

    }}
