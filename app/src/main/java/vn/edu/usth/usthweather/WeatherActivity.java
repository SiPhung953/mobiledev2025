package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class WeatherActivity extends AppCompatActivity {
    private static final String DIAG = WeatherActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(DIAG, "OnCreate() initiated");

        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentContainerView,Fragment.class,null)
                .commit();

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(DIAG, "onCreate initiated");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(DIAG, "Buttons and Views initiated");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(DIAG, "Application Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(DIAG, "Application Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(DIAG, "Application Resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(DIAG, "Application Destroyed");
    }
}