package top.verly_badcw.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import top.verly_badcw.androidoj.R;

public class ProblemListAdapter extends RecyclerView.Adapter<ProblemListAdapter.ViewHolder> {

    private Context context;
    private List<String> list;

    public ProblemListAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.problem_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.item.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.problem_list_item);
        }
    }
}
