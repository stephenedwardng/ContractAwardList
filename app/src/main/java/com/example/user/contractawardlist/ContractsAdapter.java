package com.example.user.contractawardlist;

/**
 * Created by user on 07/07/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class ContractsAdapter extends ArrayAdapter<Contract> {

    public ContractsAdapter(Context context, ArrayList<Contract> contracts) {
        super(context, 0, contracts);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.contracts_item, parent, false);
        }

        Contract currentContract = getItem(position);

        TextView strategicImportanceRating = (TextView) listItemView.findViewById(R.id.strategicImportanceRating);
        strategicImportanceRating.setText(currentContract.getStrategicImportanceRating().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentContract.getTitle());

        TextView status = (TextView) listItemView.findViewById(R.id.status);
        status.setText(currentContract.getStatus().toString());

        listItemView.setTag(currentContract);

        return listItemView;
    }

}
