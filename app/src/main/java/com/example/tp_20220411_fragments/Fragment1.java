package com.example.tp_20220411_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        Button button = view.findViewById(R.id.button);
        Log.d("Fragment1", "View créée");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Fallait aller voter !", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment 1", "Fragment créé");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment1", "Le fragment a démarré");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment1", "Le fragment a repris");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment1", "Le fragment a stoppé");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1", "Le fragment est détruit");
    }

    // Quand l'utilisateur quitte le fragment,
    // c'est là que l'on commit tous les changements qui doivent persister
    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment1", "Le fragment est en pause");
    }

    // Le fragment est détruit après l'appel à cette méthode
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment1", "La View est détruite");
    }

    // L'instance du fragment est associé avec une instance d'activité
    // Le fragment et l'activité ne sont pas complètement initialisés
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("Fragment1", "Le fragment est attaché à l'activité");
    }
}
