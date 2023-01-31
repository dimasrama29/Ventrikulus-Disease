package com.example.lambungdisease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Dashboard extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //actionbar and its title
        actionBar = getSupportActionBar();
        actionBar.setTitle("Dashboard");

        firebaseAuth = FirebaseAuth.getInstance();

        //Bottom navigation
        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);


        actionBar.setTitle("Home"); // Change Action Bar
        HomeFragment fragment1 = new HomeFragment();
        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.content, fragment1,"");
        ft1.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            //handle
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    actionBar.setTitle("Home"); // Change Action Bar
                    HomeFragment fragment1 = new HomeFragment();
                    FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.content, fragment1,"");
                    ft1.commit();
                    return true;

                case R.id.nav_profile:
                    actionBar.setTitle("Profile"); // change Action Bar
                    ProfileFragment fragment2 = new ProfileFragment();
                    FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                    ft2.replace(R.id.content, fragment2,"");
                    ft2.commit();
                    return true;

                case R.id.nav_InfoLambung:
                    InfoLambungFragment fragment3 = new InfoLambungFragment();
                    FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                    ft3.replace(R.id.content, fragment3,"");
                    ft3.commit();
                    actionBar.setTitle("Info Lambung"); // change Action Bar
                    return true;
            }

            return false;
        }
    };


    private void checkUserSatus(){
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if( user != null){


        }
        else {
            startActivity(new Intent(Dashboard.this,MainActivity.class));
            finish();
        }
    }

    @Override
    protected void onStart() {
        checkUserSatus();
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //memanggil menu
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_logout){
            firebaseAuth.signOut();
            checkUserSatus();
        }
        if (id == R.id.action_bantuan){
            Intent intent =  new Intent(Dashboard.this,bantuan.class);
            startActivity(intent);
        }
        if (id == R.id.action_tentang){
            Intent intent1 =  new Intent(Dashboard.this,tentang.class);
            startActivity(intent1);
        }



        return super.onOptionsItemSelected(item);
    }
}
