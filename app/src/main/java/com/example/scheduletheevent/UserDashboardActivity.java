package com.example.scheduletheevent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.scheduletheevent.fragments.FragmentBrowse;
import com.example.scheduletheevent.fragments.FragmentChat;
import com.example.scheduletheevent.fragments.FragmentHome;
import com.example.scheduletheevent.fragments.FragmentNotifications;
import com.example.scheduletheevent.fragments.FragmentSearch;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class UserDashboardActivity extends AppCompatActivity {

    BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch(item.getTitle().toString()) {
                    case "Home":
                        fragment = new FragmentHome();
                        break;
                    case "Browse":
                        fragment = new FragmentBrowse();
                        break;
                    case "Chat":
                        fragment = new FragmentChat();
                        break;
                    case "Notifications":
                        fragment = new FragmentNotifications();
                        break;
                    case "Search":
                        fragment = new FragmentSearch();
                        break;
                }
                loadFragment(fragment);
                return true;
            }
        });
        loadFragment(new FragmentHome());
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frameLayout,fragment).commit();
    }
}