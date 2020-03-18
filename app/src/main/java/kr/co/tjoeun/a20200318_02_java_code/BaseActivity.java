package kr.co.tjoeun.a20200318_02_java_code;

// 액티비티가 아니라, JAVA 클래스로 만든 파일.
// 모든 액티비티가 공통으로 사용하는 기능들을 묶어두는 클래스.
// 1) 이벤트 세팅, 2) 초기 값 세팅


import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();
}










