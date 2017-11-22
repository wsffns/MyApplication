package com.example.huangchl.application1;

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

    public void goUrl(View view) {
        EditText  teturl = (EditText)findViewById(R.id.teturl);
        String Url = teturl.getText().toString();
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(Url));
        startActivity(intent);
    }
}
