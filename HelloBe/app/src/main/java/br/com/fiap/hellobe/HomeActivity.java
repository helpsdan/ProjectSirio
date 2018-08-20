package br.com.fiap.hellobe;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mDrawerLayout = findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        if(id == R.id.nav_chat){
            Intent it = new Intent(this, ChatActivity.class);
            startActivity(it);
            return true;
        }
        if(id == R.id.nav_dashboard){
            Intent it = new Intent(this, DashboardActivity.class);
            startActivity(it);
            return true;
        }
        if(id == R.id.nav_settings){
            Intent it = new Intent(this, SettingsActivity.class);
            startActivity(it);
            return true;
        }
        if(id == R.id.nav_profile){
            Intent it = new Intent(this, ProfileActivity.class);
            startActivity(it);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
