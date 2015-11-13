package tbilisi.devfest.geolab.fcbarcelona;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);

        ArrayList <BarcaModel> barcaModels = new ArrayList<>();
        for (int i = 0; i < Database.name.length; i++) {
            BarcaModel model = new BarcaModel(Database.image[i],Database.number[i],Database.age[i],Database.height[i],Database.description[i],Database.position[i], Database.birthPlace[i],Database.name[i]);

            barcaModels.add(model);

        }

        BarcaAdapter adapter = new BarcaAdapter(this,barcaModels);

        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BarcaModel model = (BarcaModel) parent.getAdapter().getItem(position);

                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("model", model);
                startActivity(intent);

            }
        });


    }
}
