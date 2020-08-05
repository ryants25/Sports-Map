package com.example.mysportsmap;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

// Football
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4032, -121.9698))
                .title("San Francisco 49ers")
                .snippet("Levi's Stadium")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(36.090750,-115.183722))
                .title("Las Vegas Raiders")
                .snippet("Allegiant Stadium")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.9534, -118.3387))
                .title("LA Rams/Chargers")
                .snippet("SoFi Stadium")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
// Baseball
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.7786,-122.3893))
                .title("San Francisco Giants")
                .snippet("Oracle Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.7516,-122.2005))
                .title("Oakland Athletics")
                .snippet("Oakland Coliseum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.8003,-117.8827))
                .title("LA Angels of Anaheim")
                .snippet("Angel Stadium of Anaheim")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.0739,-118.2400))
                .title("LA Dodgers")
                .snippet("Dodger Stadium")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(32.7076,-117.1570))
                .title("San Diego Padres")
                .snippet("PETCO Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
// Basketball
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.7677,-122.3873))
                .title("Golden State Warriors")
                .snippet("Chase Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.0430,-118.2673))
                .title("Los Angeles Clippers/Lakers")
                .snippet("Staples Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

// Hockey
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.3328,-121.9012))
                .title("San Jose Sharks")
                .snippet("SAP Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(33.8078,-117.8765))
                .title("Anaheim Ducks")
                .snippet("Honda Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(34.0430,-118.2673))
                .title("LA Kings")
                .snippet("Staples Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(34.0430, -118.2673), 5));


    }
}
