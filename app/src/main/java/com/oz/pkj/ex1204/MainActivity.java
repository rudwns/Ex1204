package com.oz.pkj.ex1204;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        public void onClick(View v){ // event메소드
                                     //Android 에서 event메소드는 반드시 View를 매개변수로 가지고있어야한다.
                Toast.makeText(getApplicationContext(),"클릭하지마ㅡㅡ",Toast.LENGTH_SHORT).show();

                TextView tv = findViewById(R.id.textView);
                tv.setText("집에가고싶어!!!!");
                tv.setTextColor(Color.BLACK);
        }
}
