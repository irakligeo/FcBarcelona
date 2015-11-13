package tbilisi.devfest.geolab.fcbarcelona;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by GeoLab on 11/12/15.
 */
public class BarcaAdapter extends BaseAdapter{
    private ArrayList<BarcaModel> models;
    private Context context;

    public BarcaAdapter(Context context,ArrayList<BarcaModel>models) {
        this.context=context;
        this.models=models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        viewHolder holder = null;

        if(convertView == null){
            itemView= View.inflate(context,R.layout.list_item,null);

            holder = new viewHolder();

            ImageView image = (ImageView) itemView.findViewById(R.id.list_image_id);
            TextView name = (TextView) itemView.findViewById(R.id.list_name_id);
            TextView age = (TextView) itemView.findViewById(R.id.list_age_id);
            TextView height = (TextView) itemView.findViewById(R.id.list_height_id);
            TextView birthPlace = (TextView) itemView.findViewById(R.id.list_birthPlace_id);
            TextView pozicia = (TextView) itemView.findViewById(R.id.list_position_id);
            TextView number = (TextView) itemView.findViewById(R.id.list_number_id);

            holder.imageView=image;
            holder.name=name;
            holder.age=age;
            holder.height=height;
            holder.birthPlace=birthPlace;
            holder.pozicia=pozicia;
            holder.number=number;

            itemView.setTag(holder);

        }
        else {
            itemView = convertView;
            holder = (viewHolder)itemView.getTag();
        }


        BarcaModel model = (BarcaModel) getItem(position);
        Picasso.with(context)
                .load(model.getImage())
                .resize(120, 120)
                .centerCrop()
                .into(holder.imageView);

        holder.name.setText(model.getName());
        holder.age.setText(String.valueOf(model.getAge()));
       holder.height.setText(String.valueOf(model.getHeight()));
        holder.birthPlace.setText(model.getBirthPlace());
        holder.pozicia.setText(model.getPosition());
       holder.number.setText(String.valueOf(model.getNumber()));



        return itemView;
    }
    private  class viewHolder {
        ImageView imageView;
        TextView name, age, height, birthPlace, pozicia, number;
    }
}
