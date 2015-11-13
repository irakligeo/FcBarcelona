package tbilisi.devfest.geolab.fcbarcelona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        BarcaModel model = (BarcaModel) getIntent().getSerializableExtra("model");

        ImageView image = (ImageView) findViewById(R.id.list_image_id);
        TextView name = (TextView) findViewById(R.id.list_name_id);
        TextView age = (TextView) findViewById(R.id.list_age_id);
        TextView height = (TextView) findViewById(R.id.list_height_id);
        TextView birtplace = (TextView) findViewById(R.id.list_birthPlace_id);
        TextView position = (TextView) findViewById(R.id.list_position_id);
        TextView number = (TextView) findViewById(R.id.list_number_id);
        TextView description = (TextView) findViewById(R.id.detail);


        Picasso.with(this)
                .load(model.getImage())
                .resize(120, 120)
                .centerCrop()
                .into(image);

        name.setText(model.getName());
        age.setText(String.valueOf(model.getAge()));
        height.setText(String.valueOf(model.getHeight()));
        birtplace.setText(model.getBirthPlace());
        position.setText(model.getPosition());
        number.setText(String.valueOf(model.getNumber()));
        description.setText(model.getDescription());
    }
}
