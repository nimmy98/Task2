package com.example.nimmy.task2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Nimmy on 30-01-2017.
 */

public class FragmentLogin extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentlogin,container,false);
        final EditText userET, passwordET;
        Button loginBtn, clearBtn;

        //final Context context = view.getContext();
        //final Activity activity = this.getActivity();

        userET = (EditText)view.findViewById(R.id.ET_username);
        passwordET = (EditText)view.findViewById(R.id.ET_password);
        loginBtn = (Button)view.findViewById(R.id.cmd_login);
        clearBtn = (Button)view.findViewById(R.id.cmd_clear);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userET.getText().toString().equals("nimmy") && (passwordET.getText().toString().equals("nimmy"))) {

                    Toast.makeText(getActivity(),"Congratulations".concat("You are successfully login"),Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getActivity(),"Sorry".concat("You are unauthorized"),Toast.LENGTH_SHORT).show();
                }


            }

        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userET.setText("");
                passwordET.setText("");
            }
        });


        return view;

    }

}
