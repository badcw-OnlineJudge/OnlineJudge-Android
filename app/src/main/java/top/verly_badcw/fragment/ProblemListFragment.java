package top.verly_badcw.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import top.verly_badcw.adapter.ListViewDemoAdapter;
import top.verly_badcw.androidoj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProblemListFragment extends Fragment implements View.OnClickListener {

    private ListView testLv;//ListView组件
    private Button updateDataBtn;//动态加载数据组件

    private List<String> dataList = new ArrayList<>();//存储数据
    private ListViewDemoAdapter listViewDemoAdapter;//ListView的数据适配器

    public ProblemListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.select_layout, container, false);
        initView(view);//初始化组件
        initData();//初始化数据
        return view;
    }


    /**
     * 初始化组件
     */
    private void initView(View view) {
        testLv = (ListView) view.findViewById(R.id.test_lv);
        updateDataBtn = (Button) view.findViewById(R.id.update_data_btn);

        updateDataBtn.setOnClickListener(this);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        //初始化10项数据
        for (int i = 1; i <= 20; i++) {
            dataList.add("显示内容" + i);
        }

        //设置ListView的适配器
        listViewDemoAdapter = new ListViewDemoAdapter(getActivity(), dataList);
        testLv.setAdapter(listViewDemoAdapter);
        testLv.setSelection(4);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.update_data_btn://动态加载列表数据
                dataList.add("动态加载的数据项");
                //通知ListView更改数据源
                if (listViewDemoAdapter != null) {
                    listViewDemoAdapter.notifyDataSetChanged();
                    testLv.setSelection(dataList.size() - 1);//设置显示列表的最后一项
                } else {
                    listViewDemoAdapter = new ListViewDemoAdapter(getActivity(), dataList);
                    testLv.setAdapter(listViewDemoAdapter);
                    testLv.setSelection(dataList.size() - 1);
                }
                break;
        }
    }

}
