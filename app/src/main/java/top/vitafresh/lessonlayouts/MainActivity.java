package top.vitafresh.lessonlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View v){
        Log.d("TestApp", "Image clicked");
        ImageView imgView = findViewById(R.id.imageView);
        imgView.animate().alpha(0).setDuration(1000);
    }
}
