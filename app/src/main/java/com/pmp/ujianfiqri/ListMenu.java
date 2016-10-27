package com.pmp.ujianfiqri;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.pmp.ujianfiqri.adapter.Product;
import com.pmp.ujianfiqri.adapter.ProductListAdapter;
import com.pmp.ujianfiqri.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOCHAMMAD FIQRI J-PC on 27/10/2016.
 */

public class ListMenu extends AppCompatActivity {

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products;
    ProductListAdapter productListAdapter;
    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }




    private void setProducts() {

        Product product1 = new Product(1, "Paket 1", "Nasi, Ayam Goreng, Caca Cala", 23000);
        Product product2 = new Product(2, "Paket 2", "Nasi, Ayam Goreng, Telur, Caca Cala", 27000);
        Product product3 = new Product(3, "Paket 3", "Nasi, Ayam Goreng, Dessert, Caca Cala", 27000);
        Product product4 = new Product(4, "Paketrok", "Ayam Goreng Aja", 15000);
        Product product5 = new Product(5, "Paket Hemat", "Ayam dan Aqua", 20000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

    }
}
