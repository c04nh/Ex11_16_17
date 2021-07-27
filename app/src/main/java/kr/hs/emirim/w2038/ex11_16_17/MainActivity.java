package kr.hs.emirim.w2038.ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] itemArrs = {"애프터 웨딩 인 뉴욕", "컨택트", "아토믹 블론드", "버즈 오브 프레이", "밤쉘",
                        "북스마트", "카메론 포스트의 잘못된 교육", "미녀 삼총사3", "시카고", "클라우즈 오브 실스마리아"};
    ImageView imgv;
    int[] titleNames = {R.drawable.afterwedding, R.drawable.arrival, R.drawable.atomicblond, R.drawable.birdsofpray, R.drawable.bombshell,
                        R.drawable.booksmart, R.drawable.cameron, R.drawable.charliesangels3, R.drawable.chicago, R.drawable.cloudsofsilsmaria};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화 포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgv.setImageResource(titleNames[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}