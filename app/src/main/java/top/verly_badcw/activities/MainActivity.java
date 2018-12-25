package top.verly_badcw.activities;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import top.verly_badcw.androidoj.R;
import top.verly_badcw.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnMessageReadListener {

    public static final int SUCCESS = 1;
    public static final int FAIL = 0;
    public static final int CONNECT_WRONG = 2;
    public static final int PASSWORD_WRONG = 3;
    public static final int ACCESS_WRONG = 4;

    public static FragmentManager fragmentManager;
    private TextView txt;


    public static SharedPreferences preferences;
    public static SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        preferences = getSharedPreferences("verly-badcw", MODE_PRIVATE);
        editor = preferences.edit();

        FragmentTransaction f = fragmentManager.beginTransaction();

        LoginFragment secondFragment = new LoginFragment();
        f.add(R.id.container, secondFragment, null);
        f.commit();

        txt = findViewById(R.id.txt_display_message);
    }

    @Override
    public void onMessageRead(String message) {
        txt.setText(message);
    }
}
