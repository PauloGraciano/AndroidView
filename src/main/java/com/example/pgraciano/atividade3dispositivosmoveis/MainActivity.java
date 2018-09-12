package com.example.pgraciano.atividade3dispositivosmoveis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button button;
    private int clickNumber= 1;

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.txt2);

        button = (Button) findViewById(R.id.button);

        Intent it = getIntent();

        Bundle b = it.getExtras();

        clickNumber = 1;

        if (b != null) {

            String mensagem = b.getString("txt2");

            System.out.println("ACTIVITY 1 " + mensagem);

            clickNumber = Integer.valueOf(mensagem);
            clickNumber =+ 1;
        }

        button.setText(String.valueOf(clickNumber));

    }

    public void openActivity2(View view) {

         Intent it = new Intent(this, Activity2.class);

          Bundle parametros = new Bundle();

         // t1.setText(clickNumber);

          parametros.putString("txt1", String.valueOf(clickNumber));

          it.putExtras(parametros);

          startActivity(it);
        }
    }

