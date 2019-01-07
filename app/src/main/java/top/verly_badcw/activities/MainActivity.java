package top.verly_badcw.activities;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import top.verly_badcw.adapter.TableFragmentAdpter;
import top.verly_badcw.androidoj.R;
import top.verly_badcw.data.Languages;
import top.verly_badcw.data.Messages;
import top.verly_badcw.util.User;

public class MainActivity extends AppCompatActivity {

    public static MainActivity instance;
    public static User user;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance = this;

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tableLayout = (TabLayout) findViewById(R.id.table_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        initUser();

        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            p.add(i);
        }
        user.setSolvedProblems(p);

        List<String> list = new ArrayList<>();
        list.add(Messages.get(this, "userinfo"));
        list.add(Messages.get(this, "problemlist"));

        viewPager.setAdapter(new TableFragmentAdpter(getSupportFragmentManager(), list));
        tableLayout.setupWithViewPager(viewPager);
    }

    private static void initUser() {
        user = new User();
        user.setUserName("TEST");
        user.setRank(1);
    }

    public static void language(Languages lang) {
        Preference.INSTANCE.put( Preference.KEY_LANG, lang.code());
    }

    public static Languages language() {
        String code = Preference.INSTANCE.getString(Preference.KEY_LANG, null);
        if (code == null){
            Languages lang = Languages.matchLocale(Locale.getDefault());
            return lang;
        }
        else return Languages.matchCode(code);
    }

    public static void reportException( Throwable tr ) {
        Log.e("ACTIVITY", Log.getStackTraceString(tr));
    }
}
