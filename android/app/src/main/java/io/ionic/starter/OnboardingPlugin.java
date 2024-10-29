// package io.ionic.starter;

// import android.content.Intent;
// import android.content.Context;
// import android.util.Log;
// import com.getcapacitor.Plugin;
// import com.getcapacitor.annotation.CapacitorPlugin;
// import com.getcapacitor.PluginCall;
// import com.getcapacitor.PluginMethod;
// import com.getcapacitor.JSObject;

// @CapacitorPlugin(name = "OnboardingPlugin")
// public class OnboardingPlugin extends Plugin {

//     private static final int ONBOARDING_REQUEST_CODE = 1111;
//     private PluginCall savedCall;

//     @PluginMethod
//     public void triggerOnboardingSDK(PluginCall call) {
//         this.savedCall = call;
//         Context context = getContext();
//         Intent intent = new Intent(context, HostActivity.class);

//         if (intent.resolveActivity(context.getPackageManager()) != null) {
//             getActivity().startActivityForResult(intent, ONBOARDING_REQUEST_CODE);
//             Log.d("OnboardingPlugin", "Intent launched successfully");
//         } else {
//             Log.e("OnboardingPlugin", "Failed to resolve HostActivity intent");
//             call.reject("Failed to resolve HostActivity intent");
//         }
//     }

//     @Override
//     protected void handleOnActivityResult(int requestCode, int resultCode, Intent data) {
//         if (requestCode == ONBOARDING_REQUEST_CODE && savedCall != null) {
//             JSObject result = new JSObject();
//             result.put("status", resultCode == Activity.RESULT_OK);
//             savedCall.resolve(result);
//             savedCall = null;
//         }
//     }
// }

import com.getcapacitor.PluginCall;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.PluginMethod;

@CapacitorPlugin(name = "SdkPlugin")
public class SdkPlugin extends Plugin {
    @PluginMethod
    public void lunch(PluginCall call) {
        // Your SDK triggering logic
        JSObject ret = new JSObject();
        ret.put("success", true);
        call.resolve(ret);
    }
}
