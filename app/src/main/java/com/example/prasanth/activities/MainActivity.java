package com.example.prasanth.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.prasanth.fragments.SampleFragment;
import com.example.prasanth.fragments_using_bundle.R;

public class MainActivity extends Activity {
    private Button showFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFrag = (Button) findViewById(R.id.nextButton);

        showFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.nameET);
                String name = editText.getText().toString();
                if (!name.equalsIgnoreCase("")) {
                    SampleFragment fragment = new SampleFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    fragment.setArguments(bundle);
                    getFragmentManager().beginTransaction().add(R.id.sampleFragmentFrame, fragment).commit();
                }
            }
        });
    }
}
