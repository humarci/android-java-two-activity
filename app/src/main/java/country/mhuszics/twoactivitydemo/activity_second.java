package country.mhuszics.twoactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        uiChanger();
    }
    private void uiChanger(){
        Button button = findViewById(R.id.button_activity2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(activity_second.this, R.string.toast_activity2_text, Toast.LENGTH_LONG).show();
                //Intent intent = new Intent();
                //intent.setClass(activity_second.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TwoActivityApp", "2nd activity onDestroy...");
    }
}