package top.verly_badcw.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;

import top.verly_badcw.androidoj.R;
import top.verly_badcw.util.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserInfoFragment extends Fragment {


    public UserInfoFragment() {
        // Required empty public constructor
    }

    public static UserInfoFragment newInstance(User user) {

        Bundle args = new Bundle();
        args.putString("username", user.getUserName());
        args.putInt("rank", user.getRank());
        args.putInt("problemSolved", user.getSolvedProblems().size());
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView name = (TextView) view.findViewById(R.id.user_name);
        name.setText("User Name : " + (getArguments() != null ? getArguments().getString("username") : "null"));
        TextView rank = (TextView) view.findViewById(R.id.rank);
        rank.setText(String.format(Locale.CHINA, "User Rank : %03d", getArguments().getInt("rank")));
        TextView solved = (TextView) view.findViewById(R.id.problem_solved);
        solved.setText(String.format(Locale.CHINA, "Has Solved : %03d", getArguments().getInt("problemSolved")));
    }
}
