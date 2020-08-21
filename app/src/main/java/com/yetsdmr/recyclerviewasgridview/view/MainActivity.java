package com.yetsdmr.recyclerviewasgridview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yetsdmr.recyclerviewasgridview.R;
import com.yetsdmr.recyclerviewasgridview.adapter.RecyclerViewAdapter;
import com.yetsdmr.recyclerviewasgridview.model.ElementModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ElementModel> elementList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        loadData();

    }

    private void loadData(){
        ElementModel element1 = new ElementModel("First Item",R.drawable.ic_baseline_airline_seat_flat_angled_24);
        ElementModel element2 = new ElementModel("Second Item",R.drawable.ic_baseline_airplanemode_active_24);
        ElementModel element3 = new ElementModel("Third Item",R.drawable.ic_baseline_brightness_1_24);
        ElementModel element4 = new ElementModel("Fourth Item",R.drawable.ic_baseline_build_24);
        ElementModel element5 = new ElementModel("Fifth Item",R.drawable.ic_baseline_airline_seat_flat_angled_24);
        ElementModel element6 = new ElementModel("Sixth Item",R.drawable.ic_baseline_airplanemode_active_24);
        ElementModel element7 = new ElementModel("Seventh Item",R.drawable.ic_baseline_brightness_1_24);
        ElementModel element8 = new ElementModel("Eight Item",R.drawable.ic_baseline_build_24);

        elementList = new ArrayList<>();
        elementList.add(element1);
        elementList.add(element2);
        elementList.add(element3);
        elementList.add(element4);
        elementList.add(element5);
        elementList.add(element6);
        elementList.add(element7);
        elementList.add(element8);


        handleResponse(elementList);
    }

    private void handleResponse(ArrayList<ElementModel> elementModelList){

        //RecyclerView

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(this,elementModelList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}