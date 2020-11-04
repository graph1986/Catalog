package com.example.catalog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    List<Category> categories;
      List<Product> products;
    Category fruits =new Category(0,-1,"Фрукты",categories,null);
    Category vegetables =new Category(1,-1,"Овощи",categories,null);
    Category furnitures =new Category(2,-1,"Мебель", categories,null);
    Category electronics=new Category(3,-1,"Электроника",categories,null);
    Category cars=new Category(4,-1,"Машины",categories,null);
    Category citrusFruits=new Category(5,0,"Цитрусовые",categories,products);
    Category applesFruits=new Category(6,0,"Яблоки",categories,products);
    Category cucumbersVeg=new Category(7,1,"Огурцы",categories,products);
    Category legumesVeg=new Category(8,1,"Бобовые",categories,products);
    Category bedsFur=new Category(9,2,"Кровати",categories,products);
    Category wardrobesFur=new Category(10,2,"Шкафы",categories,products);
    Category telephoneElec=new Category(11,3,"Телефоны",categories,products);
    Category tvElec=new Category(12,3,"Телевизоры",categories,products);
    Category vazCar= new Category(13,4,"Говноавто",categories,products);
    Category mazdaCar=new Category(14,4,"Мазда",categories,products);
    Product orange=new Product("Апельсин",0,5);
    Product lime=new Product("Лайм",1,5);
    Product granny=new Product("Гренни",2,6);
    Product antonowka=new Product("Антоновка",3,6);
    Product mediumCuc=new Product("Среднеплодные",4,7);
    Product longCuc=new Product("Длиноплодные",5,7);
    Product pea=new Product("Бобы",6,8);
    Product chickpea=new Product("Нут",7,8);
    Product sofa =new Product("Диван",8,9);
    Product hammock=new Product("Гамак",9,9);
    Product wardrobe= new Product("Шкаф",10,10);
    Product pedestal =new Product("Тумба",11,10);
    Product iphone12Pro =new Product("Айфоша12ПроУльтраМакси",12,11);
    Product xiaomi9T=new Product("ХуйняБракованнаяКитайская",13,11);
    Product samsung80Di=new Product("СамсунгДиоганаль80",14,12);
    Product sony50Di=new Product("СониДиоганаль50",15,12);
    Product vaz2110Dermo=new Product("ДерьмищеДесятое",16,13);
    Product vaz2109Dermo=new Product("ДерьмищеДевятое",17,13);
    Product mazda3=new Product("Мазда3",18,14);
    Product mazda6=new Product("Мазда6",19,14);
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.linear);
        categories=new ArrayList<>();
        products=new ArrayList<>();
        categories.add(fruits);
        categories.add(vegetables);
        categories.add(furnitures);
        categories.add(electronics);
        categories.add(cars);
        categories.add(citrusFruits);
        categories.add(applesFruits);
        categories.add(cucumbersVeg);
        categories.add(legumesVeg);
        categories.add(bedsFur);
        categories.add(wardrobesFur);
        categories.add(telephoneElec);
        categories.add(tvElec);
        categories.add(vazCar);
        categories.add(mazdaCar);
        products.add(orange);
        products.add(lime);
        products.add(granny);
        products.add(antonowka);
        products.add(mediumCuc);
        products.add(longCuc);
        products.add(pea);
        products.add(chickpea);
        products.add(sofa);
        products.add(hammock);
        products.add(wardrobe);
        products.add(pedestal);
        products.add(iphone12Pro);
        products.add(xiaomi9T);
        products.add(samsung80Di);
        products.add(sony50Di);
        products.add(vaz2109Dermo);
        products.add(vaz2110Dermo);
        products.add(mazda3);
        products.add(mazda6);
        consloe();
    }
void consloe(){
    Random random=new Random();
        for (int i=0;i<100;i++){
            int randomCategories=random.nextInt(5);
            TextView textViewCategories=new TextView(this);
            textViewCategories.setTextColor(Color.RED);
            textViewCategories.setText(categories.get(randomCategories).name);
            linearLayout.addView(textViewCategories);
            int randomSubCategories=random.nextInt(10);
            while (randomSubCategories<10){
                for (int j=0;j<categories.size();j++){
                    if (categories.get(j).getIdParent()==categories.get(randomCategories).getId()){
                        TextView textViewSubCategories=new TextView(this);
                        textViewSubCategories.setTextColor(Color.GREEN);
                        textViewSubCategories.setText("     "+categories.get(j).getName());
                        linearLayout.addView(textViewSubCategories);
                        randomSubCategories++;
                        int randomProducts=random.nextInt(10);
                        while (randomProducts<10){
                            for (int h=0;h<products.size();h++){
                                if (products.get(h).getIdParent()==categories.get(j).getId()){
                                    TextView textViewProduct =new TextView(this);
                                    textViewProduct.setTextColor(Color.BLUE);
                                    textViewProduct.setText("            "+products.get(h).getName());
                                    linearLayout.addView(textViewProduct);
                                    randomProducts++;
                                }
                            }
                        }
                    }
                }
            }

        }
}

}