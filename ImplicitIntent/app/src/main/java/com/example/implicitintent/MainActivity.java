package com.example.implicitintent;
import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.net.URI;
public class MainActivity extends AppCompatActivity {
    EditText mailBody,urlStr;
    Button send,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mailBody = findViewById(R.id.mailBody); urlStr = findViewById(R.id.url);
        send = findViewById(R.id.sendMail); search = findViewById(R.id.searchUrl);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND); intent.setType("text/html");
                String mailId = "bezneha@gmail.com"; intent.putExtra(Intent.EXTRA_EMAIL,mailId);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Demo mail");
                intent.putExtra(Intent.EXTRA_TEXT,mailBody.getText().toString());
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
            } });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,urlStr.getText().toString()); startActivity(intent);
            } });
    } }