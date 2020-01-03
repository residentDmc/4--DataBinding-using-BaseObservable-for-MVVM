package com.codinginflow.databindingusingbaseobservableformvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.codinginflow.databindingusingbaseobservableformvvm.databinding.ActivityMainBinding;
import com.codinginflow.databindingusingbaseobservableformvvm.viewModel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel();
        userModel.setEmail("Email");
        userModel.setPassword("Password");
        activityMainBinding.setUser(userModel);
    }
}
