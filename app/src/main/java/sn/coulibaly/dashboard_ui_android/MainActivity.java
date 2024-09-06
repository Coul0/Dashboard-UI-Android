package sn.coulibaly.dashboard_ui_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;

/**
 *  C'est un Dashboard très jolie , bref vous pouvez l'utiliser dans vos projet. C'est gratos, c'est bénéf 👌
 *  https://github.com/Coul0
 *  https://github.com/dtc221
 *  Chaine Youtube 🤙 https://www.youtube.com/@dtclab221
 */

public class MainActivity extends AppCompatActivity {

    private Menu menu;
    Toolbar mToolbar;
    AppBarLayout mAppBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList < SlideModel > slideModels = new ArrayList < SlideModel > ();

        slideModels.add(new SlideModel(R.drawable.film, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.gift, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.caffee, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.link, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.card, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.delivery, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu;
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu_trois_points, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.paramètres) {
            return true;
        } else if (id == R.id.action_info) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}