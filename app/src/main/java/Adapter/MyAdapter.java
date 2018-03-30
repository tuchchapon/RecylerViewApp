package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ongor1.recylerviewapp.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by ongor1 on 2/23/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

       private Context context;
       private List<ListItem> listItems;

       public MyAdapter(Context context, List listItems){
           this.context = context;
           this.listItems = listItems;
       }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
           View view = LayoutInflater.from(parent.getContext())
                   .inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
           ListItem item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.description.setText("Description");

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
           public TextView name;
           public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.title);
            description = (TextView)itemView.findViewById(R.id.description);
        }
    }
}
