package com.example.fragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {



        // Required empty public constructor
        EditText First,Second;
        Button Btn;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

      First = view.findViewById(R.id.etFirst);
      Second = view.findViewById(R.id.etSecond);
      Btn = view.findViewById(R.id.btnresult);


      Btn.setOnClickListener(this);

     return view;
    }

    @Override
    public void onClick(View v) {


        int first  = Integer.parseInt(First.getText().toString());
        int second = Integer.parseInt(Second.getText().toString());
        int sum = first +second;

        Toast.makeText(getActivity(),"sum is:"+ sum, Toast.LENGTH_SHORT).show();

    }
}
