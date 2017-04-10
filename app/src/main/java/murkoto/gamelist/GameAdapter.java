package murkoto.gamelist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by WIN10 on 06/04/2017.
 */

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder>{

    public interface OnItemClickListener {
        void onItemClick(Game game);
    }

    ArrayList<Game> games;
    Context context;
    OnItemClickListener listener;

    public GameAdapter(ArrayList<Game> games, Context context, OnItemClickListener listener) {
        this.games = games;
        this.context = context;
        this.listener = listener;
    }



    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GameViewHolder holder, int position) {
        holder.bind(games.get(position),listener);

    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    class GameViewHolder extends RecyclerView.ViewHolder {

        private TextView titleView;
        private TextView developerView;
        private TextView genreView;
        private TextView yearView;
        private TextView scoreView;

        public GameViewHolder(View view) {
            super(view);

            titleView = (TextView) itemView.findViewById(R.id.game_title);
            developerView = (TextView) itemView.findViewById(R.id.game_developer);
            yearView = (TextView) itemView.findViewById(R.id.game_year);

        }

        public void bind(final Game game, final OnItemClickListener listener) {
            titleView.setText(game.getTitle());
            developerView.setText(game.getDeveloper());
            yearView.setText(game.getYear());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(game);
                }
            });
        }

        public TextView getTitleView() {
            return titleView;
        }

        public void setTitleView(TextView titleView) {
            this.titleView = titleView;
        }

        public TextView getDeveloperView() {
            return developerView;
        }

        public void setDeveloperView(TextView developerView) {
            this.developerView = developerView;
        }

        public TextView getGenreView() {
            return genreView;
        }

        public void setGenreView(TextView genreView) {
            this.genreView = genreView;
        }

        public TextView getYearView() {
            return yearView;
        }

        public void setYearView(TextView yearView) {
            this.yearView = yearView;
        }

        public TextView getScoreView() {
            return scoreView;
        }

        public void setScoreView(TextView scoreView) {
            this.scoreView = scoreView;
        }
    }

}
