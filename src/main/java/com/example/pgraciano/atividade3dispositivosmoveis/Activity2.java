package com.example.pgraciano.atividade3dispositivosmoveis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {

    private Button button;
    private int clickNumber;
    TextView t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t2 = (TextView) findViewById(R.id.txt2);

        button = (Button) findViewById(R.id.button2);

        Intent it = getIntent();

        Bundle b = it.getExtras();

        clickNumber = 1;

        if (b != null) {


            String mensagem = b.getString("txt1");

            System.out.println("ACTIVITY 2 " + mensagem);

           clickNumber = Integer.valueOf(mensagem);
           clickNumber =+ 1;
        }

      button.setText(String.valueOf(clickNumber));

    }

    public void openActivity1(View view) {

        Intent intent = new Intent(this, MainActivity.class);

        Bundle parametros = new Bundle();

        // t1.setText(clickNumber);

        parametros.putString("txt2", String.valueOf(clickNumber));

        intent.putExtras(parametros);

        startActivity(intent);
    }


}
