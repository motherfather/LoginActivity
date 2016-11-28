package com.estsoft.loginactivity;

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

//        TextView textView = (TextView)findViewById( R.id.tv_signup );
//        textView.setMovementMethod( LinkMovementMethod.getInstance() );
//        textView.setText( Html.fromHtml( "<a href=http://www.hellomyoffice.com>Hello My Office 가입하기<;/a>" ));
    }
}
