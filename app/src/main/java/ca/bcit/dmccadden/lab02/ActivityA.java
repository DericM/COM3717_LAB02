package ca.bcit.dmccadden.lab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);


        Button activityB = (Button)findViewById(R.id.buttonAtoB);
        activityB.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                intent = new Intent(getApplicationContext(), ActivityB.class);
                startActivity(intent);
            }
        });
    }


}
