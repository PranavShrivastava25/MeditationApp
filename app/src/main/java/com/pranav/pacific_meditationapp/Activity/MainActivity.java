package com.pranav.pacific_meditationapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pranav.pacific_meditationapp.Adapter.foryourmoodAdapter;
import com.pranav.pacific_meditationapp.Adapter.madeforyouAdapter;
import com.pranav.pacific_meditationapp.Domain.foryourmoodDomain;
import com.pranav.pacific_meditationapp.Domain.madeforyouDomain;
import com.pranav.pacific_meditationapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter1,adapter2;
    private RecyclerView foryourmoodList,madeforyouList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerViewforyourmood();
        recyclerViewmadeforyou();

    }

    private void recyclerViewforyourmood(){
        LinearLayoutManager LinearLayoutManager= new LinearLayoutManager(this,androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,false);
        foryourmoodList= findViewById(R.id.recview1);
        foryourmoodList.setLayoutManager(LinearLayoutManager);
        ArrayList<foryourmoodDomain> foryourmood = new ArrayList<>();
        foryourmood.add(new foryourmoodDomain("Sleep Sounds","foryourmood1"));
        foryourmood.add(new foryourmoodDomain("Inner Self","foryourmood2"));
        foryourmood.add(new foryourmoodDomain("Around the world","foryourmood3"));
        foryourmood.add(new foryourmoodDomain("Into the wilds","foryourmood4"));
        foryourmood.add(new foryourmoodDomain("Lovely landscapes","foryourmood5"));
        foryourmood.add(new foryourmoodDomain("Temples of India","foryourmood6"));
        foryourmood.add(new foryourmoodDomain("Architectural Site","foryourmood7"));
        foryourmood.add(new foryourmoodDomain("Places of energy","foryourmood8"));
        foryourmood.add(new foryourmoodDomain("Divine Powers","foryourmood9"));
        foryourmood.add(new foryourmoodDomain("Blissful experiences","foryourmood10"));
        foryourmood.add(new foryourmoodDomain("Meditative energy","foryourmood11"));
        foryourmood.add(new foryourmoodDomain("Beautiful places","foryourmood12"));

        adapter1= new foryourmoodAdapter(foryourmood);
        foryourmoodList.setAdapter(adapter1);


    }

    private void recyclerViewmadeforyou(){
        LinearLayoutManager LinearLayoutManager= new LinearLayoutManager(this,androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,false);
        madeforyouList= findViewById(R.id.recview2);
        madeforyouList.setLayoutManager(LinearLayoutManager);
        ArrayList<madeforyouDomain> madeforyou = new ArrayList<>();
        madeforyou.add(new madeforyouDomain("New Meditation Course $15 \nRating : 10","foryourmood10"));
        madeforyou.add(new madeforyouDomain("Yoga & asanas Course $12 \nRating : 9.8","foryourmood9"));
        madeforyou.add(new madeforyouDomain("Basic Binaural beats $10 \nRating : 9.5","foryourmood8"));
        madeforyou.add(new madeforyouDomain("Personality Development $20 \nRating : 10","foryourmood7"));
        madeforyou.add(new madeforyouDomain("Travel Documentary $25 \nRating : 8.5","foryourmood6"));



        adapter2= new madeforyouAdapter(madeforyou);
        madeforyouList.setAdapter(adapter2);


    }
}