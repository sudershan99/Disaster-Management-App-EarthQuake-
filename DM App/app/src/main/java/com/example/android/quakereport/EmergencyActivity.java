package com.example.android.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        PDFView pdf = findViewById(R.id.pdfview1);
        pdf.fromAsset("utilities.pdf").fitEachPage(true).pageSnap(true).load();
    }
}