package com.aykutasil.deleteolevinsider;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by aykutasil on 7.09.2017.
 */

public class FirebaseTokenServise extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.w("Firebase Token: ", refreshedToken);
    }
}
