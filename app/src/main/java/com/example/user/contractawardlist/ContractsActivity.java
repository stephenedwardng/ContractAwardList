package com.example.user.contractawardlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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

    public void getContract(View listItem){
        Contract movie = (Contract) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked");
        sb.append(movie.getTitle());

        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
//        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
//
//        //snackbar.setAction("Say Hello", this);
//
//        snackbar.show();

    }

}
