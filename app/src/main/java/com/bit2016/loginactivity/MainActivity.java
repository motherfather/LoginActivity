package com.bit2016.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // HTML string UI에 적용하기
        TextView textView = (TextView)findViewById( R.id.tv_signup );
        textView.setMovementMethod( LinkMovementMethod.getInstance() );
        textView.setText( Html.fromHtml( getString(R.string.login_url) )); // 모든 태그가 다 되는건 아니다!!
    }
}
