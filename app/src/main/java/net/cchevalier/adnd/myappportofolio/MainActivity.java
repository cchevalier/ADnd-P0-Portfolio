package net.cchevalier.adnd.myappportofolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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
        if (id == R.id.action_about) {
            Log.i("folio", "About was selected");
            Toast about = Toast.makeText(getBaseContext(), "Portfolio App developed \nfor the Android Developer \nNanoDegree from Udacity. \n(c) CChevalier, 2015", Toast.LENGTH_LONG);
            about.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            about.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
