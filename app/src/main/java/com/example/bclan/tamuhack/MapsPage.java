package com.example.bclan.tamuhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * Created by bclan on 1/28/2018.
 */

public class MapsPage extends AppCompatActivity {

    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_layout);


        setContentView(R.layout.page_layout);
     /* *** ADD *** */
        mMapView = (MapView) findViewById(R.id.mapView);
        showWebMap();

    }

    private void showWebMap() {
        String itemId = "c75279eb033f4acba3a115acae5c27ea";
        String url = "https://www.arcgis.com/sharing/rest/content/items/" + itemId + "/data";
        ArcGISMap map = new ArcGISMap(url);
        mMapView.setMap(map);
    }

    @Override
    protected void onPause(){
        mMapView.pause();
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mMapView.resume();
    }

}


