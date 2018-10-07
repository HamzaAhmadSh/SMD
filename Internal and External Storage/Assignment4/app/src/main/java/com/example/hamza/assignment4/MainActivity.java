package com.example.hamza.assignment4;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File internalFolder = new File(Environment.getExternalStorageDirectory() + "/Internal Folder");
        if (!internalFolder.exists()) {
            internalFolder.mkdir();
        }

        File internalDownloadFolder = new File(Environment.getExternalStorageDirectory() + "/Download/Internal Download Folder");
        if (!internalDownloadFolder.exists()) {
            internalDownloadFolder.mkdir();
        }
    }
}
