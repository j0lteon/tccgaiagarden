package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.pdmo.navegador.navegadorweb.gaiagarden.databinding.ActivityProdutocontentDetailBinding;

public class ProdutoContentDetailHostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     ActivityProdutocontentDetailBinding binding = ActivityProdutocontentDetailBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_produtocontent_detail);
        NavController navController = navHostFragment.getNavController();
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.
                Builder(navController.getGraph())
                .build();

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_produtocontent_detail);
        return navController.navigateUp() || super.onSupportNavigateUp();
    }
}