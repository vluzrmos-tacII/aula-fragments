package br.com.vluzrmos.aulafragments;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link android.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class TopRight extends TopLeft {

    public View.OnClickListener getOnClickChangeBgButtonListener(){
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                changeFragmentBackgroundColor(getFragmentManager().findFragmentById(R.id.fragment_top_left));
            }
        };
    }
}
