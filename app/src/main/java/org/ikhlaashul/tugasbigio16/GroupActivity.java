package org.ikhlaashul.tugasbigio16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class GroupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        Button btnseeuser = findViewById(R.id.btnSeeUser);
        Spinner mSpinner = findViewById(R.id.spinnerPeopleName);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.people , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        btnseeuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mSpinnerValue = mSpinner.getSelectedItem().toString();
                Intent intent = new Intent(getApplicationContext(), BioActivity.class);
                intent.putExtra("peopleID", mSpinnerValue);
                startActivity(intent);
            }
        });
    }
}