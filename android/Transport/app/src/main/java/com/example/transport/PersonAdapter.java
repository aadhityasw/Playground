package com.example.transport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>
{
    private ArrayList<Person> people;
    ItemClicked activity;

    public interface  ItemClicked
    {
        void onItemClicked(int index);
    }

    public PersonAdapter(Context context, ArrayList<Person> list)
    {
        people = list;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView ivPref;
        TextView tvName, tvSurname;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvSurname = itemView.findViewById(R.id.tvSurname);
            ivPref = itemView.findViewById(R.id.ivPref);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    activity.onItemClicked(people.indexOf((Person) itemView.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(people.get(i));
        viewHolder.tvName.setText(people.get(i).getName());
        viewHolder.tvSurname.setText(people.get(i).getSurname());

        if(people.get(i).getPreference().equalsIgnoreCase("bus"))
        {
            viewHolder.ivPref.setImageResource(R.drawable.bus);
        }
        else if(people.get(i).getPreference().equalsIgnoreCase("car"))
        {
            viewHolder.ivPref.setImageResource(R.drawable.car);
        }
        else if(people.get(i).getPreference().equalsIgnoreCase("flight"))
        {
            viewHolder.ivPref.setImageResource(R.drawable.flight);
        }
        else if(people.get(i).getPreference().equalsIgnoreCase("train"))
        {
            viewHolder.ivPref.setImageResource(R.drawable.train);
        }
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
