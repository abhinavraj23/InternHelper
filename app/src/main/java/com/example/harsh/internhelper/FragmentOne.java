package com.example.harsh.internhelper;

import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
        //not useful
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  Gson gson =new Gson();
        //  String[][] array = gson.fromJson(JSoN,String[][].class);
        View view =inflater.inflate(R.layout.fragment_one, container, false);

        return view;
    }

}
