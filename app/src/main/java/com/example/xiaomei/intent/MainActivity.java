package com.example.xiaomei.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUrl;
    private Button btnLoadUrl;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUrl= (EditText) findViewById(R.id.etUrl);
        btnLoadUrl= (Button) findViewById(R.id.btnLoadUrl);
        btnLoadUrl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                url = etUrl.getText().toString();
                Uri uri= Uri.parse(url);
                Intent intent =new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);

            }
        });
    }
}
