package com.semi.sopt_19th_5.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.semi.sopt_19th_5.R;
import com.tsengvn.typekit.TypekitContextWrapper;

public class FontActivity extends AppCompatActivity {

    private TextView textArea;
    private Button fontBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);


        textArea = (TextView)findViewById(R.id.fontArea);
        fontBtn = (Button) findViewById(R.id.fontBtn);

        /**
         * 5차 세미나 : 글꼴 부분 코드입니다
         * 글꼴을 적용은
         * https://github.com/tsengvn/typekit 라는 오픈소스 라이브러리를 사용하여 진행할 예정입니다
         */

        fontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * 일부분만 적용시키는 방법
                 */
                String changeText = "안드로이드 글꼴 적용 후 입니다.";
                textArea.setText(changeText);
                textArea.setTypeface(Typeface.createFromAsset(getAssets(),"HoonWhayangyunwhaR.otf"));

            }
        });


    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }

}
