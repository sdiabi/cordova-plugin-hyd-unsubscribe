package fr.edf.cih.hydrovigie.unsubscribe;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

public class Unsubscribe extends CordovaPlugin {

    private static final String TAG = "Unsubscribe";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if ("start".equals(action)) {
            cordova.getThreadPool().execute(new Runnable() {
                public void run() {
                    // TODO18
                    Log.d(TAG, "Start unsubscribe service...");
                }
            });
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }

}