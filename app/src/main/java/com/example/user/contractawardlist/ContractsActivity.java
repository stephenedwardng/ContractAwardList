package com.example.user.contractawardlist;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ContractsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contracts);

        PopulateContracts populateContracts = new PopulateContracts();
        ArrayList<Contract> list = populateContracts.getList();

        ContractsAdapter movieAdapter = new ContractsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(movieAdapter);
    }

    public void getContract(View listItem){
        Contract contract = (Contract) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked");
        sb.append(contract.getTitle());

//        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
//
//        snackbar.show();

    }

}
