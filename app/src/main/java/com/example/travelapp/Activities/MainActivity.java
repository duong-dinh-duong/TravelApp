package com.example.travelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travelapp.Adapters.CategoryAdapter;
import com.example.travelapp.Adapters.PopularAdapter;
import com.example.travelapp.Domains.CategoryDomain;
import com.example.travelapp.Domains.PopularDomain;
import com.example.travelapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterCat;
    private RecyclerView recyclerViewPopular, recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Mar caible, avendia lago","Miami Beach","This 2 /1 bath home boasts an enormous," +
                "open-living plan , accented by striking "
                +"architectural features and high-end finishes. "
                +"Feel inspired by open sight lines that "
                +"embrace the outdoors , crowned by stunning coffered ceilings.",2,true,4.8,"pic1",true,1000));
        items.add(new PopularDomain("Passo rolle , TN","Hawaii Beach","This 2 /1 bath home boasts an enormous," +
                "open-living plan , accented by striking "
                +"architectural features and high-end finishes. "
                +"Feel inspired by open sight lines that "
                +"embrace the outdoors , crowned by stunning coffered ceilings.",1,false,5,"pic2",false,2500));
        items.add(new PopularDomain("Mar caible, avendia lago","Miami Beach","This 2 /1 bath home boasts an enormous," +
                "open-living plan , accented by striking "
                +"architectural features and high-end finishes. "
                +"Feel inspired by open sight lines that "
                +"embrace the outdoors , crowned by stunning coffered ceilings.",3,true,4.3,"pic3",true,30000));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular = new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

        ArrayList<CategoryDomain> catsList =new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1"));
        catsList.add(new CategoryDomain("Camps","cat2"));
        catsList.add(new CategoryDomain("Forest","cat3"));
        catsList.add(new CategoryDomain("Desert","cat4"));
        catsList.add(new CategoryDomain("Mountain","cat5"));

        recyclerViewCategory =findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat = new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);


    }
}