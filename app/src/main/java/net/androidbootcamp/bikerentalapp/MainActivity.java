package net.androidbootcamp.bikerentalapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare array
        String[] bikes ={"Road Bikes", "Mountain Bikes", "Bike Rental Site"};
        //Display array in listView then change after changing design text
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.rental, bikes));

    }// end method

    protected void onListItemClick(ListView l, View v, int postiton, long id){
        switch (postiton) {
            case 0:
                startActivity(new Intent(MainActivity.this,Road.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this,Mountain.class));
                break;

            case 2:

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.campusbikeshop.com")));
                break;
        }
    } //end onListItemClick

}// end class
