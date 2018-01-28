package com.example.bclan.tamuhack;

import android.os.Bundle;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * Created by bclan on 1/28/2018.
 */

public class EmtOrParaMap extends MainActivity {

    MapView mMapView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emt_or_par_map);

        setContentView(R.layout.emt_or_par_map);
     /* *** ADD *** */
        mMapView = (MapView) findViewById(R.id.mapView);
        showWebMap();



    }

    private void showWebMap() {
        String itemId = "72c66ca81ccb483fa567c74ecf70f58a";
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
