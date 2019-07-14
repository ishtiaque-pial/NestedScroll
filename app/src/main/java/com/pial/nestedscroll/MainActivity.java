package com.pial.nestedscroll;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NestedScrollView nestedScrollView;
    Button btn;
    private int height = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nestedScrollView = findViewById(R.id.nested);
        btn = findViewById(R.id.btn);

        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i1, int i2, int i3) {


                if (i1 >= 400) {
                    btn.setVisibility(View.VISIBLE);
                } else {
                    btn.setVisibility(View.GONE);
                }
                Log.e("gcgfhfh 1",""+i+" "+i1+" "+i2+" "+i3);
                Log.e("gcgfhfh 2",""+nestedScrollView.getChildAt(0).getHeight()/2);
            }
        });
    }
}
