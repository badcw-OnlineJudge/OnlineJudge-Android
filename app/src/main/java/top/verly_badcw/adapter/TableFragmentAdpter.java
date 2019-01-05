package top.verly_badcw.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import top.verly_badcw.activities.MainActivity;
import top.verly_badcw.fragment.ProblemListFragment;
import top.verly_badcw.fragment.UserInfoFragment;

public class TableFragmentAdpter extends FragmentPagerAdapter {

    private List<String> list;

    public TableFragmentAdpter(FragmentManager fm, List<String> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int i) {

        // user info
        if (i == 0) return UserInfoFragment.newInstance(MainActivity.user);

        // problemlist
        return ProblemListFragment.newInstance();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
