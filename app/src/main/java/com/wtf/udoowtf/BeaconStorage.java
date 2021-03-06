package com.wtf.udoowtf;

import java.util.ArrayList;

/**
 * Created by Alessandro on 09/04/2016.
 */
public class BeaconStorage {
    private ArrayList<BeaconDevice> beaconList = new ArrayList<BeaconDevice>();

    public BeaconStorage(){
        beaconList.add(new BeaconDevice("D7:B3:84:F8:C2:4B","A","room1", R.drawable.wtf_ic_phone));
        beaconList.add(new BeaconDevice("EC:FD:86:8A:92:28","B","room2",R.drawable.wtf_ic_light));
        beaconList.add(new BeaconDevice("00:07:80:37:8A:6D","IOTSemplice","door",R.drawable.wtf_ic_window));
        beaconList.add(new BeaconDevice("C9:5D:E2:ED:DC:98","TrackR","portachiavi",R.drawable.wtf_ic_phone));
    }

    public ArrayList<BeaconDevice> getBeaconList(){

        return beaconList;
    }
}
