package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class ViewSignatureActivity extends AppCompatActivity {

    private ImageView imgvwSignature;
    private  String signaturePath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_signature_acitivty);

       imgvwSignature = (ImageView) findViewById(R.id.imgvwSignature);
       Bundle extras = getIntent().getExtras();

        // if(extras!=null)
        //  {
         signaturePath = extras.getString("SignaturePath");
        imgvwSignature.setImageURI(Uri.parse("file://"+signaturePath));
        // if(signaturePath!=null)
        //  imgvwSignature.setImageURI(Uri.parse("file://"+signaturePath));
        //  }
    }
}