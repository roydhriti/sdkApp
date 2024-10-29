package io.ionic.starter;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity; // Import Activity instead of PluginActivity
import com.getcapacitor.PluginCall; // Import PluginCall if needed

public class HostActivity extends Activity {

  @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Sample code to simulate a result
    Intent resultIntent = new Intent();
    resultIntent.putExtra("status", true);
    resultIntent.putExtra("response", 200);
    resultIntent.putExtra("message", "Onboarding successful");
    setResult(Activity.RESULT_OK, resultIntent);
    finish(); // End activity to trigger result
}


}
