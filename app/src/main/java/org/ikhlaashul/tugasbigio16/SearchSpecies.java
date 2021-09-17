package org.ikhlaashul.tugasbigio16;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.ikhlaashul.tugasbigio16.models.*;
import org.ikhlaashul.tugasbigio16.rest.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchSpecies extends AppCompatActivity
{
    EditText edSearch;
    TextView txtResult;
    Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle("Species");
        setContentView(R.layout.activity_species);

        edSearch = (EditText) findViewById(R.id.edSearch);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnSearch = (Button) findViewById(R.id.btnSearch);

    }

    public void btnSearch_onClick(View v)
    {

        searchPeople(edSearch.getText().toString());
    }

    private void searchPeople(String tagword)
    {

        Call<SpeciesResults> call = APIClient.get().searchSpecies(tagword);

        call.enqueue(new Callback<SpeciesResults>()
        {
            @Override
            public void onFailure(Call<SpeciesResults> call, Throwable t)
            {
                txtResult.setText("An error ocurred: " + t.toString());
                edSearch.setText("");
            }

            @Override
            public void onResponse(Call<SpeciesResults> call, Response<SpeciesResults> response)
            {


                Log.d("APIPlug", "Successfully response fetched" );
                edSearch.setText("");
                SpeciesResults species = response.body();

                if(species.results.size() > 0)
                    txtResult.setText(species.results.get(0).toString());
                else
                    txtResult.setText("Your request was not found!");

            }
        });
    }
}