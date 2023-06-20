package jp.suntech.c20011.myhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナオブジェクトの用意
        HelloListener listener = new HelloListener();
        //表示ボタンにリスナを設定
        btClick.setOnClickListener(listener);
        //クリアボタンであるボタンオブジェクトを表示
        Button btClear = findViewById(R.id.btClear);
        //クリアボタンにリスナを設定
        btClear.setOnClickListener(listener);

    }

    //ボタンをクリックしたときのリスナクラス
    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            //名前入力欄であるEditTextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);

            //タップされた画面部品のidのＲ値を取得
            int id = v.getId();

                //表示ボタンの時
                if(id==R.id.btClick) {
                    //入力された名前文字列を取得
                    String inputStr = input.getText().toString();
                    //メッセージの表示
                    output.setText(inputStr);
                }

                //クリアボタンの時
            if(id==R.id.btClear){
                //名前入力欄に空文字を設定
                input.setText("");
                //メッセージ表示欄に空文字を設定
                output.setText("");
            }



        }
    }
}