package mx.edu.utng.operaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;
    private Button btnReturn;
    private TextView txvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtNumber1=(EditText)findViewById(R.id.edt_num_x);
        edtNumber2=(EditText)findViewById(R.id.edt_num_y);
        btnCalculate=(Button)findViewById(R.id.btn_calculate2);
        btnReturn=(Button)findViewById(R.id.btn_return);
        txvResult=(TextView)findViewById(R.id.txv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double X=Double.parseDouble(edtNumber1.getText().toString());
                double Y=Double.parseDouble(edtNumber2.getText().toString());
                double result =0;
                result=(5*Math.sqrt(X*Y)-3)-(2-4*Math.sqrt(X*Y));
                txvResult.setText(String.valueOf(result));
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
