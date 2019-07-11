package com.example.fragment.fragment;


import android.hardware.Camera;
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
public class SecondFragment extends Fragment implements View.OnClickListener {
Button Areaofcircle;
EditText Radius;

       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
     Areaofcircle = view.findViewById(R.id.btnsum);
     Radius = view.findViewById(R.id.etfirst);


return view;
    }

    @Override
    public void onClick(View v) {


           float radius = Float.parseFloat(Radius.getText().toString());
           float area = 3.14f *radius*radius;

        Toast.makeText(getActivity(),"Area of circle" +area,Toast.LENGTH_SHORT).show();
    }
}
