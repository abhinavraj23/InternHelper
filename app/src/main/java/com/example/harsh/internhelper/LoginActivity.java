package com.example.harsh.internhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.GoogleAuthProvider;

public class LoginActivity extends AppCompatActivity{

    Button sign_in_google, sign_in_facebook;
    private GoogleApiClient googleApiClient;

    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        sign_in_facebook = (Button) findViewById(R.id.sign_in_facebook);
        sign_in_google = (Button) findViewById(R.id.sign_in_google);
        GoogleSignInOptions signInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        //googleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD,signInOptions).build();
    }
}
