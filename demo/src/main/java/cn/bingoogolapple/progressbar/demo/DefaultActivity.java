package cn.bingoogolapple.progressbar.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        setTitle("系统自带 ProgressBar 支持的样式");
    }
}
