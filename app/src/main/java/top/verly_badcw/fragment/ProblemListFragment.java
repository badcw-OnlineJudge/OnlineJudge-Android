package top.verly_badcw.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import top.verly_badcw.activities.MainActivity;
import top.verly_badcw.activities.Preference;
import top.verly_badcw.adapter.ProblemListAdapter;
import top.verly_badcw.androidoj.R;
import top.verly_badcw.api.API;
import top.verly_badcw.data.APIUrl;
import top.verly_badcw.util.ProblemInfo;
import top.verly_badcw.util.ProblemList;
import top.verly_badcw.util.RecycleViewDivider;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProblemListFragment extends Fragment {


    private ProblemList list;
    private ProblemListAdapter adapter;

    public ProblemListFragment() {
        // Required empty public constructor
    }

    public static ProblemListFragment newInstance() {

        Bundle args = new Bundle();
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
        problemListRecycler.addItemDecoration(new RecycleViewDivider(
                getActivity(), LinearLayoutManager.VERTICAL, 10, getResources().getColor(R.color.line_gray)));
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIUrl.HOST_NAME)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API api = retrofit.create(API.class);
        Call<ProblemList> call = api.getProblemList(true, 0, 100, 1);
        call.enqueue(new tmp());
        adapter = new ProblemListAdapter(getActivity());
        problemListRecycler.setAdapter(adapter);
    }

    class tmp implements Callback<ProblemList> {
        @Override
        public void onResponse(Call<ProblemList> call, Response<ProblemList> response) {
            list = response.body();
            adapter.addAll(list.getData().getResults());
            Log.d("ProblemList", "onResponse: " + adapter.getItemCount());
        }
        @Override
        public void onFailure(Call<ProblemList> call, Throwable t) {
            Log.d("ProblemList", "onFailure: " + t.getLocalizedMessage());
        }
    }
}
