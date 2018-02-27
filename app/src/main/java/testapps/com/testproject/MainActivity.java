package testapps.com.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import testapps.com.androidlibrary.Constant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       int a= Constant.value;
    }
}
