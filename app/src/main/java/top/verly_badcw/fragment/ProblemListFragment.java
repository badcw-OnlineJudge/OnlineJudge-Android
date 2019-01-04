package top.verly_badcw.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import top.verly_badcw.adapter.ProblemListAdapter;
import top.verly_badcw.androidoj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProblemListFragment extends Fragment {


    public ProblemListFragment() {
        // Required empty public constructor
    }

    public static ProblemListFragment newInstance(String text) {

        Bundle args = new Bundle();
        args.putString("text", text);
        ProblemListFragment fragment = new ProblemListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_problem_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView problemListRecycler = view.findViewById(R.id.problem_list_recycler);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.format(Locale.CHINA, "第%03d条数据", i));
        }
        problemListRecycler.setAdapter(new ProblemListAdapter(getActivity(), list));
    }
}
