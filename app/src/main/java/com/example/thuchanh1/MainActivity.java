package com.example.thuchanh1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<SanPham > listSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        listSanPham=new ArrayList<>();
        listSanPham.add(new SanPham("Xiaomi Mi 10",12000000,R.drawable.xiaomi_mi10));
        listSanPham.add(new SanPham("Iphone X",19000000,R.drawable.iphonex));
        listSanPham.add(new SanPham("Iphone 11",23000000,R.drawable.iphone_11));
        listSanPham.add(new SanPham("Xiaomi black shark 3",14000000,R.drawable.black_sharp3));
        listSanPham.add(new SanPham("Samsung galaxy s10",14000000,R.drawable.galaxy_s10));
        listSanPham.add(new SanPham("Oppo reno 3",10000000,R.drawable.oppo));
        listSanPham.add(new SanPham("Samsung note 10",14000000,R.drawable.samsungnote10));
        listSanPham.add(new SanPham("Iphone 8",17000000,R.drawable.iphone8));
        sanPhamAdapter=new SanPhamAdapter(getApplicationContext(),listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }
}
