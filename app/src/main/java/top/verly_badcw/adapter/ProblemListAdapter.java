package top.verly_badcw.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import top.verly_badcw.androidoj.R;
import top.verly_badcw.util.ProblemInfo;
import top.verly_badcw.util.ProblemList;

import static top.verly_badcw.InJavaResources.ACCEPTED_STATUS;
import static top.verly_badcw.InJavaResources.INTNULL;
import static top.verly_badcw.InJavaResources.JUDGING_STATUS;
import static top.verly_badcw.InJavaResources.PENDING_STATUS;

public class ProblemListAdapter extends RecyclerView.Adapter<ProblemListAdapter.ViewHolder> {

    private Context context;
    private List<ProblemInfo> list;

    public ProblemListAdapter(Context context) {
        this.context = context;
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
    }

    public void addAll(Collection<? extends ProblemInfo> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.problem_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ProblemInfo problemInfo = list.get(i);
        viewHolder.id.setText(problemInfo.get_id());
        viewHolder.item.setText(problemInfo.getTitle());
        viewHolder.submitStatus.setText(String.format(Locale.CHINA, "%d/%d", problemInfo.getAccepted_number(), problemInfo.getSubmission_number()));
        int status = problemInfo.getMy_status();
        if (status == ACCEPTED_STATUS) {
            viewHolder.img.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_ac));
        } else if (status == PENDING_STATUS || status == JUDGING_STATUS || status == INTNULL) {
            viewHolder.img.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_faq));
        } else {
            viewHolder.img.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_wa));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView item;
        private final ImageView img;
        private final TextView submitStatus;
        private final TextView id;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.problem_list_item);
            img = (ImageView) itemView.findViewById(R.id.problem_solved);
            submitStatus = ((TextView) itemView.findViewById(R.id.problem_status_info));
            id = (TextView) itemView.findViewById(R.id.problem_id);
        }
    }
}
