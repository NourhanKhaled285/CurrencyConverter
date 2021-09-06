package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button conv=(Button)findViewById(R.id.conv_btn);
        Button clear=(Button)findViewById(R.id.clear_btn);

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean clic_dollar=false;
                boolean clic_pound=false;
                converter obj=new converter();
                EditText dollar=(EditText)findViewById(R.id.US_d_txt);
                String dol=dollar.getText().toString();

                EditText pound=(EditText)findViewById(R.id.eg_p_txt);

                String pou=pound.getText().toString();
                if(dol.equals("") && pou.equals("")){
                    Toast.makeText(getApplicationContext(),"Invalid data - try again",Toast.LENGTH_LONG).show();

                }
                else{

                    if(!dol.equals("") && pou.equals("")){

                        obj.setCurrency(Float.parseFloat(dol));
                        float res=obj.convert_dollar_to_pound();
                        ((EditText)findViewById(R.id.eg_p_txt)).setText(String.valueOf(res));

                    }
                    else if (!pou.equals("") && dol.equals("")){

                        obj.setCurrency(Float.parseFloat(pou));
                        float res=obj.convert_pound_to_dollar();
                        ((EditText)findViewById(R.id.US_d_txt)).setText(String.valueOf(res));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid data - you should convert only one type of currency ",Toast.LENGTH_LONG).show();

                    }
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText)findViewById(R.id.US_d_txt)).setText("");
                ((EditText)findViewById(R.id.eg_p_txt)).setText("");
            }
        });
    }

}