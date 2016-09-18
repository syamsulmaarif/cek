package com.syamms.maps3;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //   LatLng sydney = new LatLng(-34, 151);
        LatLng sgc = new LatLng(-6.258288, 107.146708);
        LatLng  JlReMartadinataNo17 = new LatLng(-6.262023, 107.141924);
        LatLng JlReMartadinataNo4 = new LatLng(-6.262314, 107.141055);
        LatLng JlReMartadinataNo5 = new LatLng(-6.262271, 107.140181);
        LatLng JlReMartadinataNo44 = new LatLng(-6.261695, 107.138877);
        LatLng JlReMartadinataNo50 = new LatLng(-6.262186, 107.138029);
        LatLng jlKaptenSumantri28 = new LatLng(-6.258576, 107.147039);
        LatLng jlKaptenSumantri6 = new LatLng(-6.256384, 107.147184);
        LatLng gangTepekongNo50 = new LatLng(-6.255754, 107.141988);
        LatLng jlHajiUmarSaid = new LatLng(-6.255920, 107.140958);
        LatLng jlYosSudarsoNo56 = new LatLng(-6.261493, 107.138303);
        LatLng jlRayaFatahillahNo11 = new LatLng(-6.264324, 107.137257);
        LatLng jlRayaFatahillahNo89 = new LatLng(-6.265855, 107.135578);
        LatLng jlPerjuanganNo118 = new LatLng(-6.270349, 107.115626);
        LatLng jlPerjuanganNo47 = new LatLng(-6.272157, 107.115739);
        LatLng jlPerjuanganNo55 = new LatLng(-6.274782, 107.115320);
        LatLng jlPerjuanganNo56 = new LatLng(-6.277197, 107.114944);
        LatLng jlPerjuanganNo57 = new LatLng(-6.278295, 107.114295);
        LatLng jlPerjuanganNo60 = new LatLng(-6.279495, 107.112707);
        LatLng jlPerjuanganNo62 = new LatLng(-6.280791, 107.112160);
        LatLng jlPerjuanganNo63 = new LatLng(-6.281809, 107.112251);
        LatLng jlPerjuanganNo64 = new LatLng(-6.284189, 107.113359);
        LatLng jlJarakostaNo256 = new LatLng(-6.285154, 107.113289);
        LatLng jlJarakostaNo257 = new LatLng(-6.285292, 107.113697);
        LatLng jlJarakostaNo258 = new LatLng(-6.288466, 107.114507);
        LatLng jlJarakostaNo259 = new LatLng(-6.294137, 107.112739);
        LatLng jlJarakostaNo260 = new LatLng(-6.295273, 107.112406);
        LatLng jlJarakostaNo131 = new LatLng(-6.297464, 107.111258);
        LatLng jlJarakostaNo108 = new LatLng(-6.299915, 107.110673);
        LatLng jlJarakostaNo125 = new LatLng(-6.300987, 107.110013);
        LatLng jlSukadanauNo79 = new LatLng(-6.301888, 107.108194);
        LatLng jlJarakostaNo12 = new LatLng(-6.303909, 107.106960);
        LatLng jlJarakostaNo13 = new LatLng(-6.304112, 107.106279);
        LatLng jlJarakostaNo14 = new LatLng(-6.303580, 107.105310);
        LatLng jlIrianBlokFfNo2 = new LatLng(-6.303595, 107.105287);
        LatLng jlIrian = new LatLng(-6.310517, 107.101615);
        LatLng jlIrianNo186 = new LatLng(-6.300139, 107.106808);
        LatLng jlIrianNo187 = new LatLng(-6.300336, 107.106969);
        LatLng jlJawaBlok66No8 = new LatLng(-6.309307, 107.099357);
        LatLng jlJawaBlok66No9 = new LatLng(-6.309131, 107.099464);
        LatLng jlIrianBlokFfNo5 = new LatLng(-6.310236, 107.101572);

        mMap.addMarker(new MarkerOptions()
                .position(sgc)
                .title("Sentra Grosir Cikarang")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(JlReMartadinataNo4)
                .title("Jl ReMartadinata No 4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(JlReMartadinataNo17)
                .title("Jl ReMartadinata No 17")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlKaptenSumantri28)
                .title("jl Kapten Sumantri 28")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlKaptenSumantri6)
                .title("jl Kapten Sumantri 6")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(gangTepekongNo50)
                .title("gang Tepekong No 50")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlHajiUmarSaid)
                .title("jl Haji Umar Said")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlRayaFatahillahNo11)
                .title("jl Raya Fatahillah No 11")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(JlReMartadinataNo5)
                .title("Jl ReMartadinata No 5")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(JlReMartadinataNo44)
                .title("Jl ReMartadinata No 44")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(JlReMartadinataNo50)
                .title("Jl ReMartadinata No 50")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlYosSudarsoNo56)
                .title("jl Yos Sudarso No 56")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlRayaFatahillahNo89)
                .title("jl Raya Fatahillah No 89")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo118)
                .title("jl Perjuangan No 118")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo47)
                .title("jl Perjuangan No 47")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo55)
                .title("jl Perjuangan No 55")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo56)
                .title("jl Perjuangan No 56")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo57)
                .title("jl Perjuangan No 57")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );

        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo60)
                .title("jl Perjuangan No 60")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlPerjuanganNo62)
                .title("jl Perjuangan No 62")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addMarker(new MarkerOptions()
                .position(jlJarakostaNo256)
                .title("jl Jarakosta No 256")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.point))
        );
        mMap.addPolyline(new PolylineOptions().add(
                jlJarakostaNo14,
                jlIrianNo187,
                jlIrianNo186,
                jlIrianBlokFfNo5,
                jlJawaBlok66No9,
                jlJawaBlok66No8,
                jlIrian,
                jlIrianBlokFfNo2,
                jlJarakostaNo13,
                jlJarakostaNo12,
                jlSukadanauNo79,
                jlJarakostaNo125,
                jlJarakostaNo108,
                jlJarakostaNo131,
                jlJarakostaNo260,
                jlJarakostaNo259,
                jlJarakostaNo258,
                jlJarakostaNo257,
                jlJarakostaNo256,
                jlPerjuanganNo64,
                jlPerjuanganNo63,
                jlPerjuanganNo62,
                jlPerjuanganNo60,
                jlPerjuanganNo57,
                jlPerjuanganNo56,
                jlPerjuanganNo55,
                jlPerjuanganNo47,
                jlPerjuanganNo118,
                jlRayaFatahillahNo89,
                jlRayaFatahillahNo11,
                jlYosSudarsoNo56,
                jlHajiUmarSaid,
                gangTepekongNo50,
                jlKaptenSumantri6,
                jlKaptenSumantri28,
                JlReMartadinataNo17,
                JlReMartadinataNo4,
                JlReMartadinataNo5,
                JlReMartadinataNo44,
                JlReMartadinataNo50

            )
                .width(10)
                .color(Color.BLUE)

        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sgc, 14));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }

    public class inisialLtLng{

    }
}
