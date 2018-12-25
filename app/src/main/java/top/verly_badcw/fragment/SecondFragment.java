package top.verly_badcw.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import top.verly_badcw.androidoj.R;
import top.verly_badcw.util.Login;

import static android.support.constraint.Constraints.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private Button submit;
    private EditText usernameT;
    private EditText passwordT;
    OnMessageReadListener messageReadListener;


    public SecondFragment() {
        // Required empty public constructor
    }

    public interface OnMessageReadListener {
        public void onMessageRead(String message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        submit = view.findViewById(R.id.submit_btn);
        usernameT = view.findViewById(R.id.id_text);
        passwordT = view.findViewById(R.id.password_text);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameT.getText().toString();
                String password = passwordT.getText().toString();

                Log.d(TAG, "onClick: " + username + " " + password);

                if (Login.loginnow(username, password) == 1) {
                    messageReadListener.onMessageRead(username);
                }
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;

        try {
            messageReadListener = (OnMessageReadListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "must override onMessageRead...");
        }

    }
}