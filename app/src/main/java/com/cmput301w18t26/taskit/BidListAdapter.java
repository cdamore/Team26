package com.cmput301w18t26.taskit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Brady on 2018-03-10.
 */

public class BidListAdapter extends ArrayAdapter<Bid> {
    private final Activity context;

    /**
     * Constructor for subscription adapter
     *
     * @param context activity
     * @param bids current subscription
     */

    public BidListAdapter(Activity context, BidList bids) {
        super(context, R.layout.list_single, bids.getBids()); //TODO list_single? check that
        this.context = context;
    }

    /**
     * Overridden method to set values for name, date, and charge in the textview
     *
     * @param position position of current subscription
     * @param convertView the current virw (textview)
     * @param parent parent of textview
     * @return
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtName = (TextView) rowView.findViewById(R.id.txt_name);
        TextView txtDate = (TextView) rowView.findViewById(R.id.txt_date);
        TextView txtCharge= (TextView) rowView.findViewById(R.id.txt_charge);

        // Replace text with my own
        txtName.setText(getItem(position).getUser());
        txtDate.setText(getItem(position).getOwner()); // TODO choose better fields to display
        txtCharge.setText(Double.toString(getItem(position).getAmount()));

        return rowView;
    }
}
