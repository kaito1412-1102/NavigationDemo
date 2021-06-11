package com.example.navigationdemo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgMenu;
    TextView txtEvent1;
    TextView txtEvent2;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        imgMenu = findViewById(R.id.img_menu);
        imgMenu.setOnClickListener(this);
        txtEvent1 = findViewById(R.id.txt_even1);
        txtEvent1.setOnClickListener(this);
        txtEvent2 = findViewById(R.id.txt_even2);
        txtEvent2.setOnClickListener(this);
        drawerLayout = findViewById(R.id.drawer_layout);
//        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED); mặc định cho phép back hay bắm ra ngoài để tắt drawer layout
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_menu:
                drawerLayout.openDrawer(Gravity.LEFT, true);
                break;
            case R.id.txt_even1:
                Toast.makeText(this, "Event 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txt_even2:
                Toast.makeText(this, "Event 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}