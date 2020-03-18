package kr.co.tjoeun.a20200318_02_java_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import kr.co.tjoeun.a20200318_02_java_code.datas.User;

// 20200318_02_java_code

// Alt + Enter (에러줄에서)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

//        Intent로 UserInfoActivity 실행.
//        사용자 이름 / 생년 / 성별 / 잔고 / 아이디 / 닉네임 전달.
//         => User클래스를 한번에 전달하면 편하다.
//         => 데이터 전달을 가능하게 하려면, 해당 클래스 Serializable 역할 수행 명시.

        User u = new User("조경진", 1988);

        Intent intent = new Intent(mContext, UserInfoActivity.class);
        intent.putExtra("userInfo", u);
        startActivity(intent);


    }

    @Override
    public void setValues() {

        Toast.makeText(mContext, "테스트용", Toast.LENGTH_SHORT).show();

    }
}
