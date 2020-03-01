package com.sell.retrofit_example;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.sell.retrofit_example.connection.GetApiDataService;
import com.sell.retrofit_example.connection.RetrofitInstance;
import com.sell.retrofit_example.models.SingleCateApiResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
                    /**key value Body**/
    // URL:  http://dighighs.com/aladjitest1/api/single_cate_product?list=headphone
    /*{
        "list":"headphone"
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_click = findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callProductDetails("headphone");
            }
        });

    }
    private  void callProductDetails(String list){
        GetApiDataService service = RetrofitInstance.getRetrofitInstance().create(GetApiDataService.class);
        Call<SingleCateApiResponse> responseCall = service.callSingleCat(list);
        responseCall.enqueue(new Callback<SingleCateApiResponse>() {
            @Override
            public void onResponse(Call<SingleCateApiResponse> call, Response<SingleCateApiResponse> response) {
                if(response.isSuccessful()){
                    SingleCateApiResponse singleCateApiResponse = response.body();
                    String dataStatus = singleCateApiResponse.getMessage();
                    if(dataStatus.equals("Data found")) {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, singleCateApiResponse.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "try again...", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SingleCateApiResponse> call, Throwable t) {
                call.cancel();
                Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
