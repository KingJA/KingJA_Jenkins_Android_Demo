package com.kingja.jenkins;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_version_name = findViewById(R.id.tv_version_name);
        TextView tv_version_code = findViewById(R.id.tv_version_code);
        TextView tv_build_type = findViewById(R.id.tv_build_type);
        TextView tv_build_date = findViewById(R.id.tv_build_date);
        TextView tv_host_url = findViewById(R.id.tv_host_url);
        tv_version_name.setText(BuildConfig.VERSION_NAME);
        tv_version_code.setText(String.valueOf(BuildConfig.VERSION_CODE));
        tv_build_type.setText(BuildConfig.BUILD_TYPE);
        tv_build_date.setText(BuildConfig.BUILD_DATE);
        tv_host_url.setText(BuildConfig.HOST_URL);

//        Toast.makeText(this,BuildConfig.HOST_URL,Toast.LENGTH_SHORT).show();
    }
}
