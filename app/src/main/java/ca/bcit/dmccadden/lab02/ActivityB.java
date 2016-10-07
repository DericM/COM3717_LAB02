package ca.bcit.dmccadden.lab02;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button activityC = (Button)findViewById(R.id.buttonBtoC);
        activityC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                intent = new Intent(getApplicationContext(), ActivityC.class);
                startActivity(intent);
            }
        });


        Toast.makeText(this, Build.VERSION.RELEASE, Toast.LENGTH_LONG).show();

    }
}
