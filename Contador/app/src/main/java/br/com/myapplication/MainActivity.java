package br.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    public void contar(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Ola!");
    }
    */

    public void contar(View viewAdd) {
        TextView tv = (TextView) findViewById(R.id.textView);

        this.number++;

        tv.setText(number.toString());
    }

    public void menos(View viewAdd) {
        TextView tv = (TextView) findViewById(R.id.textView);

        this.number--;

        tv.setText(number.toString());
    }

    public void zera(View viewAdd) {
        TextView tv = (TextView) findViewById(R.id.textView);

        this.number = 0;

        tv.setText(number.toString());
    }

}
