package com.blueroofstudio.materialdesignapp.providers;

import com.blueroofstudio.materialdesignapp.R;
import com.blueroofstudio.materialdesignapp.models.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitDataProvider {

    private List<Fruit> list;

    public FruitDataProvider() {
        list = new ArrayList<>();
        list.add(new Fruit("Клубника", R.drawable.strawberry));
        list.add(new Fruit("Малина", R.drawable.raspberry));
        list.add(new Fruit("Лимон", R.drawable.lemon));
        list.add(new Fruit("Апельсин", R.drawable.orange));
        list.add(new Fruit("Мандарин", R.drawable.tangerine));
        list.add(new Fruit("Киви", R.drawable.kiwi));
        list.add(new Fruit("Голубика", R.drawable.blueberry));
        list.add(new Fruit("Ананас", R.drawable.pineapple));
        list.add(new Fruit("Манго", R.drawable.mango));
        list.add(new Fruit("Арбуз", R.drawable.watermelon));
    }

    public List<Fruit> getList() {
        return list;
    }
}
