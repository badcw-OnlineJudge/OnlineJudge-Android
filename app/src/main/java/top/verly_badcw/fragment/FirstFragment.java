package top.verly_badcw.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import top.verly_badcw.activities.MainActivity;
import top.verly_badcw.androidoj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        button = view.findViewById(R.id.b2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager
                        .beginTransaction()
                        .replace(R.id.container,
                                new SecondFragment(), null)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }

}
