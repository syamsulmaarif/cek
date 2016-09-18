package com.syamms.maps3;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.syamms.maps3.R;

public class MainActivity extends AppCompatActivity {

    private Button btnMaps1, btnMaps2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickbtnMps1();
        OnclickbtnMaps2();
    }
    public void OnclickbtnMps1(){
        btnMaps1 = (Button)findViewById(R.id.btn_map1);
        btnMaps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.syamms.maps3.MapsActivity");
                startActivity(intent);
            }
        });
    }
    public void OnclickbtnMaps2(){
        btnMaps2 = (Button)findViewById(R.id.btn_map2);

        btnMaps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.syamms.maps3.MapsActivity2");
                startActivity(intent);
            }
        });
    }
}
