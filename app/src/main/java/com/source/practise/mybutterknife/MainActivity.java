package com.source.practise.mybutterknife;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.source.practise.annotation.BindView;
import com.source.practise.annotation.OnClick;
import com.source.practise.library.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv2)
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        tv1.setText("aaaa");
//        tv2.setText("bbb");
    }

    @OnClick(R.id.tv1)
    public void click(View view) {
        Toast.makeText(this, tv1.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.tv2)
    public void click2() {
        Toast.makeText(this, "OnClick -> no parameter", Toast.LENGTH_SHORT).show();
    }
}
