package com.example.user.contractawardlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ContractsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contracts_list);

        PopulateContracts populateContracts = new PopulateContracts();
        ArrayList<Contract> list = populateContracts.getList();

        ContractsAdapter contractsAdapter = new ContractsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(contractsAdapter);
    }

}
