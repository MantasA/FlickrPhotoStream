package lt.toochka.photostream;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import lt.toochka.photostream.activities.BaseActivity;

/**
 * @author Toochka
 */
public class PhotoStreamActivity extends BaseActivity {
    private SearchView mSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_stream);

        initUI();
        initValues();
        initListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.photo_stream, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        mSearchView = (SearchView) menu.findItem(R.id.actionSearch).getActionView();
        mSearchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.actionSearch) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void initUI() {
    }

    @Override
    public void initValues() {
        /* empty */
    }

    @Override
    public void initListeners() {
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String pQueryText) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String pQuery) {
                loadData(pQuery);
                return true;
            }

            private void loadData(final String pQueryText) {
                new AsyncTask<Void, Void, Void>() {
                    // TODO add some stuff

                    @Override
                    protected Void doInBackground(final Void... pVoids) {
                        return null;
                    }

                    @Override
                    protected void onPostExecute(final Void pResult) {

                    }
                }.execute();
            }
        });
    }
}
