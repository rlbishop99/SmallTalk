package com.example.smalltalk16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.smalltalk16.Adapters.Fragments_Adapter;
import com.example.smalltalk16.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        auth = FirebaseAuth.getInstance();

        binding.viewPager.setAdapter(new Fragments_Adapter(getSupportFragmentManager()));
        binding.tablayout.setupWithViewPager(binding.viewPager);


    }


}