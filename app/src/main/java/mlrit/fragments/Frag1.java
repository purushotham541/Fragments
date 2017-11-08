package mlrit.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Raj on 11/8/2017.
 */

public class Frag1 extends Fragment
{  Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.frag1,container,false);
        Button button=(Button)view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(view.getContext(),"xxx",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
