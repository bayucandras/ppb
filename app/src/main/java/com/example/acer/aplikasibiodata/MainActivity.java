package com.example.acer.aplikasibiodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callPhone(View view){
        Uri uri = Uri.parse("tel:083120778945");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void openMap( View view){
        Uri uri = Uri.parse("geo:-6.930859, 109.479413?q=");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }

    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"bayuchandra.s@gmail.com"});


        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
}
