package com.aykutasil.deleteolevinsider;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.useinsider.insider.Insider;
import com.useinsider.insider.config.Geofence;
import com.useinsider.insider.config.Push;

/**
 * Created by aykutasil on 7.09.2017.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //Insider.Instance.init(this,"olev","851147378226",SplashActivity.class,false,30);
        String gcmID = FirebaseApp.getInstance().getOptions().getGcmSenderId();
        Insider.Instance.init(this,
                "olev",
                gcmID,
                MainActivity.class,
                Push.WILL_COLLAPSE,
                Geofence.EVERY_30_SECONDS);
    }
}
