package br.com.vluzrmos.aulafragments;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class TopLeft extends Fragment {
    int cores[] = {Color.BLACK, Color.BLUE, Color.GRAY, Color.RED, Color.DKGRAY, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.LTGRAY, Color.YELLOW, Color.WHITE};
    int indice = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_left, container, false);

        Button button = (Button) view.findViewById(R.id.change_bg_color);

        button.setOnClickListener(getOnClickChangeBgButtonListener());

        return view;
    }

    public View.OnClickListener getOnClickChangeBgButtonListener(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomLeft fragment = (BottomLeft) getFragmentManager().findFragmentById(R.id.fragment_bottom_left);
                changeFragmentBackgroundColor(fragment);
            }
        };
    }

    public void changeFragmentBackgroundColor(Fragment fragment){
        fragment.getView().setBackgroundColor(cores[(indice++)%cores.length]);
    }
}
