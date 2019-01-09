package com.example.pc.ejemplomenu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Llamar por teléfono:
            case R.id.opcion1:
                Intent i1 = new Intent(Intent.ACTION_DIAL);
                startActivity(i1);
                break;
            // Acceder a una página Web:
            case R.id.opcion2:
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("http://www.facebook.com"));
                startActivity(i2);
                break;
            // Ejecutar una Activity de la misma aplicación:
            case R.id.opcion3:
                Intent i3 = new Intent(this, AcercaDe.class);
                startActivity(i3);
                break;
        }
        return true;
    }
}
